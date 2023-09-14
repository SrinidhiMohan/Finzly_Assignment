package com.finzly.ipl.CrickPlay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	int id;
	String fname;
	String lname;
	int age;
	double experience;
	String loc;
	int matchesplayed;
	int matcheswon;
	int centuries;
	int halfcenturies;
	int wicketspermatch;
	int scorepermatch;
	String profile;
	String createddate;
	String updateddate;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getMatchesplayed() {
		return matchesplayed;
	}
	public void setMatchesplayed(int matchesplayed) {
		this.matchesplayed = matchesplayed;
	}
	public int getMatcheswon() {
		return matcheswon;
	}
	public void setMatcheswon(int matcheswon) {
		this.matcheswon = matcheswon;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfcenturies() {
		return halfcenturies;
	}
	public void setHalfcenturies(int halfcenturies) {
		this.halfcenturies = halfcenturies;
	}
	public int getWicketspermatch() {
		return wicketspermatch;
	}
	public void setWicketspermatch(int wicketspermatch) {
		this.wicketspermatch = wicketspermatch;
	}
	public int getScorepermatch() {
		return scorepermatch;
	}
	public void setScorepermatch(int scorepermatch) {
		this.scorepermatch = scorepermatch;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", experience="
				+ experience + ", loc=" + loc + ", matchesplayed=" + matchesplayed + ", matcheswon=" + matcheswon
				+ ", centuries=" + centuries + ", halfcenturies=" + halfcenturies + ", wicketspermatch="
				+ wicketspermatch + ", scorepermatch=" + scorepermatch + ", profile=" + profile + ", createddate="
				+ createddate + ", updateddate=" + updateddate + "]";
	}
	
		
	
}
