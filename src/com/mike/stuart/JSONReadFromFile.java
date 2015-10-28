package com.mike.stuart;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;

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
         *
         **********************************************************************************************************/

        String fileName = "test2.txt";
        System.out.println("Happy Path:");
        // Happy Path
        // this reads in the file and turns it into a personBean
        try {
            FileInputStream objectFileStream = new FileInputStream(fileName);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test1HashMap = (HashMap)jsonIn.readObject();
            System.out.println("Output :" + test1HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        }

        // Nasty Path 1
        // This is if there is no file input into the file stream, the file is null
        System.out.println("Nasty Path 1: ");
        String nullFileName = null;

        try {
            FileInputStream objectFileStream = new FileInputStream(nullFileName);
            JSONInputStream jsonIn = new JSONInputStream(objectFileStream);
            HashMap test2HashMap = (HashMap) jsonIn.readObject();

            System.out.println("Output: " + test2HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        }

        // Nasty Path 2
        // if a null is put into the jsoninputstream
        System.out.println("Nasty Path 2: ");

        try {
            FileInputStream objectFileStream = new FileInputStream(fileName);
            JSONInputStream jsonIn = new JSONInputStream(null);
            HashMap test3HashMap = (HashMap) jsonIn.readObject();

            System.out.println("Output: " + test3HashMap);
            jsonIn.close();
        } catch (JSONException|IOException e) {
            e.printStackTrace();
        }

        // Nasty Path 3
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
        }


    }
}
