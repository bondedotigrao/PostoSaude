package model;

import model.InterfaceDao.FuncionarioDao;
import model.InterfaceDao.Dao;
import model.hibernate.FuncionarioHibernate;
import java.util.List;
import model.InterfaceDao.PacienteDao;

public class FuncionarioSaudeModel {

    Dao<FuncionarioSaude> dao = new FuncionarioHibernate();

    public void cadastrarFuncSaude(FuncionarioSaude func) {
        if (((FuncionarioDao) dao).recuperaCpf(func.getCpf()) == null) {
            dao.inserir(func);
        }
    }

    public void alterarFuncSaude(FuncionarioSaude func) {
        if (((FuncionarioDao) dao).recuperar(func.getCodigo()) != null) {
            dao.alterar(func);
        }
    }

    public void removerFuncSaude(FuncionarioSaude func) {

        if (((FuncionarioDao) dao).recuperar(func.getCodigo()) != null) {
            dao.deletar(func);

        }
    }

    public FuncionarioSaude recuperar(Integer codigo) {

        if (codigo == null) {
            return null;
        }

        return ((FuncionarioDao) dao).recuperar(codigo);
    }

    public List<FuncionarioSaude> RecuperarTodos() {
        return ((FuncionarioDao) dao).listarTodos();
    }

    public FuncionarioSaude recuperarCpf(String cpf) {
        if (cpf == null) {
            return null;
        }

        return ((FuncionarioDao) dao).recuperaCpf(cpf);
    }

}
