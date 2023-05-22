package domain.hospede;

import factory.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public class HospedesService {

    private HospedeDao hospedeDao;

    public HospedesService() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.hospedeDao = new HospedeDao(connection);
    }

    public void salvar (Hospedes hospedes) {
        this.hospedeDao.salvar(hospedes);
    }

    public List<Hospedes> buscar() {
        return this.hospedeDao.listarHospedes();
    }

    public List<Hospedes> buscarPorId(String id) {
        return this.hospedeDao.buscarPorId(id);
    }
}