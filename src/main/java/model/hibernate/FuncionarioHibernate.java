package model.hibernate;

import java.util.List;
import model.InterfaceDao.FuncionarioDao;
import model.FuncionarioSaude;
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

    public void alterar(FuncionarioSaude func/*,int codigo*/) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
// nos catchs seria bom colocar pra exibir a mensagem dos erros;
            session.update(func);

//      FuncionarioSaude funcio = session.byId(FuncionarioSaude.class).load(codigo);
//      funcio.setNome(funcio.getNome());
//      funcio.setEspecialidade(funcio.getEspecialidade());
//      session.flush();
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

            return (FuncionarioSaude)session.getSession().createQuery("From FuncionarioSaude Where id_func=" + codigo).
                    getResultList().get(0);

        } catch (Exception e) {
            return null;
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
        Session session = this.sessions.openSession();
        try {         
            return (FuncionarioSaude) session.getSession()
                    .createQuery("From FuncionarioSaude Where cpf='" +cpf+ "'").getResultList().get(0);
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public FuncionarioSaude recuperaCodigo(int codigo) {
        Session session = this.sessions.openSession();
        try {
            return (FuncionarioSaude)session.getSession().createQuery("From FuncionarioSaude Where id_func="+codigo).
                    getResultList().get(0);
            
           } catch (Exception e) { 
                return null; 
        } finally {
            session.close();
        }
    }
//
//    @Override
//    public boolean existe(FuncionarioSaude func) {
//        
//        if (recuperaCodigo(func.getCodigo()) != null) {
//            return true;
//        }
//        if (recuperaCpf(func.getCpf()) != null) {
//            return true;
//        }
//        return false;
//    }
}
