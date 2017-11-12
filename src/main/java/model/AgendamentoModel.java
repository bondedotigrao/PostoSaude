package model;

import java.util.List;
import model.InterfaceDao.AgendamentoDao;
import model.InterfaceDao.Dao;
import model.classes.AgendamentoConsultas;
import model.hibernate.AgendamentoHibernate;

public class AgendamentoModel {

    Dao<AgendamentoConsultas> dao = new AgendamentoHibernate();

    public void cadastrarAgendamento(AgendamentoConsultas ac) {
        if (((AgendamentoDao) dao).recuperar(ac.getCodigo()) == null) {
            dao.inserir(ac);
        }
    }

    public void alterarAgendamento(AgendamentoConsultas ac) {
        if (((AgendamentoDao) dao).recuperar(ac.getCodigo()) != null) {
            dao.alterar(ac);
        }
    }

    public void removerAgendamento(AgendamentoConsultas ac) {

        if (((AgendamentoDao) dao).recuperar(ac.getCodigo()) != null) {
            dao.deletar(ac);

        }
    }

    public AgendamentoConsultas recuperar(Integer codigo) {

        if (codigo == null) {
            return null;
        }

        return ((AgendamentoDao) dao).recuperar(codigo);
    }
    public AgendamentoConsultas recuperarData(String data) {

        if (data == null) {
            return null;
        }

        return ((AgendamentoDao) dao).procurarData(data);
    }

    public List<AgendamentoConsultas> RecuperarTodos() {
        return ((AgendamentoDao) dao).listarTodos();
    }

}
