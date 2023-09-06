package CriteriaRestriction;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class LtMethod {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("salary", "300000"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}

}

// Sample output
//Employee [id=3, name=Raji, designation=tester, salary=120000]
//Employee [id=6, name=Valli, designation=ba, salary=250000]

