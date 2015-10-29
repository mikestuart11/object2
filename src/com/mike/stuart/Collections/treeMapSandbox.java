package com.mike.stuart.Collections;
import java.util.*;

public class treeMapSandbox {
    public static void main(String args[]) {

        // Happy path --------------------------------------------------------------------------------------------------
        // create treeMap and add values to it
        System.out.println("Happy Path 1: ");
        TreeMap<String, String> treeMapExample = new TreeMap<String, String>();

        treeMapExample.put("Mike Stuart", "Vice Principal");
        treeMapExample.put("Madison Stuart", "Principal");

        System.out.println(treeMapExample);
        // this prints out the treeMap as expected

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
        // remove null from the treeMap
        System.out.println("Nasty Path 5: ");
        try {

            System.out.println(treeMapExample);
        } catch (Exception e) {
            e.printStackTrace();
        } // 

    }
}