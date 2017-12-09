
package model.classes;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class TipoUsuario {
    @Column
    @Id
    private int id;
    @Column
    private String senha;
    @Column
    private String login;
    @Column
    private int tipoUsuario;

    public TipoUsuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public TipoUsuario(int id, String senha, String login, int tipoUsuario) {
        this.id = id;
        this.senha = senha;
        this.login = login;
        this.tipoUsuario = tipoUsuario;
    }
}