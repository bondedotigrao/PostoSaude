package model;

import model.InterfaceDao.FuncionarioDao;
import model.InterfaceDao.Dao;
import model.hibernate.FuncionarioHibernate;
import java.util.List;

public class FuncionarioSaudeModel {

    Dao<FuncionarioSaude> dao = new FuncionarioHibernate();

    public void cadastrarFuncSaude(FuncionarioSaude func) {
        if (((FuncionarioDao)dao).recuperaCpf(func.getCpf()) != null) {
            if (((FuncionarioDao) dao).recuperaCodigo(func.getCodigo()) != null) {
                dao.inserir(func);
            }
        }
    }

    public void alterarFuncSaude(FuncionarioSaude func) {
        /*if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.alterar(func);
        }*/
//        if (((FuncionarioDao) dao).existe(func)){
//                dao.alterar(func);
//            }
    }

    public void removerFuncSaude(FuncionarioSaude func) {

        /* if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.deletar(func);
        }*/
//       if (((FuncionarioDao) dao).existe(func)){
//                dao.deletar(func);
//            }
    }

    public void recuperar(FuncionarioSaude func) {
//            if (((FuncionarioDao) dao).existe(func)){
//                dao.recuperar(func.getCodigo());
//            }
    }

    public List<FuncionarioSaude> RecuperarTodos(FuncionarioSaude func) {
//        if (((FuncionarioDao) dao).existe(func)){
//               return dao.listarTodos();
//            }
        return null;
    }

}
