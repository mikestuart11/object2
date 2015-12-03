package mike.stuart.JSON;

import mike.stuart.JavaBeans.personBean;
import org.quickconnectfamily.json.*;

import java.io.*;

/**
 * Created by Mike on 10/19/2015.
 */
public class JSONWriteToFile implements Serializable {

    public static void main(String[] args) {

        personBean aPersonBean = new personBean("Mike", "Stuart", 25);

        // Happy Path---------------------------------------------------------------------------------------------------
        System.out.println("Happy Path 1: ");

            File testHashMapFile = new File("testHashMap.txt");
        try {
            FileOutputStream aFileStream = new FileOutputStream(testHashMapFile);
            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
            jsonOut.writeObject(aPersonBean);
            System.out.println(aPersonBean);
            jsonOut.close();
        } catch (FileNotFoundException|JSONException e) {
            e.printStackTrace();
        } // this writes the object to a file

        // Nasty Path 1 ------------------------------------------------------------------------------------------------
        // write null to a file
        System.out.println("Nasty Path 1: ");
        File testNullObjectFile = new File("testNullObject.txt");
        try {
            FileOutputStream aFileStream = new FileOutputStream(testNullObjectFile);
            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
            jsonOut.writeObject(null);
            System.out.println(aPersonBean);
            jsonOut.close();
        } catch (FileNotFoundException|JSONException e) {
            e.printStackTrace();
        } // this writes nothing to a file

        // Nasty Path 2 ------------------------------------------------------------------------------------------------
        // write to a file that already exists
        System.out.println("Nasty Path 2: ");
        File copyOverAFileTestFile = new File("copyOverAFileTest.txt");
        try {
            FileOutputStream aFileStream = new FileOutputStream(copyOverAFileTestFile);
            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
            jsonOut.writeObject(null);
            System.out.println(aPersonBean);
            jsonOut.close();
        } catch (FileNotFoundException|JSONException e) {
            e.printStackTrace();
        } // this writes over the file


        // Nasty Path 3 ------------------------------------------------------------------------------------------------
        // write out to a file and you don't have write permissions to the directory
        System.out.println("Nasty Path 3: ");
        File writeToFolderWithoutPermissionsFile = new File("C:/Users/Mike/Object2/testFolder/writeToFolderWithoutPermissions.txt");
        try {
            FileOutputStream aFileStream = new FileOutputStream(writeToFolderWithoutPermissionsFile);
            JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
            jsonOut.writeObject(null);
            System.out.println(aPersonBean);
            jsonOut.close();
        } catch (FileNotFoundException|JSONException e) {
            e.printStackTrace();
        } // it would not allow me to write to the file because of access denied


    }
}
