package hibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Loign.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	org.hibernate.Transaction tr = session.beginTransaction();
	
	Loign l = new Loign();
	l.setId(4);
	l.setUsername("Sridevi");
	l.setPassword("adfgbphh");
	
	session.update(l);
	tr.commit();
	System.out.println("Details Updated");
	session.close();
}
}

// Sample output in console
// Details Updated

