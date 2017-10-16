
package model.funcionario;


public interface FuncionarioDao extends Dao<FuncionarioSaude> {
    
    public void RecuperaCpf(String cpf);
    
}
