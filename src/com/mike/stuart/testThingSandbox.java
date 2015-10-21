package com.mike.stuart;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import java.io.Serializable;

/**
 * Created by Mike on 10/13/2015.
 * I taught these concepts to the class with Shad's help on 16 Oct 2015.
 *
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
        // put a negative number in for the parameter for the stringify method
        try {
            String jsonString2 = JSONUtilities.stringify(-1);
            System.out.println(jsonString2);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this just printed out the -1, very interesting

        // nasty path
        // try to parse an object that has a null value in it
        personBean newBean2 = new personBean("Robert", null, 65);
        try {
            String jsonString2 = JSONUtilities.stringify(newBean2);
            System.out.println(jsonString2);
        } catch (JSONException e) {
            e.printStackTrace();
        } // this will print out the object but will leave out the null value

        // nasty path
        // this is more testing the personBean class but I wanted to see if it would
        // still work
        personBean newBean3 = new personBean(null, null, 0);
        try {
            String jsonString2 = JSONUtilities.stringify(newBean2);
            System.out.println(jsonString2);
        } catch (JSONException e) {
            e.printStackTrace();
        } // nothing is printed out to the console at all

        // nasty path
        // put in a false object and see wht it will do
//        try {
//            String jsonString2 = JSONUtilities.stringify(taco);
//            System.out.println(jsonString2);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        } // the program won't compile, exception is caught with the error: cannot find symbol
    }
}

