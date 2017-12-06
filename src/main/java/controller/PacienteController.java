package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.classes.Paciente;
import model.PacienteModel;

@ManagedBean
@SessionScoped
public class PacienteController {
    PacienteModel pm = new PacienteModel();
    private Paciente selectdPaciente;
    
    public PacienteController() {
       

    }
    
    
    public void registrarPaciente(Paciente paciente) {
        pm.inserir(paciente);
    }
    
    public void removerPaciente(Paciente paciente) {
        pm.deletar(paciente);
    }
    
    public void alterarPaciente(Paciente paciente) {
        pm.alterar(paciente);
    }
    
    public Paciente recuperarID(Integer codigo) {
        return pm.recupera(codigo);
    }
    
    public List<Paciente> recuperarTodos() {
        return pm.listarTodos();
    }

    public Paciente recuperarCpf(String cpf) {
        return pm.recuperarCpf(cpf);
    }

    public Paciente recuperarCartaoSus(String sus) {
        return pm.recuperarCartaoSus(sus);
    }
}
