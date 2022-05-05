package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapBasics {

	public static void main(String[] args) {

		HashMap<String,String> countryNames = new HashMap<>();
		countryNames.put("UK", "London");
		countryNames.put("Isreal", "Telaviv");
		countryNames.put("Germany", "Berlin");
		countryNames.put("France", "Paris");
		countryNames.put("India", "Delhi");
		countryNames.put("Budapest", "Hungry");
		countryNames.put("Poland", "Warsaw");

		//System.out.println(countryNames.get("UK"));

		//iterate over the keys: by using keySet();
		Iterator<String>itr=countryNames.keySet().iterator();
		while(itr.hasNext()){
			String key=itr.next();
			String values=countryNames.get(key);
			System.out.println("The key is "+key+" and the values is "+values);
		}

		System.out.println("------------------------------------------");
		//iterate over the pair(set): by using entrySet();
		Iterator<Entry<String,String>>itr1=countryNames.entrySet().iterator();
		while(itr1.hasNext()){
			Entry<String, String> entry=itr1.next();
			System.out.println("The country is "+entry.getKey()+" and the capital city is "+entry.getValue());

		}

		System.out.println("------------------------------------------");

		//iterate hashmap using java 8 for each and lambda
		countryNames.forEach((k,v)-> System.out.println("key is "+k+" and value is "+v));

	}

}
