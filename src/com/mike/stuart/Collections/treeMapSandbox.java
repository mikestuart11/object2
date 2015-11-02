package com.mike.stuart.Collections;
import java.util.*;

public class treeMapSandbox {
    public static void main(String args[]) {

        /***************************************************************************************************************
         *
         * Happy Paths
         *
         * create treeMap and add keys and values to it
         * use the navigableKeySet() method
         * use the ceilingEntry() method
         * use the descendingMap() method
         * use the keySet() method
         *
         * *************************************************************************************************************/

        // Happy path 1 ------------------------------------------------------------------------------------------------
        // create treeMap and add values to it
        System.out.println("Happy Path 1: ");
        TreeMap<String, String> treeMapExample = new TreeMap<String, String>();

        treeMapExample.put("Mike Stuart", "Vice Principal");
        treeMapExample.put("Madison Stuart", "Principal");

        System.out.println(treeMapExample);
        // this prints out the treeMap as expected

        // Happy path 2 ------------------------------------------------------------------------------------------------
        // use the navigableKeySet() method
        System.out.println("Happy Path 2: ");
        System.out.println(treeMapExample.navigableKeySet());
        // returns a set of the keys in the treeMap in descending order

        // Happy path 3 ------------------------------------------------------------------------------------------------
        // use the ceilingEntry() method
        System.out.println("Happy Path 3: ");
        System.out.println(treeMapExample.ceilingEntry("Principal"));
        // returns a null value

        // Happy path 4 ------------------------------------------------------------------------------------------------
        // use the descendingMap() method
        System.out.println("Happy Path 4: ");
        System.out.println(treeMapExample.descendingMap());
        // prints out the treemap in descending order

        // Happy path 5 ------------------------------------------------------------------------------------------------
        // use the keySet() method
        System.out.println("Happy Path 5: ");
        System.out.println(treeMapExample.keySet());
        // returns set of keys in the treeMap

        /***************************************************************************************************************
         *
         * Nasty Paths
         *
         * adds a null value
         * adds a null value into the putAll() method
         * putting a null in for a key
         * remove null from the treeMap
         * remove key that doesn't exist
         *
         * *************************************************************************************************************/

        // Nasty path 1 ------------------------------------------------------------------------------------------------
        // adds a null value associated with a string key
        System.out.println("Nasty Path 1: ");
        treeMapExample.put("Mike", null);
        System.out.println(treeMapExample);
        // this prints out the treeMap and has the Mike key and the value is null

        // Nasty path 2 ------------------------------------------------------------------------------------------------
        // adds a null value into the putAll method
        System.out.println("Nasty Path 2: ");
        try {
            treeMapExample.putAll(null);
            System.out.println(treeMapExample);
        } catch (Exception e) {
            e.printStackTrace();
        } // Error: Error with Native Method, it didn't work

        // nasty path 3 ------------------------------------------------------------------------------------------------
        // putting a null in the a key
        System.out.println("Nasty Path 3: ");
        try {
            String nullString = null;
            treeMapExample.put(nullString, "Value");
            System.out.println(treeMapExample);
        } catch (Exception e) {
            e.printStackTrace();
        } // Error: NullPointerException, it didn't work


        // nasty path 4 ------------------------------------------------------------------------------------------------
        // remove null from the treeMap
        System.out.println("Nasty Path 4: ");
        try {
            treeMapExample.remove(null);
            System.out.println(treeMapExample);
        } catch (Exception e) {
            e.printStackTrace();
        } // Error: NullPointerException

        // nasty path 5 ------------------------------------------------------------------------------------------------
        // remove key that doesn't exist from the treeMap
        System.out.println("Nasty Path 5: ");
        try {
            treeMapExample.remove(95);
            System.out.println(treeMapExample);
        } catch (Exception e) {
            e.printStackTrace();
        } // Error: NullPointerException

    }
}