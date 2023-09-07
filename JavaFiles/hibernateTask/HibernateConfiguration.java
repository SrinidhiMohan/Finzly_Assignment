package hibernateTask;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public final class HibernateConfiguration {
		private HibernateConfiguration(){
			
		}
		
		public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Booklist.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
	}



