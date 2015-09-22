import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		
		String text = map.get(4);
		
		System.out.println("The number is " + text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
}
