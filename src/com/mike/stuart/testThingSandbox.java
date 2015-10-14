package com.mike.stuart;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import java.io.Serializable;

/**
 * Created by Mike on 10/13/2015.
 */
public class testThingSandbox implements Serializable {

    public static void main(String[] args) {
        // happy path
        // give the stringify class a correct object and prints it out
        personBean newBean = new personBean("Mike", "Stuart", 25);
        try {
            String jsonString = JSONUtilities.stringify(newBean);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output the object information in JSON format

        // nasty path
        // put in null for the stringify class then print it out
        try {
            String jsonString2 = JSONUtilities.stringify(null);
            System.out.println(jsonString2);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output a null value

        // nasty path
        // try to parse an object that has a null value in it
        personBean newBean2 = new personBean("Robert", null, 65);
        try {
            String jsonString2 = JSONUtilities.stringify(newBean2);
            System.out.println(jsonString2);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the object but will leave out the null value
    }
}

