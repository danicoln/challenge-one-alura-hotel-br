package domain.hospede;

import java.sql.*;

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
}
