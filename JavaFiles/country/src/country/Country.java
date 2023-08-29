package country;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Country {

	@Override
	public String toString() {
		return "Country [india()=" + india() + "]";
	}
	TreeMap<String,TreeMap<String, HashMap<String,HashSet<Cities>>>> india(){
	TreeMap<String,TreeMap<String, HashMap<String,HashSet<Cities>>>> india = new TreeMap<>();
	india.put("India", States.India());
	return india;
	
	}
	public static void main(String[] args) {
		Country c1 = new Country();
		System.out.println(c1.india());
	}
	
}
