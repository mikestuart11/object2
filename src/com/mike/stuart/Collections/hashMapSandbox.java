package com.mike.stuart.Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMapSandbox {
    public static void main(String[] args) {

        /***************************************************************************************************************
         * Happy Paths
         *
         * remove a key from the hashmap
         * use the contrainsKey() method
         * use contrainsValue() method
         * use the size() method
         * use the value() method
         * use keySet() method
         * use entrySet() method
         * *************************************************************************************************************/

        // Happy path 1 ------------------------------------------------------------------------------------------------
        // this creates a hashmap with keys and values
        System.out.println("Happy Path 1: ");
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");

        System.out.println(map);
        // this prints out the map as expected

        // Happy path 2 ------------------------------------------------------------------------------------------------
        // remove a key from the hashmap
        System.out.println("Happy Path 2: ");
        map.remove(2);
        System.out.println(map);
        // this prints out the hashmap without the 2 key and it's value

        // Happy path 3 ------------------------------------------------------------------------------------------------
        // use the containsKey method in the hashmap class
        System.out.println("Happy Path 3: ");
        System.out.println("map contains the key 3: " + map.containsKey(3));
        // prints out a true because the hashmap has the key 3

        // Happy path 4 ------------------------------------------------------------------------------------------------
        // use the containsValue method in the hashmap class
        System.out.println("Happy Path 4: ");
        System.out.println("map contains the value Three: " + map.containsValue("Three"));
        // this prints out a true becuase the hashmap contains the Value "Three"

        // Happy path 5 ------------------------------------------------------------------------------------------------
        // use the size() method in the hashmap class
        System.out.println("Happy Path 5: ");
        System.out.println("The size of map is: " + map.size());
        // this prints out the current size of the hashmap

        // Happy path 6 ------------------------------------------------------------------------------------------------
        // use values() method in the hashmap class
        System.out.println("Happy Path 6: ");
        System.out.println(map.values());
        // prints out a collection of the values in the hashmap

        // Happy path 7 ------------------------------------------------------------------------------------------------
        // use keySet() method in the hashmap class
        System.out.println("Happy Path 7: ");
        System.out.println(map.keySet());
        // prints out the set of the keys in the hashmap

        // Happy path 8 ------------------------------------------------------------------------------------------------
        // use entrySet() method in the hashmap class
        System.out.println("Happy Path 8: ");
        System.out.println(map.entrySet());
        // this prints out a set of the keys and values in the hashmap

        /***************************************************************************************************************
         * Nasty Paths
         *
         * add value that is null
         * add a key that is null
         * use get for a key that doesn't exist
         * remove a key that doesnt' exist from the hashmap
         * use the containsKey() method for a key that doesn't exist
         * *************************************************************************************************************/

        // Nasty path 1 ------------------------------------------------------------------------------------------------
        // add value that is null
        System.out.println("Nasty Path 1: ");
        try {
            map.put(7, null);
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        } // prints out the hashmap with the key 7 and it's value which is null

        // Nasty path 2 ------------------------------------------------------------------------------------------------
        // add a key that is null
        System.out.println("Nasty Path 2: ");
        try {
            map.put(null, "Test");
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        } // prints out the hashmap and the key which is null and its value which is "Test"

        // Nasty path 3 ------------------------------------------------------------------------------------------------
        // use get for a key that doesn't exist
        System.out.println("Nasty Path 3: ");
        try {
            String result = map.get(45);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } // the output is null for a key that doesn't exist

        // Nasty path 4 ------------------------------------------------------------------------------------------------
        // remove a key that doesn't exist from the hashmap
        System.out.println("Nasty Path 4: ");
        try {
            map.remove(75);
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        } // returns no error and when printing out the hashmap it changes nothing

        // Nasty Path 5 ------------------------------------------------------------------------------------------------
        // use the containsKey method in the hashmap class with a key that doesn't exist
        System.out.println("Nasty Path 5: ");
        System.out.println("map contains the key 98: " + map.containsKey(98));
        // this prints out false, this might be more of a happy path, oh well



    }
}
