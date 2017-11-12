package model;

import java.util.List;
import model.InterfaceDao.Dao;
import model.InterfaceDao.PostoDao;
import model.classes.Posto;
import model.hibernate.PostoHibernate;

public class PostoModel {

    Dao<Posto> dao = new PostoHibernate();

    public void cadastrarPosto(Posto posto) {
        if (((PostoDao) dao).recuperar(posto.getCodigo()) == null) {
            dao.inserir(posto);
        }
    }

    public void alterarPosto(Posto posto) {
        if (((PostoDao) dao).recuperar(posto.getCodigo()) != null) {
            dao.alterar(posto);
        }
    }

    public void removerPosto(Posto posto) {

        if (((PostoDao) dao).recuperar(posto.getCodigo()) != null) {
            dao.deletar(posto);

        }
    }

    public Posto recuperar(Integer codigo) {

        if (codigo == null) {
            return null;
        }

        return ((PostoDao) dao).recuperar(codigo);
    }

    public List<Posto> RecuperarTodos() {
        return ((PostoDao) dao).listarTodos();
    }

}
