package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.classes.Paciente;


@ManagedBean
@SessionScoped
public class loginController {
    
    private Paciente pacienteLogado = null;

        public Paciente getPacienteLogado() {
            return pacienteLogado;
        }

        public void setPacienteLogado(Paciente pacienteLogado) {
            this.pacienteLogado = pacienteLogado;
        }

   
    
    
    public String realizarLoginPaciente(String login,String senha){
        
        List<Paciente> paciente = new PacienteController().recuperarTodos();
        
        for(Paciente p: paciente){
            if(p.getCpf().equals(login)){
                if(p.getSenha().equals(senha)){
                    this.pacienteLogado = p;
                }
                break;
            }
        }
        
        
        if(pacienteLogado==null){
           FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        ("Não existe esse login!"));
            
            return null;
        }else{
            return "menuPaciente.xhtml";
        }
    }
    
    
}
    

