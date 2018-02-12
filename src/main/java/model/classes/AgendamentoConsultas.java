package model.classes;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="agendamentos")
public class AgendamentoConsultas {
    @Id
    @Column(name = "id_agen")
    @GeneratedValue
    private int codigo;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @OneToOne
    private FuncionarioSaude func;
    @OneToOne
    private Paciente paciente;    
    @ManyToOne
    @JoinColumn(name = "posto_id")
    private Posto posto;
    

    public AgendamentoConsultas(Date data, FuncionarioSaude func, Paciente paciente,Posto posto) {
        this.data = data;
        this.func = func;
        this.paciente = paciente;
        this.posto = posto;
    }
    
    @Deprecated
    public AgendamentoConsultas() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public FuncionarioSaude getFunc() {
        return func;
    }

    public void setFunc(FuncionarioSaude func) {
        this.func = func;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }    
}
