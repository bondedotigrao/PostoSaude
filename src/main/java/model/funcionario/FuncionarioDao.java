
package model.funcionario;


public interface FuncionarioDao extends Dao<FuncionarioSaude> {
    
    public FuncionarioSaude RecuperaCpf(String cpf);
    
}
