package domain.hospede;

import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class HospedesService {

    private HospedeDao hospedeDao;

    public HospedesService() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.hospedeDao = new HospedeDao(connection);
    }

    public void salvar (Hospedes hospedes) {
        this.hospedeDao.salvar(hospedes);
    }
}
