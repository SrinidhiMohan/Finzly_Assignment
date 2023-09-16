package com.finzly.fxtradingmicroservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.finzly.fxtradingmicroservice.entity.ccydata;
import com.finzly.fxtradingmicroservice.entity.exchangedata;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

@Repository
public class FxtradingMicroserviceDao {

	@Autowired
	SessionFactory sessionFactory;

	public String addCcyData(ccydata ccydata) {
		Session session = sessionFactory.openSession();
		session.save(ccydata);
		session.beginTransaction().commit();
		return "Ccy Added into table.";

	}

	public List<ccydata> getAllCurrencyPair() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ccydata.class);
		return criteria.list();
	}

	public String addExchanges(exchangedata exchangedata) {
		Session session = sessionFactory.openSession();
		session.save(exchangedata);
		session.beginTransaction().commit();
		return "The trade is successful.";
	}

	public List<exchangedata> getAllExchanges() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(exchangedata.class);
		return criteria.list();
	}

	public String deleteTradeById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(exchangedata.class);
		criteria.add(Restrictions.eq("id", id));
		exchangedata trade = (exchangedata) criteria.uniqueResult();
		session.delete(trade);
		tr.commit();
		return "The trade with id: " + id + " is  deleted";
	}

	public String deleteCcyById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(ccydata.class);
		criteria.add(Restrictions.eq("id", id));
		ccydata ccy = (ccydata) criteria.uniqueResult();
		session.delete(ccy);
		tr.commit();
		return "The ccy with id: " + id + " is  deleted";
	}

}
