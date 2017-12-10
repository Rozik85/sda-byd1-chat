import com.sda.utility.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtility.getHibernateSession();

        try {
            session.beginTransaction();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        session.close();
    }
}