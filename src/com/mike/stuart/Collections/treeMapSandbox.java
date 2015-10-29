package com.mike.stuart.Collections;

import java.util.*;

public class treeMapSandbox {

    public static void main(String args[]) {

        // Happy path --------------------------------------------------------------------------------------------------
        // create treeMap and add values to it
        System.out.println("Happy Path 1: ");
        TreeMap<String, String> tm = new TreeMap<String, String>();

        tm.put("Mike Stuart", "Vice Principal");
        tm.put("Madison Stuart", "Principal");

        System.out.println(tm);
        // this prints out the treeMap as expected

        // Nasty path --------------------------------------------------------------------------------------------------
        // adds a null value associated with a string key
        System.out.println("Nasty Path 1: ");
        tm.put("Mike", null);
        System.out.println(tm);
        // this prints out the treeMap and has the Mike key and the value is null

        // nasty path --------------------------------------------------------------------------------------------------
        // putting null in for a key
        System.out.println("Nasty Path 2: ");
//        try {
//            String nullString = null;
//            tm.put(nullString, (d);
//            System.out.println(tm);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
////
////        // nasty path, using get for a key that doesn't exist
////        try {
////            Double result = tm.get("NotAName");
////            System.out.println(result);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }

    }
}