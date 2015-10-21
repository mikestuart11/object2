package com.mike.stuart;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Mike on 10/19/2015.
 */
public class convertJSONtoString implements Serializable {

    public static void main(String[] args) {
        // this creates a JSON string with three elements, theFirstName, theLastName, and theAge
        String jsonString =
                "{\"theFirstName\":\"Tyler\"" +
                ",\"theLastName\":\"Roberts\"" +
                ",\"theAge\":\"25\"}";

        try {
            // this creates a hashmap and parses the JSON string into it
            HashMap aMap = (HashMap)JSONUtilities.parse(jsonString);
            // this prints out the hashmap to the console, you'll notice that it's out of order
            // this is because hashmaps don't care what order things are in
            System.out.println(aMap);
            // this gets the values from the hashmap and parses them
            // into variables to later be put into a bean
            String firstName = (String)aMap.get("theFirstName");
            String lastName = (String)aMap.get("theLastName");
            int age = Integer.parseInt((String)aMap.get("theAge"));
            // I take the parsed strings and ints and put them into a bean
            personBean newBean3 = new personBean(firstName, lastName, age);
            // I create a file to send all of the information to
            File aFile = new File("test.txt");

            try {
                // this wraps a jsonoutputstream in a fileoutputstream
                FileOutputStream aFileStream = new FileOutputStream(aFile);
                JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
                jsonOut.writeObject(newBean3);
                jsonOut.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
