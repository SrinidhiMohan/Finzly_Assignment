package hibernateCRUD;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientRead {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Loign.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Loign user = session.get(Loign.class,1);
		
		System.out.println(user);
		
		session.close();
		
	}

}

// Sample output 
//Loign [id=1, username=Srinidhi Mohan, password=123456]