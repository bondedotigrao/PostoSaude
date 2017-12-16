package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.PostoModel;
import model.classes.Posto;

@ManagedBean
@ViewScoped
public class PostoController {

  
    
    private PostoModel instance ;
    private Posto cadPosto;
    private Posto selectdPosto;
    
    public PostoController() {
       this.instance = new PostoModel();   
       this.cadPosto = new Posto();
       this.selectdPosto = new Posto();
    }
    public String registrarPosto() {
       this.instance.cadastrarPosto(this.cadPosto);
       this.cadPosto = new Posto();
        FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        ("Posto Cadastrado com sucesso!"));
       
        return "menuAdm.xhtml";
    }

    public PostoModel getInstance() {
        return instance;
    }

    public void setInstance(PostoModel instance) {
        this.instance = instance;
    }

    public Posto getCadPosto() {
        return cadPosto;
    }

    public void setCadPosto(Posto cadPosto) {
        this.cadPosto = cadPosto;
    }

    public Posto getSelectdPosto() {
        return selectdPosto;
    }

    public void setSelectdPosto(Posto selectdPosto) {
        this.selectdPosto = selectdPosto;
    }
    

    public void removerPosto() {
        this.instance.removerPosto(selectdPosto);
    }

    public String alterarPosto() {
        this.instance.alterarPosto(selectdPosto);
        return "menuAdm.xhtml";
    }

    public Posto recuperarID(Integer codigo) {
        return this.instance.recuperar(codigo);
    }

    public List<Posto> recuperarTodos() {
        return this.instance.RecuperarTodos();
    }

}
