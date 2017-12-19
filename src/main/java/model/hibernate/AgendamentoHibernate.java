
package model.hibernate;

import java.util.List;
import model.InterfaceDao.AgendamentoDao;
import model.classes.AgendamentoConsultas;
import model.classes.Paciente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AgendamentoHibernate implements AgendamentoDao {
    
    private SessionFactory sessions;
    private static AgendamentoHibernate instance;

    public static AgendamentoHibernate getInstance() {

        if (instance != null) {
            instance = new AgendamentoHibernate();
        }

        return instance;
    }

    public AgendamentoHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public AgendamentoConsultas procurarData(String data) {
       Session session = this.sessions.openSession();

        try {
            return (AgendamentoConsultas) session.getSession().createQuery("From AgendamentoConsultas Where data='"+data+"'").
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            session.close();
        }
    }

    @Override
    public void inserir(AgendamentoConsultas ac) {
       Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.save(ac);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        } 
    }

    @Override
    public void alterar(AgendamentoConsultas ac) {
         Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(ac);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        } 
    }
    @Override
    public AgendamentoConsultas recuperar(int codigo) {
       Session session = this.sessions.openSession();

        try {
            return (AgendamentoConsultas) session.getSession().createQuery("From AgendamentoConsultas Where id_agen=" + codigo).
                    getResultList().get(0);
        } catch (Exception e) {
            return null;

        } finally {
            //Fechamos a sessão
            session.close();
        }
         
    }

    @Override
    public void deletar(AgendamentoConsultas ac) {
      Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.remove(ac);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        } 
    }
    @Override
    public List<AgendamentoConsultas> listarTodos() {
       Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("from AgendamentoConsultas").getResultList();

        } catch (Exception e) {
            return null;

        } finally {

            session.close();
        }
    }
    public List<AgendamentoConsultas> buscarAgendamento(Paciente paciente){
      Session session = this.sessions.openSession();

        try {

            return session.getSession().createQuery("from AgendamentoConsultas where paciente_id_paciente="+paciente.getId_paciente()).getResultList();
            

        } catch (Exception e) {
            return null;
        } finally {

            session.close();
        }  
    }
}
