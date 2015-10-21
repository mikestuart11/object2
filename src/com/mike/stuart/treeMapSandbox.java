package com.mike.stuart;

import java.util.*;

public class treeMapSandbox {

    public static void main(String args[]) {

        // nice path
        TreeMap<Object, String> tm = new TreeMap<Object, String>();

        personBean mikeStuart = new personBean("Mike", "Stuart", 25);

        tm.put(mikeStuart, "Vice Principal");

        System.out.println(tm);

//        // nasty path putting null in for a value
//        tm.put("Mike", null);
//        System.out.println(tm);
//
//        // nasty path putting null in for a key
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