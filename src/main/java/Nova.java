
import org.hibernate.Session;

/**
 * @author imssbora
 */
public class Nova {
  public static void main(String[] args) {
      
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();

    // Check database version
    String sql = "select version()";

    //String result = (String) session.createSQLQuery(sql).getQueryReturns();
    //System.out.println(result);

    session.getTransaction().commit();
    session.close();

   
   
  }
}