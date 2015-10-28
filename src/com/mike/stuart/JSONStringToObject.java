package com.mike.stuart;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

import java.util.HashMap;

/**
 * Created by Mike on 10/28/2015.
 */
public class JSONStringToObject {

    public static void main(String[] args) {
        // this creates a JSON string with three elements, theFirstName, theLastName, and theAge
        String jsonString =
                "{\"theFirstName\":\"Tyler\"" +
                        ",\"theLastName\":\"Roberts\"" +
                        ",\"theAge\":\"25\"}";
        // Happy Path --------------------------------------------------------------------------------------------------
        System.out.println("Happy Path: ");
        try {
            // this creates a hashmap and parses the JSON string into it
            HashMap aMap = (HashMap) JSONUtilities.parse(jsonString);
            // this prints out the hashmap to the console, you'll notice that it's out of order
            // this is because hashmaps don't care what order things are in
            System.out.println("Output: " + aMap);
            // this gets the values from the hashmap and parses them
            // into variables to later be put into a bean
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            // I take the parsed strings and ints and put them into a bean
            personBean newBean3 = new personBean(firstName, lastName, age);
            // I create a file to send all of the information to

        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Nasty Path --------------------------------------------------------------------------------------------------
        // put a null into the JSONUtility function
        System.out.println("Nasty Path 1: ");
        try {
            // this creates a hashmap and parses the JSON string into it
            HashMap aMap = (HashMap) JSONUtilities.parse(null);
            // this prints out the hashmap to the console, you'll notice that it's out of order
            // this is because hashmaps don't care what order things are in
            System.out.println("Output: " + aMap);
            // this gets the values from the hashmap and parses them
            // into variables to later be put into a bean
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            // I take the parsed strings and ints and put them into a bean
            personBean newBean2 = new personBean(firstName, lastName, age);
            // I create a file to send all of the information to

        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Nasty Path --------------------------------------------------------------------------------------------------
        // put a -1 string in for the JSON Utilities function
        System.out.println("Nasty Path 2: ");
        try {
            // this creates a hashmap and parses the JSON string into it
            HashMap aMap = (HashMap) JSONUtilities.parse("-1");
            // this prints out the hashmap to the console, you'll notice that it's out of order
            // this is because hashmaps don't care what order things are in
            System.out.println("Output: " + aMap);
            // this gets the values from the hashmap and parses them
            // into variables to later be put into a bean
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            // I take the parsed strings and ints and put them into a bean
            personBean newBean2 = new personBean(firstName, lastName, age);
            // I create a file to send all of the information to

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

