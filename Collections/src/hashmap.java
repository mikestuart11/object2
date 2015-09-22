import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
	public static void main(String[] args) {
		// creates a new hashmap called map
		// the key will be an integer and the value 
		// will be a string
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a key: ");
		Integer inputKey = input.nextInt(); 
		String number = map.get(inputKey);
		System.out.println("The number is " + number);
		
		// this allows the keys and the values to be printed out 
		// next to each other, sort of like a look up table
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
}
