/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.funcionario;

import java.util.List;

/**
 *
 * @author Milena Macedo
 */
public interface Dao<D> {

    public void inserir(D d);

    public void alterar(D d);

    public D recuperar(int codigo);

    public void deletar(D d);

    public List<D> listarTodos();

}
