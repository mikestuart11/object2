package com.mike.stuart;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by Mike on 10/13/2015.
 * I taught these concepts to the class with Shad's help on 16 Oct 2015.
 *
 */
public class objectToJSONString {

    public static void main(String[] args) {
        // happy path 1 ------------------------------------------------------------------------------------------------
        // give the stringify class a correct object and prints it out
        System.out.println("Happy Path 1: ");
        personBean newBean = new personBean("Mike", "Stuart", 25);
        try {
            String jsonString = JSONUtilities.stringify(newBean);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output the object information in JSON format

        // happy path 2 ------------------------------------------------------------------------------------------------
        // give the stringify class a arraylist
        System.out.println("Happy Path 2: ");
        ArrayList numberArray = new ArrayList();
        numberArray.add(5);
        numberArray.add(6);
        numberArray.add(7);
        numberArray.add(8);
        try {
            String jsonString = JSONUtilities.stringify(numberArray);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the arraylist

        // happy path 3 ------------------------------------------------------------------------------------------------
        // give the stringify class a hashmap
        System.out.println("Happy Path 3: ");
        HashMap<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(1, "One");
        testMap.put(2, "Two");
        testMap.put(3, "Three");
        testMap.put(4, "Four");
        testMap.put(5, "Five");
        testMap.put(6, "Six");
        try {
            String jsonString = JSONUtilities.stringify(testMap);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the hashmap

        // happy path 3 ------------------------------------------------------------------------------------------------
        // give the stringify class a treeSet
        System.out.println("Happy Path 4: ");
        TreeSet<Integer> testTree = new TreeSet<Integer>();
        testTree.add(12);
        testTree.add(63);
        testTree.add(34);
        testTree.add(45);
        try {
            String jsonString = JSONUtilities.stringify(testTree);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the treeSet

        // nasty path --------------------------------------------------------------------------------------------------
        // put in null for the stringify class then print it out
        System.out.println("Nasty Path 1: ");
        try {
            String jsonString1 = JSONUtilities.stringify(null);
            System.out.println(jsonString1);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output a string that says null

        // nasty path --------------------------------------------------------------------------------------------------
        // put a negative number in for the parameter for the stringify method
        System.out.println("Nasty Path 2: ");
        try {
            String jsonString3 = JSONUtilities.stringify(-1);
            System.out.println(jsonString3);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this just printed out the -1, very interesting

        // nasty path --------------------------------------------------------------------------------------------------
        // try to parse an object that has a null value in it
        System.out.println("Nasty Path 3: ");
        personBean newBean2 = new personBean("Robert", null, 65);
        try {
            String jsonString4 = JSONUtilities.stringify(newBean2);
            System.out.println(jsonString4);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the object but will leave out the null value

        // nasty path --------------------------------------------------------------------------------------------------
        // this is more testing the personBean class but I wanted to see if it would
        // still work
        System.out.println("Nasty Path 4: ");
        personBean newBean3 = new personBean(null, null, 0);
        try {
            String jsonString5 = JSONUtilities.stringify(newBean3);
            System.out.println(jsonString5);
        } catch (JSONException e) {
            e.printStackTrace();
        } // nothing is printed out to the console at all

        // nasty path --------------------------------------------------------------------------------------------------
        // put in a false object and see what it will do
        System.out.println("Nasty Path 5: ");
        String taco = null;
        try {
            String jsonString6 = JSONUtilities.stringify(taco);
            System.out.println(jsonString6);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this outputs a null
    }
}

