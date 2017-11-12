package model.hibernate;

import java.util.List;
import model.InterfaceDao.PostoDao;
import model.classes.Posto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PostoHibernate implements PostoDao {

    private SessionFactory sessions;
    private static PostoHibernate instance;

    public static PostoHibernate getInstance() {

        if (instance != null) {
            instance = new PostoHibernate();
        }

        return instance;
    }

    public PostoHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public void inserir(Posto posto) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.save(posto);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Posto posto) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(posto);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public Posto recuperar(int codigo) {

        Session session = this.sessions.openSession();

        try {
            return (Posto) session.getSession().createQuery("From Posto Where codigo=" + codigo).
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }

    @Override
    public void deletar(Posto posto) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(posto);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public List<Posto> listarTodos() {
        Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("from Posto").getResultList();

        } catch (Exception e) {
            return null;

        } finally {

            session.close();
        }

    }

}
