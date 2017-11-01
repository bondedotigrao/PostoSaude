
package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Endereco;
import model.EnderecoModel;

@ManagedBean
@SessionScoped
public class EnderecoController {
    
    EnderecoModel em = new EnderecoModel();
    
    public void registrarEndereco(Endereco endereco) {
        em.inserir(endereco);
    }

    public void removerEndereco(Endereco endereco) {
        em.deletar(endereco);
    }

    public void alterarEndereco(Endereco endereco) {
         em.alterar(endereco);
    }

    public Endereco recuperarID(int codigo) {
       return em.recupera(codigo);
    }

    public List<Endereco> recuperarTodos() {
        return em.listarTodos();
    }
    
    
}
