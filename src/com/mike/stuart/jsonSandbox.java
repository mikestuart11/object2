//package com.mike.stuart;
//
//import org.quickconnectfamily.json.JSONOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//
//
///**
// * Created by Mike on 10/13/2015.
// * This shows wrapping a FileOutputStream in a JSONOutputStream
// * I'm not sure if it's working or not. I'm not sure how to test this.
// * It currently runs with errors.
// */
//public class jsonSandbox {
//
//        File aFile = new File("test.json");
//        try {
//            FileOutputStream aFileStream = new FileOutputStream(aFile);
//            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
//            jsonOut.writeObject(aSerializableObject);
//            jsonOut.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//}
