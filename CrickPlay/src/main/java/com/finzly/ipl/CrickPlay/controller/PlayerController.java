package com.finzly.ipl.CrickPlay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.finzly.ipl.CrickPlay.service.PlayerService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.finzly.ipl.CrickPlay.entity.Player;
import java.util.List;



@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerservice;
//1
	@GetMapping("allplayerinfo")
	public List<Player> getAllPlayerInfo() {
		return playerservice.getAllPlayerInfo();
	}
//2
	@GetMapping("byfirstname/{fname}")
	public List<Player> getPlayerInfoByFName(@PathVariable String fname) {
		return playerservice.getPlayerInfoByFName(fname);
	}
//3	
	@GetMapping("bylocation/{loc}")
	public List<Player> getPlayerByLocation(@PathVariable String loc) {
		return playerservice.getPlayerByLocation(loc);
	}
//4	
	@GetMapping("bylastname/{lname}")
	public List<Player> getPlayerInfoByLName(@PathVariable String lname) {
		return playerservice.getPlayerInfoByLName(lname);
	}
//5	
	@GetMapping("byProfile/{profile}")
	public List<Player> getPlayerInfoByProfile(@PathVariable String profile) {
		return playerservice.getPlayerInfoByProfile(profile);
	}
//6	
	@GetMapping("allbat")
	public List<Player> getAllBatsmen() {
		return playerservice.getAllBatsmen();
	}
//7	
	@GetMapping("allbowler")
	public List<Player> getAllBowler() {
		return playerservice.getAllBowler();
	}
//8	
	@GetMapping("allrounders")
	public List<Player> getAllrounders() {
		return playerservice.getAllrounders();
	}
//9	
	@GetMapping("agegreaterthan25")
	public List<Player> getAllAgeGreaterThan25() {
		return playerservice.getAllAgeGreaterThan25();
	}
//10	
	@GetMapping("agegreaterthan40")
	public List<Player> getAllAgeGreaterThan40() {
		return playerservice.getAllAgeGreaterThan40();
	}
//11	
	@GetMapping("agegreaterthan30")
	public List<Player> getAllAgeGreaterThan30() {
		return playerservice.getAllAgeGreaterThan30();
	}
//12	
	@GetMapping("agegreaterthan35")
	public List<Player> getAllAgeGreaterThan35() {
		return playerservice.getAllAgeGreaterThan35();
	}
//13	
	@GetMapping("agelessthanorequalto35")
	public List<Player> getAllAgeLessThanOrEqualTo35() {
		return playerservice.getAllAgeLessThanOrEqualTo35();
	}
//14	
	@GetMapping("bycenturies/{centuries}")
	public List<Player> getPlayerInfoByCenturies(@PathVariable int centuries) {
		return playerservice.getPlayerInfoByCenturies(centuries);
	}
//15	
	@GetMapping("centurieslessthanorequalto10")
	public List<Player> getAllCenturiesLessThanOrEqualto10() {
		return playerservice.getAllCenturiesLessThanOrEqualto10();
	}
//16
	@GetMapping("centuriesgreaterthan10")
	public List<Player> getAllCenturiesGreaterThan10() {
		return playerservice.getAllCenturiesGreaterThan10();
	}
//17	
	@GetMapping("centuriesgreaterthan20")
	public List<Player> getAllCenturiesGreaterThan20() {
		return playerservice.getAllCenturiesGreaterThan20();
	}
//18	
	@GetMapping("centuriesgreaterthan30")
	public List<Player> getAllCenturiesGreaterThan30() {
		return playerservice.getAllCenturiesGreaterThan30();
	}
//19	
	@GetMapping("centuriesgreaterthan40")
	public List<Player> getAllCenturiesGreaterThan40() {
		return playerservice.getAllCenturiesGreaterThan40();
	}
//20
	@GetMapping("centuriesgreaterthan50")
	public List<Player> getAllCenturiesGreaterThan50() {
		return playerservice.getAllCenturiesGreaterThan50();
	}
//21	
	
	@GetMapping("centuriesgreaterthan60")
	public List<Player> getAllCenturiesGreaterThan60() {
		return playerservice.getAllCenturiesGreaterThan60();
	}
//22
	@GetMapping("centuriesgreaterthan70")
	public List<Player> getAllCenturiesGreaterThan70() {
		return playerservice.getAllCenturiesGreaterThan70();
	}
//23
	@GetMapping("byexperience/{experience}")
	public List<Player> getPlayerInfoByexperience(@PathVariable double experience) {
		return playerservice.getPlayerInfoByexperience(experience);
	}
//24
	@GetMapping("experiencelessthan10")
	public List<Player> getPlayerExperienceLessThan10() {
		return playerservice.getPlayerExperienceLessThan10();
	}
//25
		@GetMapping("experiencelessthan20")
		public List<Player> getPlayerExperienceLessThan20() {
			return playerservice.getPlayerExperienceLessThan20();
		}
//26
		@GetMapping("experiencegreaterthanOrEqualTo20")
		public List<Player> getPlayerexperiencegreaterthan20() {
					return playerservice.getPlayerexperiencegreaterthan20();
				}
//27
		@GetMapping("experiencegreaterthan10")
		public List<Player> getPlayerExperienceGreaterThan10() {
			return playerservice.getPlayerExperienceGreaterThan10();
		}
	
//27
		@GetMapping("byhalfcenturies/{halfcenturies}")
		public List<Player> getPlayerInfoByHalfCenturies(@PathVariable int halfcenturies) {
			return playerservice.getPlayerInfoByHalfCenturies(halfcenturies);
		}
//28
		@GetMapping("byhalfcenturiesgreaterthan20")
		public List<Player> getPlayerInfoByHalfCenturiesGreaterThan20() {
			return playerservice.getPlayerInfoByHalfCenturiesGreaterThan20();
		}
//29
		@GetMapping("byhalfcenturieslessthan20")
		public List<Player> getPlayerInfoByHalfCenturiesLessThan20() {
			return playerservice.getPlayerInfoByHalfCenturiesLessThan20();
		}
//30
		@GetMapping("byhalfcenturiesgreaterthan50")
		public List<Player> getPlayerInfoByHalfCenturiesGreaterThan50() {
			return playerservice.getPlayerInfoByHalfCenturiesGreaterThan50();
		}
//31
		@GetMapping("byhalfcenturiesgreaterthan100")
		public List<Player> getPlayerInfoByHalfCenturiesGreaterThan100() {
			return playerservice.getPlayerInfoByHalfCenturiesGreaterThan100();
		}
//32
		@GetMapping("byhalfcenturieslessthan10")
		public List<Player> getPlayerInfoByHalfCenturiesLessThan10() {
			return playerservice.getPlayerInfoByHalfCenturiesLessThan10();
		}
//33
		@GetMapping("bymatchesplayed/{matchesplayed}")
		public List<Player> getPlayerInfoByMatchesPlayed(@PathVariable int matchesplayed) {
			return playerservice.getPlayerInfoByMatchesPlayed(matchesplayed);
		}
//34 
		@GetMapping("bymatchesplayedlessthan100")
		public List<Player> getPlayerInfoByMatchesPlayedLessThan100() {
			return playerservice.getPlayerInfoByMatchesPlayedLessThan100();
		}
//35
		@GetMapping("bymatchesplayedlessthan200")
		public List<Player> getPlayerInfoByMatchesPlayedLessThan200() {
			return playerservice.getPlayerInfoByMatchesPlayedLessThan200();
		}
//36
		@GetMapping("bymatchesplayedlessthan300")
		public List<Player> getPlayerInfoByMatchesPlayedLessThan300() {
			return playerservice.getPlayerInfoByMatchesPlayedLessThan300();
		}
//37
		@GetMapping("bymatchesplayedlessthan400")
		public List<Player> getPlayerInfoByMatchesPlayedLessThan400() {
			return playerservice.getPlayerInfoByMatchesPlayedLessThan400();
		}
//38
		@GetMapping("bymatchesplayedlessthan500")
		public List<Player> getPlayerInfoByMatchesPlayedLessThan500() {
			return playerservice.getPlayerInfoByMatchesPlayedLessThan500();
		}
		
//39
		@GetMapping("bymatchesplayedgreaterthan500")
		public List<Player> getPlayerInfoByMatchesPlayedGreaterThan500() {
			return playerservice.getPlayerInfoByMatchesPlayedGreaterThan500();
		}
//40
		@GetMapping("bymatcheswon/{matcheswon}")
		public List<Player> getPlayerInfoByMatchesWon(@PathVariable int matcheswon) {
			return playerservice.getPlayerInfoByMatchesWon(matcheswon);
		}
//42
		@GetMapping("bymatcheswongreaterthan100")
		public List<Player> getPlayerInfoByMatchesWonGreaterThan100() {
			return playerservice.getPlayerInfoByMatchesWonGreaterThan100();
		}
//42
		@GetMapping("bymatcheswongreaterthan200")
		public List<Player> getPlayerInfoByMatchesWonGreaterThan200() {
			return playerservice.getPlayerInfoByMatchesWonGreaterThan200();
		}
//43
		@GetMapping("bymatcheswongreaterthan300")
		public List<Player> getPlayerInfoByMatchesWonGreaterThan300() {
				return playerservice.getPlayerInfoByMatchesWonGreaterThan300();
		}
//44
		@GetMapping("bymatcheswongreaterthan400")
		public List<Player> getPlayerInfoByMatchesWonGreaterThan400() {
				return playerservice.getPlayerInfoByMatchesWonGreaterThan400();
		}
//45
		@GetMapping("byscorepermatch/{scorepermatch}")
		public List<Player> getPlayerInfoByScorePerMatch(@PathVariable int scorepermatch) {
			return playerservice.getPlayerInfoByScorePerMatch(scorepermatch);
		}
//46
		@PostMapping("insertplayer")
		public String insertNewpPayer(@RequestBody Player player) {
			return playerservice.insertNewPlayer(player);
		}
//47
		@PostMapping("updateplayer")
		public String updatePayer(@RequestBody Player player) {
			return playerservice.updatePayer(player);
		}
//48
		 @DeleteMapping("deleteplayer/{id}")
		   public String deletePlayerById(@PathVariable int id) {
		      return playerservice.deletePlayerById(id);
		   }
//49
		 @DeleteMapping("deleteplayerbyfname/{fname}")
		   public String deletePlayerByFName(@PathVariable String fname) {
		      return playerservice.deletePlayerByFName(fname);
		   }
//50
		 @DeleteMapping("deleteplayerbyLname/{lname}")
		   public String deletePlayerByLName(@PathVariable String lname) {
		      return playerservice.deletePlayerBylName(lname);
		   
		 }
//51 @Author:Srinidhi Mohan |  Gets first name, last name, location and age of the players from database 
		 @GetMapping("byspecificrecordbynamelocandage")
			public List<Player> getSpecificRecordByNameLocAndAge() {
				return playerservice.getSpecificRecordByNameLocAndAge();
			}
//52 @Author:Srinidhi Mohan |  Gets first name, last name and centuries of the players from database 
		 @GetMapping("byspecificrecordbynameandcenturies")
			public List<Player> getSpecificRecordByNameandCenturies() {
				return playerservice.getSpecificRecordByNameandCenturies();
			}
//53 @Author:Srinidhi Mohan |  Gets first name, last name and half-centuries of the players from database 
		 @GetMapping("byspecificrecordbynameandhalfcenturies")
			public List<Player> getSpecificRecordByNameandhalfCenturies() {
				return playerservice.getSpecificRecordByNameandhalfCenturies();
			}
//54 @Author:Srinidhi Mohan |  Gets first name, last name and matcheswon of the players from database 
		 @GetMapping("byspecificrecordbynameandmatcheswon")
			public List<Player> getSpecificRecordByNameandMatchesWon() {
				return playerservice.getSpecificRecordByNameandMatchesWon();
		 }
//55 @Author:Srinidhi Mohan |  Gets first name, last name and Scorepermatch of the players from database 
		 @GetMapping("byspecificrecordbynameandscorepermatch")
			public List<Player> getSpecificRecordByNameandScorePerMatch() {
				return playerservice.getSpecificRecordByNameandScorePerMatch();
			}
//56 @Author:Srinidhi Mohan |  Gets first name, last name and Experience of the players from database 
		 @GetMapping("byspecificrecordbynameandexperience")
			public List<Player> getSpecificRecordByNameandandExperience() {
				return playerservice.getSpecificRecordByNameandExperience();
			}
//57 @Author:Srinidhi Mohan |  Gets first name, last name and wickets per match of the players from database 
		 @GetMapping("byspecificrecordbynameandwicketspermatch")
			public List<Player> getSpecificRecordByNameandWicketsPerMatch() {
				return playerservice.getSpecificRecordByNameandWicketsPerMatch();
			}
//58 @Author:Srinidhi Mohan |  Gets first name, last name and profile of the players from database 
		 @GetMapping("byspecificrecordbynameandprofile")
			public List<Player> getSpecificRecordByNameandProfile() {
				return playerservice.getSpecificRecordByNameandProfile();
			}
//59 @Author:Srinidhi Mohan |  Gets first name, last name and created date of the players from database 
		 @GetMapping("byspecificrecordbynameandcreateddate")
			public List<Player> getSpecificRecordByNameandCreatedDate() {
				return playerservice.getSpecificRecordByNameandCreatedDate();
		 }
//60 @Author:Srinidhi Mohan |  Gets first name and  last name  of the players from database 
		 @GetMapping("byspecificrecordbyname")
			public List<Player> getSpecificRecordByName() {
				return playerservice.getSpecificRecordByName();
		 }
//61 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos age is greater than 30 and matches won greater than 200 from database 
		 @GetMapping("byconditionalrecordonagegreaterthan30")
			public List<Player> getConditionalRecordOnAgeGreaterThan30() {
				return playerservice.getConditionalRecordOnAgeGreaterThan30();
		 }
//62 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos age is greater than 40 and matches won greater than 200 from database 
		 @GetMapping("byconditionalrecordonagegreaterthan40")
			public List<Player> getConditionalRecordOnAgeGreaterThan40() {
				return playerservice.getConditionalRecordOnAgeGreaterThan40();
		 }
//63 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos age is less than 30 and matches won greater than  100 from database 
		 @GetMapping("byconditionalrecordonagelessthan30")
			public List<Player> getConditionalRecordOnAgeLessThan30() {
				return playerservice.getConditionalRecordOnAgeLessThan30();
		 }
//64 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos experience is greater than or equal to 10 and centuries  greater than or equal to 20 from database 
		 @GetMapping("byconditionalrecordonexperiencegreaterthan10")
			public List<Player> getConditionalRecordOnExperienceGreaterThan10() {
				return playerservice.getConditionalRecordOnExperienceGreaterThan10();
		 }
//65 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos experience is greater than or equal to 15 and centuries  greater than or equal to 50 from database 
		 @GetMapping("byconditionalrecordonexperiencegreaterthan15")
			public List<Player> getConditionalRecordOnExperienceGreaterThan15() {
				return playerservice.getConditionalRecordOnExperienceGreaterThan15();
		 }
//66 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos centuries  greater than or equal to 100 from database 
		 @GetMapping("byconditionalrecordoncenturiesgreaterthanorequal100")
			public List<Player> getConditionalRecordOnCenturiesGreaterThanOrEqual100() {
				return playerservice.getConditionalRecordOnCenturiesGreaterThanOrEqual100();
		 }
//67 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos half centuries  greater than or equal to 100 from database 
		 @GetMapping("byconditionalrecordonhalfcenturiesgreaterthanorequal100")
			public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual100() {
				return playerservice.getConditionalRecordOnHalfCenturiesGreaterThanOrEqual100();
		 }
//68 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos half centuries  greater than or equal to 50 from database 
		 @GetMapping("byconditionalrecordonhalfcenturiesgreaterthanorequal50")
			public List<Player> getConditionalRecordOnHalfCenturiesGreaterThanOrEqual50() {
				return playerservice.getConditionalRecordOnHalfCenturiesGreaterThanOrEqual50();
		 }
//69 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos half centuries  less than or equal to 50 from database 
		 @GetMapping("byconditionalrecordonhalfcenturieslessthanorequal50")
			public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual50() {
				return playerservice.getConditionalRecordOnHalfCenturiesLessThanOrEqual50();
		 }
//70 @Author:Srinidhi Mohan |  Gets first and last name  of the players whos half centuries  less than or equal to 20 from database 
		 @GetMapping("byconditionalrecordonhalfcenturieslessthanorequal20")
			public List<Player> getConditionalRecordOnHalfCenturiesLessThanOrEqual20() {
				return playerservice.getConditionalRecordOnHalfCenturiesLessThanOrEqual20();
		 }
//71 @Author:Srinidhi Mohan |  Gets first and last name, matches played and matches won of the players whos matches played is greater than or equal to 200 and matches won is greater than or equal to 100 from database 
		 @GetMapping("byconditionalrecordonmatchesplayedisgreaterthanorequal200")
			public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual200() {
				return playerservice.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual200();
		 }
//73 @Author:Srinidhi Mohan |  Gets first and last name, matches played and matches won of the players whos matches played is greater than or equal to 300 and matches won is greater than or equal to 200 from database 
		 @GetMapping("byconditionalrecordonmatchesplayedisgreaterthanorequal300")
			public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual300() {
				return playerservice.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual300();
		 }
//74 @Author:Srinidhi Mohan |  Gets first and last name, matches played and matches won of the players whos matches played is greater than or equal to 400 and matches won is greater than or equal to 300 from database 
		 @GetMapping("byconditionalrecordonmatchesplayedisgreaterthanorequal400")
			public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual400() {
				return playerservice.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual400();
		 }
//75 @Author:Srinidhi Mohan |  Gets first and last name, matches played and matches won of the players whos matches played is greater than or equal to 500 and matches won is greater than or equal to 400 from database 
		 @GetMapping("byconditionalrecordonmatchesplayedisgreaterthanorequal500")
			public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual500() {
				return playerservice.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual500();
		 }
//76 @Author:Srinidhi Mohan |  Gets first and last name, matches played and matches won of the players whos matches played is greater than or equal to 600 and matches won is greater than or equal to 500 from database 
		 @GetMapping("byconditionalrecordonmatchesplayedisgreaterthanorequal600")
			public List<Player> getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual600() {
				return playerservice.getConditionalRecordOnMatchesPlayedIsGreaterThanOrEqual600();
		 }
//76 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 10 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmen")
			public List<Player> getConditionalRecordOnBatsmen() {
				return playerservice.getConditionalRecordOnBatsmen();
		 }
//77 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 15 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmenwithexp15")
			public List<Player> getConditionalRecordOnBatsmenWithExp15() {
				return playerservice.getConditionalRecordOnBatsmenWithExp15();
		 }
//78 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 20 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmenwithexp20")
			public List<Player> getConditionalRecordOnBatsmenWithExp20() {
				return playerservice.getConditionalRecordOnBatsmenWithExp20();
		 }
//79 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 25 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmenwithexp25")
			public List<Player> getConditionalRecordOnBatsmenWithExp25() {
				return playerservice.getConditionalRecordOnBatsmenWithExp25();
		 }
//80 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 30 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmenwithexp30")
			public List<Player> getConditionalRecordOnBatsmenWithExp30() {
				return playerservice.getConditionalRecordOnBatsmenWithExp30();
		 }
//81 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 35 and profile is batsmen from database 
		 @GetMapping("byconditionalrecordonbatsmenwithexp35")
			public List<Player> getConditionalRecordOnBatsmenWithExp35() {
				return playerservice.getConditionalRecordOnBatsmenWithExp35();
		 }
//82 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 10 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowler")
			public List<Player> getConditionalRecordOnBowler() {
				return playerservice.getConditionalRecordOnBowler();
		 }
//83 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 15 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowlerwithexp15")
			public List<Player> getConditionalRecordOnBowlerWithExp15(){
				return playerservice.getConditionalRecordOnBowlerWithExp15();
		 }
//84 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 20 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowlerwithexp20")
			public List<Player> getConditionalRecordOnBowlerwithexp20() {
				return playerservice.getConditionalRecordOnBowlerwithexp20();
		 }
//85 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 25 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowlerwithexp25")
			public List<Player> getConditionalRecordOnBowlerwithexp25() {
				return playerservice.getConditionalRecordOnBowlerwithexp25();
		 }
//86 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 30 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowlerwithexp30")
			public List<Player> getConditionalRecordOnBowlerWithExp30() {
				return playerservice.getConditionalRecordOnBowlerWithExp30();
		 }
//87 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 35 and profile is bowler from database 
		 @GetMapping("byconditionalrecordonBowlerwithexp35")
			public List<Player> getConditionalRecordOnBowlerWithExp35() {
				return playerservice.getConditionalRecordOnBowlerWithExp35();
		 }
//88 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 10 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounder")
			public List<Player> getConditionalRecordOnAllRounder() {
				return playerservice.getConditionalRecordOnAllRounder();
		 }
//89 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 15 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounderwithexp15")
			public List<Player> getConditionalRecordOnAllRounderWithExp15(){
				return playerservice.getConditionalRecordOnAllRounderWithExp15();
		 }
//90 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 20 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounderwithexp20")
			public List<Player> getConditionalRecordOnAllRoundewithexp20() {
				return playerservice.getConditionalRecordOnAllRoundewithexp20();
		 }
//91 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 25 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounderwithexp25")
			public List<Player> getConditionalRecordOnAllRounderwithexp25() {
				return playerservice.getConditionalRecordOnAllRounderwithexp25();
		 }
//92 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 30 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounderwithexp30")
			public List<Player> getConditionalRecordOnAllRounderWithExp30() {
				return playerservice.getConditionalRecordOnAllRounderWithExp30();
		 }
//93 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos experience is greater than or equal to 35 and profile is allrounder from database 
		 @GetMapping("byconditionalrecordonAllRounderwithexp35")
			public List<Player> getConditionalRecordOnAllRounderWithExp35() {
				return playerservice.getConditionalRecordOnAllRounderWithExp35();
		 }
//94 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players and profile is allrounder from database
		 @GetMapping("getAllRounder")
			public List<Player> getAllRounder() {
				return playerservice.getAllRounder();
		 }
//95 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos profile is batsmen from database
		 @GetMapping("getAllBatsmenInfo")
			public List<Player> getAllBatsmenInfo() {
				return playerservice.getAllBatsmenInfo();
		 }
//96 @Author:Srinidhi Mohan |  Gets first and last name, experience and profile of the players whos profile is bowler from database
		 @GetMapping("getAllBowlerInfo")
			public List<Player> getAllBowlerInfo() {
				return playerservice.getAllBowlerInfo();
		 }
//98 @Author:Srinidhi Mohan |  Gets first and last name, age and age is sorted on ascending order from database
		 @GetMapping("getAllRecordsAgeAsc")
			public List<Player> getAllRecordsAgeAsc() {
				return playerservice.getAllRecordsAgeAsc();
		 }
//99 @Author:Srinidhi Mohan |  Gets first and last name, age and age is sorted on descending order from database
		 @GetMapping("getAllRecordsAgeDesc")
			public List<Player> getAllRecordsAgeDesc() {
				return playerservice.getAllRecordsAgeDesc();
		 }
//100 @Author:Srinidhi Mohan |  Gets first and last name, centuries and centuries is sorted on ascending order from database
		 @GetMapping("getAllRecordsCenturiesAsc")
			public List<Player> getAllRecordsCenturiesAsc() {
				return playerservice.getAllRecordsCenturiesAsc();
		 }
//101 @Author:Srinidhi Mohan |  Gets first and last name, centuries and centuries is sorted on descending order from database
		 @GetMapping("getAllRecordsCenturiesDesc")
			public List<Player> getAllRecordsCenturiesDesc() {
				return playerservice.getAllRecordsCenturiesDesc();
		 }
//102 @Author:Srinidhi Mohan |  Gets first and last name, experience and experience is sorted on ascending order from database
		 @GetMapping("getAllRecordsExpAsc")
			public List<Player> getAllRecordsExpsAsc() {
				return playerservice.getAllRecordsExpsAsc();
		 }
//103 @Author:Srinidhi Mohan |  Gets first and last name, experience and experience is sorted on descending order from database
		 @GetMapping("getAllRecordsExpDesc")
			public List<Player> getAllRecordsExpsDesc() {
				return playerservice.getAllRecordsExpsDesc();
		 }
//104 @Author:Srinidhi Mohan |  Gets first and last name, halfcenturies and halfcenturies is sorted on ascending order from database
		 @GetMapping("getAllRecordshalfcenturiesAsc")
			public List<Player> getAllRecordsHalfCenturiesAsc() {
				return playerservice.getAllRecordsHalfCenturiesAsc();
		 }
//105 @Author:Srinidhi Mohan |  Gets first and last name, halfcenturies and halfcenturies is sorted on descending order from database
		 @GetMapping("getAllRecordshalfcenturiesDesc")
			public List<Player> getAllRecordsHalfCenturiesDesc() {
				return playerservice.getAllRecordsHalfCenturiesDesc();
		 }
//106 @Author:Srinidhi Mohan |  Gets first and last name, matchesplayed and matches played is sorted on ascending order from database
		 @GetMapping("getAllRecordsMatchesPlayedAsc")
			public List<Player> getAllRecordsMatchesPlayedAsc() {
				return playerservice.getAllRecordsMatchesPlayedAsc();
		 }
//107 @Author:Srinidhi Mohan |  Gets first and last name, matchesplayed and matches played is sorted on descending order from database
		 @GetMapping("getAllRecordsMatchesPlayedDesc")
			public List<Player> getAllRecordsMatchesPlayedDesc() {
				return playerservice.getAllRecordsMatchesPlayedDesc();
		 }
//108 @Author:Srinidhi Mohan |  Gets first and last name, matches won and matches won is sorted on ascending order from database
		 @GetMapping("getAllRecordsMatchesWonAsc")
			public List<Player> getAllRecordsMatchesWonAsc() {
				return playerservice.getAllRecordsMatchesWonAsc();
		 }
//109 @Author:Srinidhi Mohan |  Gets first and last name, matches won and matches won is sorted on descending order from database
		 @GetMapping("getAllRecordsMatchesWonDesc")
			public List<Player> getAllRecordsMatchesWonDesc() {
				return playerservice.getAllRecordsMatchesWonDesc();
		 }
//110 @Author:Srinidhi Mohan |  Gets first and last name, scorepermatch and scorepermatch is sorted on ascending order from database
		 @GetMapping("getAllRecordsScorePerMatchnAsc")
			public List<Player> getAllRecordsScorePerMatchnAsc() {
				return playerservice.getAllRecordsScorePerMatchnAsc();
		 }
//111 @Author:Srinidhi Mohan |  Gets first and last name, scorepermatch and scorepermatch is sorted on descending order from database
		 @GetMapping("getAllRecordsScorePerMatchnDesc")
			public List<Player> getAllRecordsScorePerMatchnDesc() {
				return playerservice.getAllRecordsScorePerMatchnDesc();
		 }
//112 @Author:Srinidhi Mohan |  Gets first and last name, wicketspermatch and wicketspermatch is sorted on ascending order from database
		 @GetMapping("getAllRecordsWicketsPerMatchAsc")
			public List<Player> getAllRecordsWicketsPerMatchAsc() {
				return playerservice.getAllRecordsWicketsPerMatchAsc();
		 }
//113 @Author:Srinidhi Mohan |  Gets first and last name, wicketspermatch and wicketspermatch is sorted on descending order from database
		 @GetMapping("getAllRecordsWicketsPerMatchDesc")
			public List<Player> getAllRecordsWicketsPerMatchDesc() {
				return playerservice.getAllRecordsWicketsPerMatchDesc();
		 }
//114 @Author:Srinidhi Mohan |  Gets first and last name,id and id is sorted on ascending order from database
		 @GetMapping("getAllRecordsIdAsc")
			public List<Player> getAllRecordsIdAsc() {
				return playerservice.getAllRecordsIdAsc();
		 }
//115 @Author:Srinidhi Mohan |  Gets first and last name,id and id is sorted on descending order from database
		 @GetMapping("getAllRecordsIdDesc")
			public List<Player> getAllRecordsIdDesc() {
				return playerservice.getAllRecordsIdDesc();
		 }
//116 @Author:Srinidhi Mohan |  Gets first and last name,created date and year is 1970's from database
		 @GetMapping("getAllRecordonYear1970s")
			public List<Player> getAllRecordsonYear1970s() {
				return playerservice.getAllRecordsonYear1970s();
		 }
//117 @Author:Srinidhi Mohan |  Gets first and last name,created date and year is 1980's from database
		 @GetMapping("getAllRecordonYear1980s")
			public List<Player> getAllRecordsonYear1980s() {
				return playerservice.getAllRecordsonYear1980s();
		 }
//118 @Author:Srinidhi Mohan |  Gets first and last name,created date and year is 1990's from database
		 @GetMapping("getAllRecordonYear1990s")
		 	public List<Player> getAllRecordsonYear1990s() {
			 	return playerservice.getAllRecordsonYear1990s();
		 	}
//119 @Author:Srinidhi Mohan |  Gets first name from database
		 @GetMapping("getAllFirstName")
		 	public List<Player> getAllFirstName() {
			 	return playerservice.getAllFirstName();
		 	}
	
//120 @Author:Srinidhi Mohan |  Gets last name from database
		@GetMapping("getAllLastName")
			public List<Player> getAllLastName() {
				return playerservice.getAllLastName();
				}

}
