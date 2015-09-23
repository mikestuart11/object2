import java.util.*;

public class treeSandbox {

    public static void main(String args[]) {

        // nice path
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Zara", 3434.34);
        tm.put("Mahnaz", 123.22);
        tm.put("Ayan", 1378.00);
        tm.put("Daisy", 99.22);
        tm.put("Qadir", -19.08);

        System.out.println(tm);

        // nasty path putting null in for a value
        tm.put("Mike", null);
        System.out.println(tm);

        // nasty path putting null in for a key
        try {
            String nullString = null;
            tm.put(nullString, (double) 0);
            System.out.println(tm);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // nasty path, using get for a key that doesn't exist
        Double result = tm.get("NotAName");
        System.out.println(result);

    }
}