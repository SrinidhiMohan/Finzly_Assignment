package com.finzly.ipl.CrickPlay.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.finzly.ipl.CrickPlay.dao.PlayerDao;
import com.finzly.ipl.CrickPlay.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PlayerService {
	@Autowired
	PlayerDao playerdao;

	public List<Player> getAllPlayerInfo() {
		return playerdao.getAllPlayerInfo();
		
	}

	public List<Player> getPlayerByLocation(String loc) {
		return playerdao.getPlayerByLocation(loc);
	}

	public List<Player> getPlayerInfoByFName(String fname) {
		return playerdao.getPlayerInfoByFName(fname);
		
	}

	public List<Player> getPlayerInfoByLName(String lname) {
		
		return playerdao.getPlayerInfoByLName(lname);
	}

	public List<Player> getPlayerInfoByProfile(String profile) {
		
		return playerdao.getPlayerInfoByProfile(profile);
	}

	public List<Player> getAllBatsmen() {
		
		return playerdao.getAllBatsmen();
	}

	public List<Player> getAllBowler() {
		return playerdao.getAllBowler();
	}

	public List<Player> getAllrounders() {
		return playerdao.getAllrounder();
	}

	public List<Player> getAllAgeGreaterThan25() {
		return playerdao.getAllAgeGreaterThan25();
	}

	public List<Player> getAllAgeGreaterThan40() {
		return playerdao.getAllAgeGreaterThan40();
	}

	public List<Player> getAllAgeGreaterThan30() {
		return playerdao.getAllAgeGreaterThan30();
	}

	public List<Player> getAllAgeGreaterThan35() {
		return playerdao.getAllAgeGreaterThan35();
	}

	public List<Player> getAllAgeLessThanOrEqualTo35() {
		return playerdao.getAllAgeLessThanOrEqualTo35();
	}

	public List<Player> getAllCenturiesLessThanOrEqualto10() {
		return playerdao.getAllCenturiesLessThanOrEqualto10();
	}

	public List<Player> getPlayerInfoByCenturies(int centuries) {
		return playerdao.getPlayerInfoByCenturies(centuries);
	}

	public List<Player> getAllCenturiesGreaterThan10() {
		return playerdao.getAllCenturiesGreaterThan10();
	}

	public List<Player> getAllCenturiesGreaterThan20() {
		return playerdao.getAllCenturiesGreaterThan20();
	}

	public List<Player> getAllCenturiesGreaterThan30() {
		return playerdao.getAllCenturiesGreaterThan30();
	}

	public List<Player> getAllCenturiesGreaterThan40() {
		return playerdao.getAllCenturiesGreaterThan40();
	}

	public List<Player> getAllCenturiesGreaterThan50() {
		return playerdao.getAllCenturiesGreaterThan50();
	}

	public List<Player> getAllCenturiesGreaterThan60() {
		return playerdao.getAllCenturiesGreaterThan60();
	}

	public List<Player> getAllCenturiesGreaterThan70() {
		return playerdao.getAllCenturiesGreaterThan70();
	}

	public List<Player> getPlayerInfoByexperience(double experience) {
		return playerdao.getPlayerInfoByexperience(experience);
	}

	public List<Player> getPlayerExperienceLessThan10() {
		return playerdao.getPlayerExperienceLessThan10();
	}

	public List<Player> getPlayerExperienceLessThan20() {
		return playerdao.getPlayerExperienceLessThan20();
	}

	public List<Player> getPlayerexperiencegreaterthan20() {
		return playerdao.getPlayerexperiencegreaterthan20();
	}

	public List<Player> getPlayerExperienceGreaterThan10() {
		return playerdao.getPlayerExperienceGreaterThan10();
	}

	public List<Player> getPlayerInfoByHalfCenturies(int halfcenturies) {
		return playerdao.getPlayerInfoByHalfCenturies(halfcenturies);
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan20() {
		return playerdao.getPlayerInfoByHalfCenturiesGreaterThan20();
	}

	public List<Player> getPlayerInfoByHalfCenturiesLessThan20() {
		return playerdao.getPlayerInfoByHalfCenturiesLessThan20() ;
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan50() {
		return playerdao.getPlayerInfoByHalfCenturiesGreaterThan50() ;
	}

	public List<Player> getPlayerInfoByHalfCenturiesGreaterThan100() {
		return playerdao.getPlayerInfoByHalfCenturiesGreaterThan100() ;
	}

	public List<Player> getPlayerInfoByHalfCenturiesLessThan10() {
		return playerdao.getPlayerInfoByHalfCenturiesLessThan10() ;
	}

	public List<Player> getPlayerInfoByMatchesPlayed(int matchesplayed) {
		return playerdao.getPlayerInfoByMatchesPlayed(matchesplayed) ;
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan100() {
		return playerdao.getPlayerInfoByMatchesPlayedLessThan100();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan200() {
		return playerdao.getPlayerInfoByMatchesPlayedLessThan200();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan300() {
		return playerdao.getPlayerInfoByMatchesPlayedLessThan300();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan400() {
		return playerdao.getPlayerInfoByMatchesPlayedLessThan400();
	}

	public List<Player> getPlayerInfoByMatchesPlayedLessThan500() {
		return playerdao.getPlayerInfoByMatchesPlayedLessThan500();
	}

	public List<Player> getPlayerInfoByMatchesPlayedGreaterThan500() {
		return playerdao.getPlayerInfoByMatchesPlayedGreaterThan500();
	}

	public List<Player> getPlayerInfoByMatchesWon(int matcheswon) {
		return playerdao.getPlayerInfoByMatchesWon(matcheswon);
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan100() {
		return playerdao.getPlayerInfoByMatchesWonGreaterThan100();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan200() {
		return playerdao.getPlayerInfoByMatchesWonGreaterThan200();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan300() {
		return playerdao.getPlayerInfoByMatchesWonGreaterThan300();
	}

	public List<Player> getPlayerInfoByMatchesWonGreaterThan400() {
		return playerdao.getPlayerInfoByMatchesWonGreaterThan400();
	}

	public List<Player> getPlayerInfoByScorePerMatch(int scorepermatch) {
		return playerdao.getPlayerInfoByScorePerMatch(scorepermatch);
	}

	public String insertNewPlayer(Player player) {
		return playerdao.insertNewPlayer(player);
	}

	public String updatePayer(Player player) {
		return playerdao.updatePayer(player);
	}

	public String deletePlayerById(int id) {
		return playerdao.deletePlayerById(id);
	}

	public String deletePlayerByFName(String fname) {
		return playerdao.deletePlayerByFName(fname);
	}

	public String deletePlayerBylName(String lname) {
		return playerdao.deletePlayerBylName(lname);
	}

	public List<Player> getSpecificRecordByNameLocAndAge() {
		List<Player> list = playerdao.getSpecificRecordByNameLocAndAge();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			String loc = player.getLoc();
			int age = player.getAge();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setLoc(loc);
			p.setAge(age);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandCenturies() {
		List<Player> list = playerdao.getSpecificRecordByNameandCenturies();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			int centuries = player.getCenturies();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setCenturies(centuries);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandhalfCenturies() {
		List<Player> list = playerdao.getSpecificRecordByNameandhalfCenturies();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			int halfcenturies = player.getHalfcenturies();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setHalfcenturies(halfcenturies);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandMatchesWon() {
		List<Player> list = playerdao.getSpecificRecordByNameandMatchesWon();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			int matcheswon = player.getMatcheswon();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setMatcheswon(matcheswon);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandScorePerMatch() {
		List<Player> list = playerdao.getSpecificRecordByNameandScorePerMatch();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			int scorepermatch = player.getScorepermatch();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setScorepermatch(scorepermatch);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	
	}

	public List<Player> getSpecificRecordByNameandExperience() {
		List<Player> list = playerdao.getSpecificRecordByNameandExperience();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			double experience = player.getExperience();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setExperience(experience);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandWicketsPerMatch() {
		List<Player> list = playerdao.getSpecificRecordByNameandWicketsPerMatch();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			int wicketspermatch = player.getWicketspermatch();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setWicketspermatch(wicketspermatch);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandProfile() {
		List<Player> list = playerdao.getSpecificRecordByNameandProfile();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			String profile = player.getProfile();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setProfile(profile);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByNameandCreatedDate() {
		List<Player> list = playerdao.getSpecificRecordByNameandCreatedDate();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			String createddate = player.getCreateddate();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);
			p.setCreateddate(createddate);
			
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getSpecificRecordByName() {
		List<Player> list = playerdao.getSpecificRecordByName();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			String fname = player.getFname();
			String lname = player.getLname();
			Player p = new Player();
			p.setFname(fname);
			p.setLname(lname);	
			modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAgeGreaterThan30() {
		List<Player> list = playerdao.getConditionalRecordOnAgeGreaterThan30();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>200) {
				modifiedList.add(player);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAgeGreaterThan40() {
		List<Player> list = playerdao.getConditionalRecordOnAgeGreaterThan40();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>200) {
				modifiedList.add(player);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAgeLessThan30() {
		List<Player> list = playerdao.getConditionalRecordOnAgeLessThan30();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>100) {
				modifiedList.add(player);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnExperienceGreaterThan10() {
		List<Player> list = playerdao.getConditionalRecordOnExperienceGreaterThan10();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getCenturies()>=20) {
				modifiedList.add(player);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnExperienceGreaterThan15() {
		List<Player> list = playerdao.getConditionalRecordOnExperienceGreaterThan15();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getCenturies()>=50) {
				modifiedList.add(player);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnCenturiesGreaterThanOrEqual100() {
		List<Player> list = playerdao.getConditionalRecordOnCenturiesGreaterThanOrEqual100();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getCenturies()>=100) {
				String fname = player.getFname();
				String lname = player.getLname();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual100() {
		List<Player> list = playerdao.getConditionalRecordOnHalfCenturiesGreaterThanOrEqual100();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getHalfcenturies()>=100) {
				String fname = player.getFname();
				String lname = player.getLname();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual50() {
		List<Player> list = playerdao.getConditionalRecordOnHalfCenturiesGreaterThanOrEqual50();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getHalfcenturies()>=50) {
				String fname = player.getFname();
				String lname = player.getLname();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual50() {
		List<Player> list = playerdao.getConditionalRecordOnHalfCenturiesLessThanOrEqual50();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getHalfcenturies()<=50) {
				String fname = player.getFname();
				String lname = player.getLname();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual20() {
		List<Player> list = playerdao.getConditionalRecordOnHalfCenturiesLessThanOrEqual20();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getHalfcenturies()<=20) {
				String fname = player.getFname();
				String lname = player.getLname();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual200() {
		List<Player> list = playerdao.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual200();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>100) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual300() {
		List<Player> list = playerdao.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual300();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>=200) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual400() {
		List<Player> list = playerdao.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual400();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>=300) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual500() {
		List<Player> list = playerdao.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual500();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>=400) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual600() {
		List<Player> list = playerdao.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual600();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getMatcheswon()>=500) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmen() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmen();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp15() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmenWithExp15();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp20() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmenWithExp20();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp25() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmenWithExp25();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp30() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmenWithExp30();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBatsmenWithExp35() {
		List<Player> list = playerdao.getConditionalRecordOnBatsmenWithExp35();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowler() {
		List<Player> list = playerdao.getConditionalRecordOnBowler();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowlerWithExp15() {
		List<Player> list = playerdao.getConditionalRecordOnBowlerWithExp15();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowlerwithexp20() {
		List<Player> list = playerdao.getConditionalRecordOnBowlerwithexp20();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowlerwithexp25() {
		List<Player> list = playerdao.getConditionalRecordOnBowlerwithexp25();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowlerWithExp30() {
		List<Player> list = playerdao.getConditionalRecordOnBowlerWithExp30();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnBowlerWithExp35() {
		List<Player> list = playerdao.getConditionalRecordOnBowlerWithExp35();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRounder() {
		List<Player> list = playerdao.getConditionalRecordOnAllRounder();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp15() {
		List<Player> list = playerdao.getConditionalRecordOnAllRounderWithExp15();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRoundewithexp20() {
		List<Player> list = playerdao.getConditionalRecordOnAllRoundewithexp20();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRounderwithexp25() {
		List<Player> list = playerdao.getConditionalRecordOnAllRounderwithexp25();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp30() {
		List<Player> list = playerdao.getConditionalRecordOnAllRounderWithExp30();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getConditionalRecordOnAllRounderWithExp35() {
		List<Player> list = playerdao.getConditionalRecordOnAllRounderWithExp35();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getAllRounder() {
		List<Player> list = playerdao.getAllRounder();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("all rounder")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getAllBatsmenInfo() {
		List<Player> list = playerdao.getAllBatsmenInfo();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bat")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getAllBowlerInfo() {
		List<Player> list = playerdao.getAllBowlerInfo();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
			if(player.getProfile().equalsIgnoreCase("bowler")) {
				String fname = player.getFname();
				String lname = player.getLname();
				String profile = player.getProfile();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setProfile(profile);
				p.setExperience(experience);
				modifiedList.add(p);
			}
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsAgeAsc() {
		return playerdao.getAllRecordsAgeAsc();
	}

	public List<Player> getAllRecordsAgeDesc() {
		return playerdao.getAllRecordsAgeDesc();
	}

	public List<Player> getAllRecordsCenturiesAsc() {
		List<Player> list = playerdao.getAllRecordsCenturiesAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int centuries = player.getCenturies();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setCenturies(centuries);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsCenturiesDesc() {
		List<Player> list = playerdao.getAllRecordsCenturiesDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int centuries = player.getCenturies();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setCenturies(centuries);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsExpsAsc() {
		List<Player> list = playerdao.getAllRecordsExpsAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setExperience(experience);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsExpsDesc() {
		List<Player> list = playerdao.getAllRecordsExpsDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				double experience = player.getExperience();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setExperience(experience);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsHalfCenturiesAsc() {
		List<Player> list = playerdao.getAllRecordsHalfCenturiesAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int halfcenturies = player.getHalfcenturies();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setHalfcenturies(halfcenturies);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsHalfCenturiesDesc() {
		List<Player> list = playerdao.getAllRecordsHalfCenturiesDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int halfcenturies = player.getHalfcenturies();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setHalfcenturies(halfcenturies);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsMatchesPlayedAsc() {
		List<Player> list = playerdao.getAllRecordsMatchesPlayedAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsMatchesPlayedDesc() {
		List<Player> list = playerdao.getAllRecordsMatchesPlayedDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matchesplayed = player.getMatchesplayed();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatchesplayed(matchesplayed);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsMatchesWonAsc() {
		List<Player> list = playerdao.getAllRecordsMatchesWonAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsMatchesWonDesc() {
		List<Player> list = playerdao.getAllRecordsMatchesWonDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int matcheswon = player.getMatcheswon();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setMatcheswon(matcheswon);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsScorePerMatchnAsc() {
		List<Player> list = playerdao.getAllRecordsScorePerMatchnAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int scorepermatch = player.getScorepermatch();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setWicketspermatch(scorepermatch);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsScorePerMatchnDesc() {
		List<Player> list = playerdao.getAllRecordsScorePerMatchnDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int scorepermatch = player.getScorepermatch();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setWicketspermatch(scorepermatch);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsWicketsPerMatchAsc() {
		List<Player> list = playerdao.getAllRecordsWicketsPerMatchAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int wicketspermatch = player.getWicketspermatch();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setWicketspermatch(wicketspermatch);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsWicketsPerMatchDesc() {
		List<Player> list = playerdao.getAllRecordsWicketsPerMatchDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int wicketspermatch = player.getWicketspermatch();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setWicketspermatch(wicketspermatch);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsIdAsc() {
		List<Player> list = playerdao.getAllRecordsIdAsc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int id = player.getId();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setId(id);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsIdDesc() {
		List<Player> list = playerdao.getAllRecordsIdDesc();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				int id = player.getId();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setId(id);
				modifiedList.add(p);
			
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsonYear1970s() {
		List<Player> list = playerdao.getAllRecordsonYear1970s();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				String createddate = player.getCreateddate();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setCreateddate(createddate);
				modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsonYear1980s() {
		List<Player> list = playerdao.getAllRecordsonYear1980s();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				String createddate = player.getCreateddate();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setCreateddate(createddate);
				modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getAllRecordsonYear1990s() {
		List<Player> list = playerdao.getAllRecordsonYear1990s();
		List<Player> modifiedList = new ArrayList();
		for (Player player : list) {
				String fname = player.getFname();
				String lname = player.getLname();
				String createddate = player.getCreateddate();
				Player p = new Player();
				p.setFname(fname);
				p.setLname(lname);	
				p.setCreateddate(createddate);
				modifiedList.add(p);
		}
		
		return modifiedList;
	}

	public List<Player> getAllFirstName() {
		
		return playerdao.getAllFirstName();
	}

	public List<Player> getAllLastName() {
		return playerdao.getAllLastName();
	}

	

}
