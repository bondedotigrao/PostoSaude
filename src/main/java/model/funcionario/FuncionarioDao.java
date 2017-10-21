
package model.funcionario;


public interface FuncionarioDao extends Dao<FuncionarioSaude> {
    
    public FuncionarioSaude recuperaCpf(String cpf);
    public FuncionarioSaude recuperaCodigo(int codigo);
    
    
}
