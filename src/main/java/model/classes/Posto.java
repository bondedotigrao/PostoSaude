package model.classes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="posto")
public class Posto {
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length=60)
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToMany(mappedBy = "posto", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FuncionarioSaude> funcSaude;
    @OneToMany(mappedBy = "posto", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    //@LazyCollection(LazyCollectionOption.FALSE)
    private List<AgendamentoConsultas> agendamentos;

    public Posto(String nome, Endereco endereco, List<FuncionarioSaude> funcSaude, List<AgendamentoConsultas> agendamentos) {
       // this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.funcSaude = funcSaude;
        this.agendamentos = agendamentos;
    }

   
   @Deprecated
    public Posto() {
        
        this.endereco = new Endereco();
        
        
    }

    public List<AgendamentoConsultas> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<AgendamentoConsultas> agendamentos) {
        this.agendamentos = agendamentos;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<FuncionarioSaude> getFuncSaude() {
        return funcSaude;
    }

    public void setFuncSaude(List<FuncionarioSaude> funcSaude) {
        this.funcSaude = funcSaude;
    }
}
