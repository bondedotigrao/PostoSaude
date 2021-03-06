package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.classes.Paciente;
import model.PacienteModel;

@ManagedBean
@SessionScoped
public class PacienteController {
    
    private PacienteModel instance ;
    private Paciente cadPaciente;
    private Paciente selectdPaciente;
    
    public PacienteController() {
       this.instance = new PacienteModel();   
       this.cadPaciente = new Paciente();
    }
    public String registrarPaciente() {
       this.instance.inserir(this.cadPaciente);
       this.cadPaciente = new Paciente();
        return "menuLogin.xhtml";
    } 
    
    public void removerPaciente(){
        this.instance.deletar(this.selectdPaciente);
    }
    
    public String alterarPaciente(){
        instance.alterar(this.selectdPaciente);
        return "menuPaciente.xhtml";
    }
    
    
    public Paciente recuperarID(Integer codigo) {
        return instance.recupera(codigo);
    }
    
    public List<Paciente> recuperarTodos() {
        return instance.listarTodos();
    }

    public Paciente recuperarCpf(String cpf) {
        return instance.recuperarCpf(cpf);
    }

    public Paciente recuperarCartaoSus(String sus) {
        return instance.recuperarCartaoSus(sus);
    }

    public PacienteModel getInstance() {
        return instance;
    }

    public void setInstance(PacienteModel instance) {
        this.instance = instance;
    }

    public Paciente getCadPaciente() {
        return cadPaciente;
    }

    public void setCadPaciente(Paciente cadPaciente) {
        this.cadPaciente = cadPaciente;
    }

    public Paciente getSelectdPaciente() {
        return selectdPaciente;
    }

    public void setSelectdPaciente(Paciente selectdPaciente) {
        this.selectdPaciente = selectdPaciente;
    }
    
}
