package com.mike.stuart.JSON;

import com.mike.stuart.JavaBeans.personBean;
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
            HashMap aMap = (HashMap) JSONUtilities.parse(jsonString);
            System.out.println("Output: " + aMap);
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            personBean newBean3 = new personBean(firstName, lastName, age);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Nasty Path --------------------------------------------------------------------------------------------------
        // put a null into the JSONUtility function
        System.out.println("Nasty Path 1: ");
        try {
            HashMap aMap = (HashMap) JSONUtilities.parse(null);
            System.out.println("Output: " + aMap);
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            personBean newBean2 = new personBean(firstName, lastName, age);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Nasty Path --------------------------------------------------------------------------------------------------
        // put a -1 string in for the JSON Utilities function
        System.out.println("Nasty Path 2: ");
        try {
            HashMap aMap = (HashMap) JSONUtilities.parse("-1");
            System.out.println("Output: " + aMap);
            String firstName = (String) aMap.get("theFirstName");
            String lastName = (String) aMap.get("theLastName");
            int age = Integer.parseInt((String) aMap.get("theAge"));
            personBean newBean2 = new personBean(firstName, lastName, age);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

