package com.mike.stuart;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Mike on 10/26/2015.
 */
public class JSONReadFromFile {

    public static void main(String[] args) {


        /**********************************************************************************************************
         * This should read from a file called test2.txt and inside this file there is a personBean object in JSON
         * format. This should read that information and then parse it into strings so it can be used to make a
         * personBean object.
         **********************************************************************************************************/

        String fileName = "test.json";
        System.out.println("Happy Path 1 :");
        // Happy Path --------------------------------------------------------------------------------------------------
        // this reads in the file and saves the information to a hashMap
        try {
            FileInputStream objectFileStream = new FileInputStream(fileName);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test1HashMap = (HashMap)jsonIn.readObject();
            System.out.println("Output :" + test1HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        }

//        // Nasty Path 1 ----------------------------------------------------------------------------------------------
//        // Putting a null filename into the file input stream
//        System.out.println("Nasty Path 1: ");
//        String nullFileName = null;
//        try {
//            FileInputStream objectFileStream = new FileInputStream(nullFileName);
//            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
//            HashMap test2HashMap = (HashMap) jsonIn.readObject();
//            System.out.println("Output: " + test2HashMap);
//            jsonIn.close();
//        } catch (JSONException|IOException e) {
//            e.printStackTrace();
//        } // this passes errors

//        // Nasty Path 2 ------------------------------------------------------------------------------------------------
//        // if a null is put into the jsoninputstream
//        System.out.println("Nasty Path 2: ");
//        try {
//            FileInputStream objectFileStream = new FileInputStream(fileName);
//            JSONInputStream jsonIn = new JSONInputStream(null);
//            HashMap test3HashMap = (HashMap) jsonIn.readObject();
//
//            System.out.println("Output: " + test3HashMap);
//            jsonIn.close();
//        } catch (JSONException|IOException e) {
//            e.printStackTrace();
//        } // this passes errors

        // Nasty Path 3 ------------------------------------------------------------------------------------------------
        // put in a negative int into jsoninputstream
        System.out.println("Nasty Path 3: ");
        String number = "-1";
        try {
            FileInputStream objectFileStream = new FileInputStream(fileName);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test3HashMap = (HashMap) jsonIn.readObject();

            System.out.println("Output: " + test3HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        } //

        // Nasty Path 4 ------------------------------------------------------------------------------------------------
        // reading from a file that isn't a json file
        System.out.println("Nasty Path 4: ");
        String imageTestFile = "imageJsonTest.bmp";
        try {
            FileInputStream objectFileStream = new FileInputStream(imageTestFile);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test1HashMap = (HashMap)jsonIn.readObject();
            System.out.println("Output :" + test1HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        } // this passes the error: Invalid JSON String

        // Nasty Path 5 ------------------------------------------------------------------------------------------------
        // reading from a file that doesn't exist
        System.out.println("Nasty Path 5: ");
        String fileThatDoesntExist = "fileThatDoesntExist.json";
        try {
            FileInputStream objectFileStream = new FileInputStream(fileThatDoesntExist);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test1HashMap = (HashMap)jsonIn.readObject();
            System.out.println("Output :" + test1HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        } // Passes these errors: Invalid JSON string and The system cannot find the file specified

        // Nasty Path 6 ------------------------------------------------------------------------------------------------
        // reading from a file that we don't have permissions to
        System.out.println("Nasty Path 6: ");
        String noPermissionsFile = "C:/Users/Mike/Object2/testFolder/dontHavePermissionsFile.txt";
        try {
            FileInputStream objectFileStream = new FileInputStream(noPermissionsFile);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test1HashMap = (HashMap)jsonIn.readObject();
            System.out.println("Output :" + test1HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        } // Passes these errors: Invalid JSON string and The system cannot find the file specified


    }
}
