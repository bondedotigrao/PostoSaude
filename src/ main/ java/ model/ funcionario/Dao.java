
package model.funcionario;

import java.util.List;

//Dao generico
public interface Dao <D>{
    
    public void inserir(D d);

    public void atualizar(D d);

    public void deletar(D d);
    
    public D recuperar(int codigo);
    
    public List<D> listarTodos(D d);

}
