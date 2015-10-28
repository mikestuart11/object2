package com.mike.stuart;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import java.io.Serializable;

/**
 * Created by Mike on 10/13/2015.
 * I taught these concepts to the class with Shad's help on 16 Oct 2015.
 *
 */
public class objectToJSONString implements Serializable {

    public static void main(String[] args) {
        // happy path
        // give the stringify class a correct object and prints it out
        System.out.println("Happy Path: ");
        personBean newBean = new personBean("Mike", "Stuart", 25);
        try {
            String jsonString = JSONUtilities.stringify(newBean);
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output the object information in JSON format

        // nasty path
        // put in null for the stringify class then print it out
        System.out.println("Nasty Path 1: ");
        try {
            String jsonString1 = JSONUtilities.stringify(null);
            System.out.println(jsonString1);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will output a null value

        // nasty path
        // put a negative number in for the parameter for the stringify method
        System.out.println("Nasty Path 2: ");
        try {
            String jsonString3 = JSONUtilities.stringify(-1);
            System.out.println(jsonString3);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this just printed out the -1, very interesting

        // nasty path
        // try to parse an object that has a null value in it
        System.out.println("Nasty Path 3: ");
        personBean newBean2 = new personBean("Robert", null, 65);
        try {
            String jsonString4 = JSONUtilities.stringify(newBean2);
            System.out.println(jsonString4);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the object but will leave out the null value

        // nasty path
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

        // nasty path
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

