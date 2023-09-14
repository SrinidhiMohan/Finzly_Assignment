package com.finzly.ipl.CrickPlay.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import com.finzly.ipl.CrickPlay.entity.Player;


@Repository
public class PlayerDao {
	
	@Autowired
	SessionFactory factory;

	public List<Player> getAllPlayerInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getPlayerByLocation(String loc) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("loc",loc));
		return criteria.list();
		
	}

	public List<Player> getPlayerInfoByFName(String fname) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("fname",fname));
		return criteria.list();
		
	}

	public List<Player> getPlayerInfoByLName(String lname) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("lname",lname));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByProfile(String profile) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("profile", profile));
		return criteria.list();
	}

	public List<Player> getAllBatsmen() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("profile","bat"));
		return criteria.list();
	}

	public List<Player> getAllBowler() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("profile","bowler"));
		return criteria.list();
	}

	public List<Player> getAllrounder() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("profile","all rounder"));
		return criteria.list();
	}

	public List<Player> getAllAgeGreaterThan25() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age",25));
		return criteria.list();
	}

	public List<Player> getAllAgeGreaterThan40() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age",40));
		return criteria.list();
	}

	public List<Player> getAllAgeGreaterThan30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age",30));
		return criteria.list();
	}

	public List<Player> getAllAgeGreaterThan35() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age",35));
		return criteria.list();
	}

	public List<Player> getAllAgeLessThanOrEqualTo35() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("age",35));
		return criteria.list();
	}

	public List<Player> getAllCenturiesLessThanOrEqualto10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("centuries",10));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByCenturies(int centuries) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("centuries",centuries));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",10));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",20));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",30));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan40() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",40));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan50() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",50));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan60() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",60));
		return criteria.list();
	}

	public List<Player> getAllCenturiesGreaterThan70() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("centuries",70));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByexperience(double experience) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("experience",experience));
		return criteria.list();
	}

	public List<Player> getPlayerExperienceLessThan10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.lt("experience",10.0));
		return criteria.list();
	}

	public List<Player> getPlayerExperienceLessThan20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.lt("experience",20.0));
		return criteria.list();
	}

	public List<Player> getPlayerexperiencegreaterthan20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",20.0));
		return criteria.list();
	}

	public List<Player> getPlayerExperienceGreaterThan10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("experience",10.0));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturies(int halfcenturies) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("halfcenturies",halfcenturies));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("halfcenturies",20));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturiesLessThan20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.lt("halfcenturies",20));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan50() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("halfcenturies",50));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan100() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("halfcenturies",100));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByHalfCenturiesLessThan10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.lt("halfcenturies",10));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayed(int matchesplayed) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("matchesplayed",matchesplayed));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan100() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("matchesplayed",100));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan200() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("matchesplayed",200));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan300() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("matchesplayed",300));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan400() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("matchesplayed",400));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.le("matchesplayed",500));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesPlayedGreaterThan500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("matchesplayed",500));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesWon(int matcheswon) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("matcheswon",matcheswon));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan100() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("matcheswon",100));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan200() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("matcheswon",200));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan300() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("matcheswon",300));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan400() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("matcheswon",400));
		return criteria.list();
	}

	public List<Player> getPlayerInfoByScorePerMatch(int scorepermatch) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("scorepermatch",scorepermatch));
		return criteria.list();
	}

	public String insertNewPlayer(Player player) {
		Session session = factory.openSession();
		session.save(player);
		session.beginTransaction().commit();
		return "Player Inserted in to table";
	}

	public String updatePayer(Player player) {
		Session session = factory.openSession();
		session.update(player);
		session.beginTransaction().commit();
		return "Player Updated";
	}

	public String deletePlayerById(int id) {
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("id",id));
		Player player = (Player) criteria.uniqueResult();
		session.delete(player);
		tr.commit();
		return "Player Deleted";
	}

	public String deletePlayerByFName(String fname) {
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("fname",fname));
		Player player = (Player) criteria.uniqueResult();
		session.delete(player);
		tr.commit();
		return "Player "+fname+" deleted";
	}

	public String deletePlayerBylName(String lname) {
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("lname",lname));
		Player player = (Player) criteria.uniqueResult();
		session.delete(player);
		tr.commit();
		return "Player "+lname+" deleted";
	}

	public List<Player> getSpecificRecordByNameLocAndAge() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandCenturies() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandhalfCenturies() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandMatchesWon() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandScorePerMatch() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandExperience() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandWicketsPerMatch() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandProfile() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByNameandCreatedDate() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getSpecificRecordByName() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAgeGreaterThan30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age", 30));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAgeGreaterThan40() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.gt("age", 40));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAgeLessThan30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.lt("age", 30));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnExperienceGreaterThan10() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience", 10.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnExperienceGreaterThan15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience", 15.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnCenturiesGreaterThanOrEqual100() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual100() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual50() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual50() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual200() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("matchesplayed",200));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual300() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("matchesplayed",300));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual400() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("matchesplayed",400));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("matchesplayed",500));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual600() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("matchesplayed",600));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmen() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",10.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",15.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",20.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp25() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",25.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",30.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp35() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",35.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowler() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",10.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowlerWithExp15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",15.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowlerwithexp20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",20.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowlerwithexp25() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",25.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowlerWithExp30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",30.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnBowlerWithExp35() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",35.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRounder() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",10.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp15() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",15.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRoundewithexp20() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",20.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRounderwithexp25() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",25.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp30() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",30.0));
		return criteria.list();
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp35() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.ge("experience",35.0));
		return criteria.list();	
		}

	public List<Player> getAllRounder() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();	
	}

	public List<Player> getAllBatsmenInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();	
	}

	public List<Player> getAllBowlerInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		return criteria.list();	
	}

	public List<Player> getAllRecordsAgeAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("age"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsAgeDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("age"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsCenturiesAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("centuries"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsCenturiesDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("centuries"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsExpsAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("experience"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsExpsDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("experience"));
		return criteria.list();	
	}

	public List<Player> getAllRecordsHalfCenturiesAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("halfcenturies"));
		return criteria.list();
	}

	public List<Player> getAllRecordsHalfCenturiesDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("halfcenturies"));
		return criteria.list();
	}

	public List<Player> getAllRecordsMatchesPlayedAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("matchesplayed"));
		return criteria.list();
	}

	public List<Player> getAllRecordsMatchesPlayedDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("matchesplayed"));
		return criteria.list();
	}

	public List<Player> getAllRecordsMatchesWonAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("matcheswon"));
		return criteria.list();
	}

	public List<Player> getAllRecordsMatchesWonDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("matcheswon"));
		return criteria.list();
	}

	public List<Player> getAllRecordsScorePerMatchnAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("scorepermatch"));
		return criteria.list();
	}

	public List<Player> getAllRecordsScorePerMatchnDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("scorepermatch"));
		return criteria.list();
	}

	public List<Player> getAllRecordsWicketsPerMatchAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("wicketspermatch"));
		return criteria.list();
	}

	public List<Player> getAllRecordsWicketsPerMatchDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("wicketspermatch"));
		return criteria.list();
	}

	public List<Player> getAllRecordsIdAsc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("id"));
		return criteria.list();
	}

	public List<Player> getAllRecordsIdDesc() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.desc("id"));
		return criteria.list();
	}

	public List<Player> getAllRecordsonYear1970s() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.like("createddate", "%197%"));
		return criteria.list();
	}

	public List<Player> getAllRecordsonYear1980s() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.like("createddate", "%198%"));
		return criteria.list();
	}

	public List<Player> getAllRecordsonYear1990s() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.add(Restrictions.like("createddate", "%199%"));
		return criteria.list();
	}

	public List<Player> getAllFirstName() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.setProjection(Projections.groupProperty("fname"));
		return criteria.list();
	}

	public List<Player> getAllLastName() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.setProjection(Projections.groupProperty("lname"));
		return criteria.list();
	}


	
}
