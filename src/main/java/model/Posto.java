package model;

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
    private FuncionarioSaude funcSaude;

    public Posto(int codigo, String nome, Endereco endereco, FuncionarioSaude funcSaude) {
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

    public FuncionarioSaude getFuncSaude() {
        return funcSaude;
    }

    public void setFuncSaude(FuncionarioSaude funcSaude) {
        this.funcSaude = funcSaude;
    }
    
    
}
