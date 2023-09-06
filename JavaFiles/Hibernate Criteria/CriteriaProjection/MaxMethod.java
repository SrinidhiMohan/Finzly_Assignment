package CriteriaProjection;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class MaxMethod {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		//Projection projections = Projections.property("salary");
		criteria.setProjection(Projections.max("salary"));
		List<Employee> list = criteria.list();
		
			System.out.println(list);
		
		
	}

}
// Sample output

// [500000]
