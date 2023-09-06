package CriteriaRestriction;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class GeMethod {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ge("salary", "300000"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}

}

// Sample output
//Employee [id=1, name=Srinidhi, designation=developer, salary=500000]
//Employee [id=2, name=Saishree, designation=developer, salary=500000]
//Employee [id=4, name=Sridevi, designation=hr, salary=300000]
//Employee [id=5, name=Varsha, designation=hr, salary=400000]

