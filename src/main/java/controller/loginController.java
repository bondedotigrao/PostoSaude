package controller;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.classes.Paciente;

@ManagedBean
@SessionScoped
public class loginController {


    public loginController() {
    }

    public Paciente getPacienteLogado() {
        return (Paciente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("pacienteLogado");
    }

    public void setPacienteLogado(Paciente pacienteLogado) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("pacienteLogado", pacienteLogado);
    }

    public String realizarLoginPaciente(String login, String senha) {
        String ret = "";
        List<Paciente> paciente = new PacienteController().recuperarTodos();

        for (Paciente p : paciente) {
            if (p.getCpf().equals(login)) {
                if (p.getSenha().equals(senha)) {
                    this.setPacienteLogado(p);
                    ret = "menuPaciente.xhtml";
                }
                break;

            }
        }

        return ret;
    }

}























































//package controller;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//import model.classes.Paciente;
//
//
//@ManagedBean
//@SessionScoped
//public class loginController {
//    
//    private Paciente pacienteLogado = null;
//
//    public loginController() {
//     pacienteLogado = new Paciente();
//    }
//    
//    
//
//        public Paciente getPacienteLogado() {
//            return pacienteLogado;
//        }
//
//        public void setPacienteLogado(Paciente pacienteLogado) {
//            this.pacienteLogado = pacienteLogado;
//        }
//
//   
//    
//    
//    public String realizarLoginPaciente(String login,String senha){
//        
//        List<Paciente> paciente = new PacienteController().recuperarTodos();
//        
//        for(Paciente p: paciente){
//            if(p.getCpf().equals(login)){
//                if(p.getSenha().equals(senha)){
//                    this.pacienteLogado = p;
//                }
//                break;
//            
//        }
//        }
//        
//        
//        if(pacienteLogado==null){
//          return null;
//        }else{
//            return "menuPaciente.xhtml";
//        }
//    }
//    
////    public String mostrarProfessor(String siape) {
////		String ret = "";
////
////		if (siape != null) {
////			this.setProfessorDetalhado(this..findBySiape(siape));
////			ret = "/restrito/professor/ensino/mostrar.xhtml?faces-redirect=true";
////		}
////
////		return ret;
////	}
//}
//    
//
