package model.funcionario;

import java.util.List;

public class FuncionarioSaudeModel {

    Dao<FuncionarioSaude> dao = new FuncionarioHibernate();
    ValidarCpf validarCpf = new ValidarCpf();

   
    public void cadastrarFuncSaude(FuncionarioSaude func) {

        //if (validarCpf.isCPF(func.getCpf())) {
            /*if (((FuncionarioDao) dao).RecuperaCpf(func.getCpf()) != null
                    && (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null)) {
                dao.inserir(func);

            }*/
            
            if (!((FuncionarioDao)dao).existe(func)){
                dao.inserir(func);
     //       }
        }

    }

    public void alterarFuncSaude(FuncionarioSaude func) {
        /*if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.alterar(func);
        }*/
        if (((FuncionarioDao) dao).existe(func)){
                dao.alterar(func);
            }
    }

    public void removerFuncSaude(FuncionarioSaude func) {

       /* if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.deletar(func);
        }*/
       if (((FuncionarioDao) dao).existe(func)){
                dao.deletar(func);
            }
    }
    public void recuperar(FuncionarioSaude func){
            if (((FuncionarioDao) dao).existe(func)){
                dao.recuperar(func.getCodigo());
            }
    }  
    public List<FuncionarioSaude> RecuperarTodos(FuncionarioSaude func){
        if (((FuncionarioDao) dao).existe(func)){
               return dao.listarTodos();
            }
        return null;
    }
}
