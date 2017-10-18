package model.funcionario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionariosaude")

public class FuncionarioSaude {

    @Id
    @Column(name = "id_func")
    @GeneratedValue
    private int codigo;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String especialidade;

    public FuncionarioSaude() {
        
    }

    public FuncionarioSaude(String nome, String cpf, String especialidade, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.codigo = codigo;
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
