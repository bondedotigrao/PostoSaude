package model.hibernate;


import java.util.List;
import model.Endereco;
import model.FuncionarioSaude;
import model.InterfaceDao.EnderecoDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EnderecoHibernate implements EnderecoDao {

    private SessionFactory sessions;
    private static EnderecoHibernate instance;

    public static EnderecoHibernate getInstance() {

        if (instance != null) {
            instance = new EnderecoHibernate();
        }

        return instance;
    }

    public EnderecoHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public void inserir(Endereco endereco) {
     
       
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.save(endereco);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Endereco endereco) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(endereco);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public Endereco recuperar(int codigo) {
        Session session = this.sessions.openSession();

        try {
            return (Endereco) session.getSession().createQuery("From Endereco Where id_end=" + codigo).
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }

    @Override
    public void deletar(Endereco endereco) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(endereco);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }

    }

    @Override
    public List<Endereco> listarTodos() {

        Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("from Endereco").getResultList();

        } catch (Exception e) {
            return null;

        } finally {

            session.close();
        }
    }

//    @Override
//    public boolean existe(Endereco d) {
//        return false;
//    }

    @Override
    public Endereco recuperaCep(String cep) {
        Session session = this.sessions.openSession();

        try {
            return (Endereco) session.getSession().createQuery("From Endereco Where cep='" + cep + "'").
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }
}
