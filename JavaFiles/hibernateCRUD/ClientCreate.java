package hibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientCreate {
	
		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Loign.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			org.hibernate.Transaction tr = session.beginTransaction();
			
			Loign l = new Loign();
			l.setId(6);
			l.setUsername("Shree");
			l.setPassword("adfgb");
			
			session.save(l);
			tr.commit();
			System.out.println("Details Updated");
			session.close();
			
			
		}

	}


//Sample output
//Details Updated
