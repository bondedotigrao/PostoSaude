package model.funcionario;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FuncionarioHibernate implements FuncionarioDao {

    private SessionFactory sessions;
    private static FuncionarioHibernate instance;

    public static FuncionarioHibernate getInstance() {

        if (instance != null) {
            instance = new FuncionarioHibernate();
        }

        return instance;
    }

    public FuncionarioHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public void inserir(FuncionarioSaude func) {

        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.save(func);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(FuncionarioSaude func) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();
       
        
        
        try {
// nos catchs seria bom colocar pra exibir a mensagem dos erros;
            session.update(func);
            t.commit();
        } catch (Exception e) {

            t.rollback();

        } finally {
            session.close();

        }
    }

    @Override
    public FuncionarioSaude recuperar(int codigo) {

        Session session = this.sessions.openSession();

        try {
            return (FuncionarioSaude)
                    session.getSession().createQuery("From FuncionarioSaude Where codigo=" + codigo).
                    getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }

    @Override
    public void deletar(FuncionarioSaude func) {

        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(func);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }

    }

    public List<FuncionarioSaude> listarTodos() {

        Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("from FuncionarioSaude").getResultList();

        } finally {

            session.close();
        }
    }

    @Override
    public FuncionarioSaude recuperaCpf(String cpf) {
        FuncionarioSaude fs = null;
        Session session = this.sessions.openSession();

        try {
            fs = (FuncionarioSaude) session.getSession().createQuery("From FuncionarioSaude Where cpf='" + cpf + "'").getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }
        return fs;
    }

    @Override
    public FuncionarioSaude recuperaCodigo(int codigo) {
        Session session = this.sessions.openSession();

        try {
            return (FuncionarioSaude) session.getSession().createQuery("From FuncionarioSaude Where codigo=" + codigo).
                    getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }

    }

    @Override
    public boolean existe(FuncionarioSaude func) {
        if(recuperaCodigo(func.getCodigo()) != null){
            return true;
        }
        if(recuperaCpf(func.getCpf()) != null){
            return true;
        }
        return false;
    }

}
