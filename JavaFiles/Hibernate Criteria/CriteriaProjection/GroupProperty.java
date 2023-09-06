package CriteriaProjection;

import configurationhibernate.HibernateConfig;
import entity.Employee;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
public class GroupProperty {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		//Projection projections = Projections.property("salary");
		criteria.setProjection(Projections.groupProperty("salary"));
		List<Employee> list = criteria.list();
		
			System.out.println(list);
		
		
	}

}
// Sample output

//[120000, 250000, 300000, 400000, 500000]