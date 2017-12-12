package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.classes.FuncionarioSaude;
import model.FuncionarioSaudeModel;
@ManagedBean
@ViewScoped
public class FuncionarioController {

    private  FuncionarioSaudeModel instance;
    private FuncionarioSaude cadFunc;
    private FuncionarioSaude selectdFunc;
    
    public FuncionarioController() {
       this.instance = new FuncionarioSaudeModel();   
       this.cadFunc = new FuncionarioSaude();
    }
   
  
    public String registrarFuncionarioSaude() {
        this.instance.cadastrarFuncSaude(selectdFunc);
           this.cadFunc = new FuncionarioSaude();

        return "menuAdm.xhtml";
    }

    public FuncionarioSaudeModel getInstance() {
        return instance;
    }

    public void setInstance(FuncionarioSaudeModel instance) {
        this.instance = instance;
    }

    public FuncionarioSaude getCadFunc() {
        return cadFunc;
    }

    public void setCadFunc(FuncionarioSaude cadFunc) {
        this.cadFunc = cadFunc;
    }

    public FuncionarioSaude getSelectdFunc() {
        return selectdFunc;
    }

    public void setSelectdFunc(FuncionarioSaude selectdFunc) {
        this.selectdFunc = selectdFunc;
    }

    
    public void removerFuncionarioSaude(FuncionarioSaude func) {
        instance.removerFuncSaude(func);
    }

    public void alterarFuncionarioSaude(FuncionarioSaude func) {
        instance.alterarFuncSaude(func);
    }

    public FuncionarioSaude recuperarID(Integer codigo) {
         return instance.recuperar(codigo);
    }

    public List<FuncionarioSaude> recuperarTodos() {
        return instance.RecuperarTodos();
    }
}
