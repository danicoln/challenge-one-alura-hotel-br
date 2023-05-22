package domain.reserva;

import java.math.BigDecimal;
import java.sql.*;

public class ReservaDao {

    private Connection connection;

    public ReservaDao(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Reserva reserva){

        try{
            String sql = "INSERT INTO reservas (data_entrada, data_saida, valor, forma_pagamento)" +
                    "VALUES(?, ?, ?, ?)";

            try(PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

                preparedStatement.setDate(1, reserva.getDataEntrada());
                preparedStatement.setDate(2, reserva.getDataSaida());
                preparedStatement.setString(3, reserva.getValor());
                preparedStatement.setString(4, reserva.getFormaPagamento());
                preparedStatement.execute();

                try(ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                    while (resultSet.next()){
                        reserva.setId(resultSet.getInt(1));
                    }
                }
            }

        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
