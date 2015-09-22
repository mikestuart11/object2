import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSandbox {
	public static void main(String[] args) {

		// this is the happy path
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
	
		// this allows the keys and the values to be printed out 
		// next to each other, sort of like a look up table
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		// nasty path value is null
		map.put(7, null);
		System.out.println(map);
		
		// nasty path key is null
		map.put(null, "Test");
		System.out.println(map);
		
		// nasty path use get for a key that doesn't exist
		String result = map.get(45);
		System.out.println(result);
	}
}
