
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

    

    public TipoUsuario(int id, String senha, String login) {
        this.id = id;
        this.senha = senha;
        this.login = login;
       
    }
}