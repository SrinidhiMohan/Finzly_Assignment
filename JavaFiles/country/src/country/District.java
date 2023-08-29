package country;


import java.util.HashMap;
import java.util.HashSet;
//import java.io.*;
public class District {

	 static HashMap<String,HashSet<Cities>> tamilNadu(){

HashSet<Cities> chennai = new HashSet<Cities>();
Cities c1 = new Cities("Anna nagar");
Cities c2 = new Cities("Adambakkam");
Cities c3 = new Cities("Perambur");

chennai.add(c1);
chennai.add(c2);
chennai.add(c3);


HashSet<Cities> coimbatore = new HashSet<>();
	
Cities c4 = new Cities("Kangayampalayam");
Cities c5 = new Cities("Kannampalayam");
Cities c6 = new Cities("Karumathampatti");
coimbatore.add(c4);
coimbatore.add(c5);
coimbatore.add(c6);

HashSet<Cities> cuddalore = new HashSet<>();
	
Cities c7 = new Cities("Annamalai Nagar");
Cities c8 = new Cities("Bhuvanagiri");
Cities c9 = new Cities("Kattumannarkoil");
cuddalore.add(c7);
cuddalore.add(c8);
cuddalore.add(c9);

HashMap<String,HashSet<Cities>> tamilNadu = new HashMap<>();
tamilNadu.put("Chennai", chennai);
tamilNadu.put("coimbatore", coimbatore);
tamilNadu.put("cuddalore", cuddalore);	
return tamilNadu;
	
	}
	
	static HashMap<String,HashSet<Cities>> kerala() {
	HashSet<Cities> kozhikode = new HashSet<Cities>();
	Cities c1 = new Cities("Kinassery");
	Cities c2 = new Cities("Koduvally ");
	Cities c3 = new Cities("Koodaranji ");

	kozhikode.add(c1);
	kozhikode.add(c2);
	kozhikode.add(c3);


	HashSet<Cities> palakkad = new HashSet<>();
		
	Cities c4 = new Cities("Ayyapuram");
	Cities c5 = new Cities("Jainamedu");
	Cities c6 = new Cities("Chittur");
	palakkad.add(c4);
	palakkad.add(c5);
	palakkad.add(c6);

	HashSet<Cities> alappuzha = new HashSet<>();
		
	Cities c7 = new Cities("Kayamkulam");
	Cities c8 = new Cities("Kokkamangalam ");
	Cities c9 = new Cities("Komalapuram");
	alappuzha.add(c7);
	alappuzha.add(c8);
	alappuzha.add(c9);

	HashMap<String,HashSet<Cities>> kerala = new HashMap<>();
	kerala.put("Kozhikode", kozhikode);
	kerala.put("Palakkad", palakkad);
	kerala.put("alappuzha", alappuzha);
	return kerala;
}
	static HashMap<String,HashSet<Cities>> andraPradesh() {
		HashSet<Cities> srikakulam	 = new HashSet<Cities>();
		Cities c1 = new Cities("Amudalavalasa");
		Cities c2 = new Cities("Kasibugga");
		Cities c3 = new Cities("Singupuram");

		srikakulam.add(c1);
		srikakulam.add(c2);
		srikakulam.add(c3);


		HashSet<Cities> vizianagaram = new HashSet<>();
			
		Cities c4 = new Cities("Cheepurupalli");
		Cities c5 = new Cities("Kanapaka");
		Cities c6 = new Cities("Sriramnagar");
		vizianagaram.add(c4);
		vizianagaram.add(c5);
		vizianagaram.add(c6);

		HashSet<Cities> visakhapatnam = new HashSet<>();
			
		Cities c7 = new Cities("Gajuwaka");
		Cities c8 = new Cities("Anakapalle");
		Cities c9 = new Cities("Pendurthi");
		visakhapatnam.add(c7);
		visakhapatnam.add(c8);
		visakhapatnam.add(c9);

		HashMap<String,HashSet<Cities>> kerala = new HashMap<>();
		kerala.put("Srikakulam", srikakulam);
		kerala.put("Vizianagaram", vizianagaram);
		kerala.put("Visakhapatnam", visakhapatnam);
		return kerala;
	}
}
