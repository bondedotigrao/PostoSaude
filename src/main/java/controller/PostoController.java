package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.PostoModel;
import model.classes.Posto;

@ManagedBean
@SessionScoped
public class PostoController {

    PostoModel po = new PostoModel();

    public void registrarPosto(Posto posto) {
        po.cadastrarPosto(posto);
    }

    public void removerPaciente(Posto posto) {
        po.removerPosto(posto);
    }

    public void alterarPosto(Posto posto) {
        po.alterarPosto(posto);
    }

    public Posto recuperarID(Integer codigo) {
        return po.recuperar(codigo);
    }

    public List<Posto> recuperarTodos() {
        return po.RecuperarTodos();
    }

}
