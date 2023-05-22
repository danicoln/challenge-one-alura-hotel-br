package domain.reserva;

import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ReservaService {

    private ReservaDao reservaDao;

    public ReservaService() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.reservaDao = new ReservaDao(connection);
    }

    public void salvar(Reserva reserva){
        this.reservaDao.salvar(reserva);

    }
}
