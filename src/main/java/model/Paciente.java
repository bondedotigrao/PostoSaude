package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Paciente {

    @Id
    @Column(name = "id_paciente")
    @GeneratedValue
    private int id_paciente;

    @Column(length = 60)
    private String nome;
    @Column(length = 60)
    private String nomeMae;
    @Column(length = 14, unique = true, nullable = false)
    private String cartaoSus;
    @Column(length = 14, unique = true, nullable = false)
    private String cpf;
    @Column(length = 50)
    private String sexo;
    @Column(length = 3)
    private int idade;
    @Column(length = 50)
    private String dataNasc;
    @Column(length = 50)
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Paciente() {
    }

    public Paciente(String nome, String nomeMae, String cartaoSus, String cpf,
            String sexo, int idade, String dataNasc, String telefone, Endereco endereco) {

        this.nome = nome;
        this.nomeMae = nomeMae;
        this.cartaoSus = cartaoSus;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
