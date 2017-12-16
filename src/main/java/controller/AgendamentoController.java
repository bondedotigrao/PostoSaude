package controller;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import model.AgendamentoModel;
import model.classes.AgendamentoConsultas;
import model.classes.Paciente;

@ManagedBean
@SessionScoped
public class AgendamentoController {
    
    private  AgendamentoModel instance;
    private AgendamentoConsultas CadAgen;
    private AgendamentoConsultas selectdAgend;

    
    
    public AgendamentoController() {
       this.instance = new AgendamentoModel();   
       this.CadAgen = new AgendamentoConsultas();
    }
   
  
    public String registrar() {
        
       Paciente p = (Paciente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("pacienteLogado");

        
        this.CadAgen.setPaciente(p);
        
         this.instance.cadastrarAgendamento(this.CadAgen);
           this.CadAgen = new AgendamentoConsultas();

        return "menuPaciente.xhtml";
    }
    
    

    
    public void removerAgendamento(AgendamentoConsultas agend) {
       instance.removerAgendamento(agend);
    }
    
    public void alterarAgendamento(AgendamentoConsultas agend) {
       instance.alterarAgendamento(agend);
    }
    
    public AgendamentoConsultas recuperarID(Integer codigo) {
        return instance.recuperar(codigo);
    }
    
    public List<AgendamentoConsultas> recuperarTodos() {
        return instance.RecuperarTodos();
    }

   public AgendamentoConsultas recuperarData(String data){
       return instance.recuperarData(data);
   }
    public AgendamentoModel getInstance() {
        return instance;
    }

    public void setInstance(AgendamentoModel instance) {
        this.instance = instance;
    }

    public AgendamentoConsultas getCadAgen() {
        return CadAgen;
    }

    public void setCadAgen(AgendamentoConsultas CadAgen) {
        this.CadAgen = CadAgen;
    }

    public AgendamentoConsultas getSelectdAgend() {
        return selectdAgend;
    }

    public void setSelectdAgend(AgendamentoConsultas selectdAgend) {
        this.selectdAgend = selectdAgend;
    }
}
