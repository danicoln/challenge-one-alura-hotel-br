package domain.hospede;

import domain.reserva.Reserva;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospedeDao {

    private Connection connection;

    public HospedeDao(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Hospedes hospedes) {

        try {
            String sql = "INSERT INTO hospedes( nome, sobrenome, data_nasc, nacionalidade, telefone, reserva_id)" +
                    "VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, hospedes.getNome());
                preparedStatement.setString(2, hospedes.getSobrenome());
                preparedStatement.setDate(3, hospedes.getDataNascimento());
                preparedStatement.setString(4, hospedes.getNacionalidade());
                preparedStatement.setString(5, hospedes.getTelefone());
                preparedStatement.setInt(6, hospedes.getReservaId());

                preparedStatement.execute();

                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    while (resultSet.next()) {
                        hospedes.setId(resultSet.getInt(1));
                    }
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Hospedes> listarHospedes() {
        List<Hospedes> hospedes = new ArrayList<>();
        try{
            String sql = "SELECT id, nome, sobrenome, data_nasc, nacionalidade, telefone, reserva_id FROM hospedes";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.execute();

                transformaResultSetEmHospedes(hospedes, preparedStatement);
            }
            return hospedes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Hospedes> buscarPorId(String id) {
        List<Hospedes> hospedes = new ArrayList<>();
        try{
            String sql = "SELECT id, nome, sobrenome, data_nasc, nacionalidade, telefone, reserva_id FROM hospedes WHERE id = ?";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1, id);
                preparedStatement.execute();

                transformaResultSetEmHospedes(hospedes, preparedStatement);
            }
            return hospedes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void transformaResultSetEmHospedes(List<Hospedes> hospedes, PreparedStatement preparedStatement) throws SQLException {

        try(ResultSet resultSet = preparedStatement.getResultSet()){
            while (resultSet.next()){
                Hospedes hospede = new Hospedes(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),resultSet.getDate(4),resultSet.getString(5), resultSet.getString(6), resultSet.getInt(7));
                hospedes.add(hospede);
//                this.connection.close();
            }
        }
    }
}
