package model.hibernate;

import java.util.List;
import model.InterfaceDao.PacienteDao;
import model.Paciente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PacienteHibernate implements PacienteDao {

    private SessionFactory sessions;
    private static EnderecoHibernate instance;

    public static EnderecoHibernate getInstance() {

        if (instance != null) {
            instance = new EnderecoHibernate();
        }

        return instance;
    }

    public PacienteHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    public void inserir(Paciente paciente) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.save(paciente);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Paciente paciente) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(paciente);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public Paciente recuperar(int codigo) {
        Session session = this.sessions.openSession();

        try {
            return (Paciente) session.getSession().createQuery("From Endereco Where id_paciente=" + codigo).
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }

    @Override
    public void deletar(Paciente paciente) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(paciente);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }

    }

    @Override
    public List<Paciente> listarTodos() {

        Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("from paciente").getResultList();

        } catch (Exception e) {
            return null;

        } finally {

            session.close();
        }
    }

    @Override
    public Paciente recuperarCartaoSus(String sus) {
         Session session = this.sessions.openSession();

        try {
            return (Paciente) session.getSession().createQuery("From Endereco cartaoSus='"+sus+"'").
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            session.close();
        }
    }

    @Override
    public Paciente recuperarCpf(String cpf) {
         Session session = this.sessions.openSession();

        try {
            return (Paciente) session.getSession().createQuery("From Endereco Where cpf='"+cpf+"'").
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            session.close();
        }
    }

   
}
