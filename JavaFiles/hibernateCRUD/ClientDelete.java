package hibernateCRUD;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ClientDelete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Loign.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		org.hibernate.Transaction tr = session.beginTransaction(); 
		Loign l = new Loign();
		l.setId(6);
		
		session.delete(l);
		tr.commit();
		System.out.println("Record Deleted");
		session.close();
		
		
	}

}
// Sample output
//Record Deleted