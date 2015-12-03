package mike.stuart.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Mike on 11/2/2015.
 */
public class arrayListSandbox {

    public static void main(String args[]) {

        /***************************************************************************************************************
         * Happy Paths
         *
         * create an arrayList and populate it
         * add elements from one arrayList to another arrayList
         * use the clear() method to clear all elements in the arrayList
         * use the subList() method, which returns a sebset of the arrayList
         * use the isEmpty() method
         *
         * *************************************************************************************************************/

        // Happy Path 1 ------------------------------------------------------------------------------------------------
        // create an arrayList and populating it
        System.out.println("Happy Path 1: ");
        ArrayList happyArrayList = new ArrayList();
        happyArrayList.add(5);
        happyArrayList.add(6);
        happyArrayList.add(7);
        happyArrayList.add(8);
        happyArrayList.add(9);
        happyArrayList.add(10);
        happyArrayList.add(11);

        System.out.println(happyArrayList);
        // the arrayList is created and printed to the console

        // Happy Path 2 ------------------------------------------------------------------------------------------------
        // add element from one arrayList to another new arrayList
        System.out.println("Happy Path 2: ");
        ArrayList arrayToAddArrayTo = new ArrayList();
        arrayToAddArrayTo.addAll(happyArrayList);
        System.out.println(arrayToAddArrayTo);
        // the elements were added to the new array from the previously made array

        // Happy Path 3 ------------------------------------------------------------------------------------------------
        // use the clear() method to clear all elements in the arrayList
        System.out.println("Happy Path 3: ");
        arrayToAddArrayTo.clear();
        System.out.println(arrayToAddArrayTo);
        // all elements were removed from the arrayList

        // Happy Path 4 ------------------------------------------------------------------------------------------------
        // use the subList() method, which returns a sebset of the arrayList
        System.out.println("Happy Path 4: ");
        System.out.println("Elements in index 0 to 2: " + happyArrayList.subList(0, 2));
        // this prints out elements in index place 0 and 1 but not 2

        // Happy Path 5 ------------------------------------------------------------------------------------------------
        // using the isEmpty() method
        System.out.println("Happy Path 5: ");
        System.out.println("If true then the arrayList is empty, false if it contains elements:");
        System.out.println(arrayToAddArrayTo.isEmpty());
        // the arrayList is indeed empty so it returns true

        /***************************************************************************************************************
         * Nasty Paths
         *
         * add element that is out of bounds
         * add a null value to an index
         * remove element that is out of bounds
         * using indexOf() method to ask for index that doesn't exist
         * use the get() method to return an element that is out of bounds
         * use get() on negative number
         * join two lists and pass null
         * *************************************************************************************************************/

        ArrayList nastyArrayList = new ArrayList();
        nastyArrayList.add(10);
        nastyArrayList.add(11);
        nastyArrayList.add(12);
        nastyArrayList.add(13);
        nastyArrayList.add(14);
        nastyArrayList.add(15);
        nastyArrayList.add(16);

        // Nasty Path 1 ------------------------------------------------------------------------------------------------
        // add element that is out of bounds
        System.out.println("Nasty Path 1: ");
        try {
            nastyArrayList.add(50, 7);
            System.out.println(nastyArrayList);
        } catch (Exception e) {
            e.printStackTrace();
        } // Error: rangeCheckForAdd, can't add element to an index that is out of bounds

        // Nasty Path 2 ------------------------------------------------------------------------------------------------
        // add a null value to an index
        System.out.println("Nasty Path 2: ");
        try {
            nastyArrayList.add(null);
            System.out.println(nastyArrayList);
        } catch (Exception e) {
            e.printStackTrace();
        } // this simply adds a null value into the arrayList

        // Nasty Path 3 ------------------------------------------------------------------------------------------------
        // remove element that is out of bounds
        System.out.println("Nasty Path 3: ");
        try {
            nastyArrayList.remove(78);
            System.out.println(nastyArrayList);
        } catch (Exception e) {
            e.printStackTrace();
        } // Exception: OutOfBoundsException

        // Nasty Path 4 ------------------------------------------------------------------------------------------------
        // using indexOf() method to ask for index that doesn't exist
        System.out.println("Nasty Path 4: ");
        try {
            System.out.println(nastyArrayList.indexOf(100));
        } catch (Exception e) {
            e.printStackTrace();
        } // this outputs a -1 to the console but does not pass an exception

        // Nasty Path 5 ------------------------------------------------------------------------------------------------
        // use the get() method to return an element that is out of bounds
        System.out.println("Nasty Path 5: ");
        try {
            System.out.println(nastyArrayList.get(30));
        } catch (Exception e) {
            e.printStackTrace();
        } // Exception: IndexOutOfBoundsException

        // Nasty Path 6 ------------------------------------------------------------------------------------------------
        // use the get() method using a negative index
        System.out.println("Nasty Path 6: ");
        try {
            System.out.println(nastyArrayList.get(-4));
        } catch (Exception e) {
            e.printStackTrace();
        } // Exception: ArrayIndexOutOfBoundsException

        // Nasty Path 7 ------------------------------------------------------------------------------------------------
        // try to merge two arrayLists and pass it null
        System.out.println("Nasty Path 7: ");
        try {
            nastyArrayList.addAll(null);
            System.out.println(nastyArrayList);
        } catch (Exception e) {
            e.printStackTrace();
        } // Exception: NullPointerException
    }
}
