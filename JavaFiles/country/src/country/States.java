package country;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class States {
	


	static  TreeMap<String, HashMap<String,HashSet<Cities>>> India() {
		
	TreeMap<String, HashMap<String,HashSet<Cities>>> tamilNadu = new TreeMap<>();
	tamilNadu.put("Tamil Nadu", District.tamilNadu());
	TreeMap<String, HashMap<String,HashSet<Cities>>> kerala = new TreeMap<>();
	kerala.put("Kerala",District.kerala() );
	TreeMap<String, HashMap<String,HashSet<Cities>>> andraPradesh = new TreeMap<>();
	andraPradesh.put("AP", District.andraPradesh());
	return kerala;
}

}
