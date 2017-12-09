package model.classes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcionariosaude")

public class FuncionarioSaude {
//Funcionário

    @Id
    @Column(name = "id_func")
    @GeneratedValue
    private int codigo;
    @Column(length = 50)
    private String nome;
    @Column(length = 14, unique = true, nullable = false)
    private String cpf;
    @Column(length = 50)
    private String especialidade;
    @ManyToOne
    @JoinColumn(name = "posto_id")
    private Posto posto;

    public FuncionarioSaude() {

    }

    public FuncionarioSaude(String nome, String cpf, String especialidade, Posto posto) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.posto = posto;
        // this.codigo = codigo;
    }

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
