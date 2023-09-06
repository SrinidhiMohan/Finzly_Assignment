package CriteriaRestriction;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class GtMethod {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", "300000"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}

}

// Sample output

//Employee [id=1, name=Srinidhi, designation=developer, salary=500000]
//Employee [id=2, name=Saishree, designation=developer, salary=500000]
//Employee [id=5, name=Varsha, designation=hr, salary=400000]
