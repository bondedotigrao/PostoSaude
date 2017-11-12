package model.classes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @OneToMany(cascade=CascadeType.ALL)
    private List<FuncionarioSaude> funcSaude;

    public Posto(String nome, Endereco endereco, List<FuncionarioSaude> funcSaude) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.funcSaude = funcSaude;
    }
    public Posto() {
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
