package model.funcionario;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FuncionarioHibernate implements FuncionarioDao {

    private SessionFactory sessions;

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
    public void atualizar(FuncionarioSaude d) {
        
        
    }

    @Override
    public void deletar(FuncionarioSaude func) {
        
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();
        session.get(FuncionarioSaude.class, func.getCodigo());

        try {
            session.delete(func);
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
        session.createQuery("from FuncionarioSaude where codigo"+codigo).list();
        return null;
    }

    @Override
    public List<FuncionarioSaude> listarTodos(FuncionarioSaude d) {
        
        
        return null;
    }
    
    public FuncionarioSaude recuperar(String sql) {
        
        Session session = this.sessions.openSession();
        session.createQuery("").list();
        return null;
    }


    public void procurarCpf(String cpf) {
        
    }

    @Override
    public void RecuperaCpf(String cpf) {
      
    }
}
