package model.funcionario;

public class FuncionarioSaudeModel {

    Dao<FuncionarioSaude> dao = new FuncionarioHibernate();

    public boolean validarCPF(String cpf) {
        return (cpf.length() == 11);

    }
   
    public void cadastrarFuncSaude(FuncionarioSaude func) {

        if (validarCPF(func.getCpf())) {
            if (((FuncionarioDao) dao).RecuperaCpf(func.getCpf()) != null
                    && (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null)) {
                dao.inserir(func);

            }
        }

    }

    public void alterarFuncSaude(FuncionarioSaude func) {
        if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.alterar(func);
        }
    }

    public void removerFuncSaude(FuncionarioSaude func) {

        if (((FuncionarioDao) dao).RecuperaCodigo(func.getCodigo()) != null) {
            dao.deletar(func);
        }
    }

}
