package model.classes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="agendamentos")
public class AgendamentoConsultas {
    @Id
    @Column(name = "id_agen")
    @GeneratedValue
    private int codigo;
    @Column
    private String data;
    @Column
    private String horario;
    @OneToOne
    private FuncionarioSaude func;
    @OneToOne
    private Posto posto;
    @ManyToOne
    private Paciente paciente;

    public AgendamentoConsultas(String data, String horario, FuncionarioSaude func, Posto posto, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.func = func;
        this.posto = posto;
        this.paciente = paciente;
    }

    public AgendamentoConsultas() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public FuncionarioSaude getFunc() {
        return func;
    }

    public void setFunc(FuncionarioSaude func) {
        this.func = func;
    }

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
}
