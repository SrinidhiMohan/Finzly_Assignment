package CriteriaRestriction;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class NotMethod {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.not(Restrictions.in("salary","500000")));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}

}

//Sample output
//Employee [id=3, name=Raji, designation=tester, salary=120000]
//Employee [id=4, name=Sridevi, designation=hr, salary=300000]
//Employee [id=5, name=Varsha, designation=hr, salary=400000]
//Employee [id=6, name=Valli, designation=ba, salary=250000]
