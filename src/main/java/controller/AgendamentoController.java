
package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.AgendamentoModel;
import model.classes.AgendamentoConsultas;

@ManagedBean
@SessionScoped
public class AgendamentoController {
    AgendamentoModel ac = new AgendamentoModel();
    
    public void registrarPaciente(AgendamentoConsultas agend) {
        ac.cadastrarAgendamento(agend);
    }
    
    public void removerAgendamento(AgendamentoConsultas agend) {
        ac.removerAgendamento(agend);
    }
    
    public void alterarAgendamento(AgendamentoConsultas agend) {
        ac.alterarAgendamento(agend);
    }
    
    public AgendamentoConsultas recuperarID(Integer codigo) {
        return ac.recuperar(codigo);
    }
    
    public List<AgendamentoConsultas> recuperarTodos() {
        return ac.RecuperarTodos();
    }

   public AgendamentoConsultas recuperarData(String data){
       return ac.recuperarData(data);
   }
    
}
