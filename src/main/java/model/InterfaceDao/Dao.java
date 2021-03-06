package model.InterfaceDao;

import java.util.List;

public interface Dao<D> {

    public void inserir(D d);

    public void alterar(D d);

    public D recuperar(int codigo);

    public void deletar(D d);

    public List<D> listarTodos();

}
