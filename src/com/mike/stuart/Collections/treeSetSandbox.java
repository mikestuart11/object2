package com.mike.stuart.Collections;

import java.util.TreeSet;

/**
 * Created by Mike on 11/2/2015.
 */
public class treeSetSandbox {
    public static void main(String args[]) {

        /***************************************************************************************************************
         * Happy Paths
         *
         * create a treeSet and give it values that are strings
         * create a treeSet and give it values that are integers
         * remove element from the treeSet
         * use addAll() method to add values from one treeSet to another treeSet
         * *************************************************************************************************************/

        // Happy Path 1 ------------------------------------------------------------------------------------------------
        // create a treeSet and give it values that are strings
        System.out.println("Happy Path 1: ");
        TreeSet treeSetStrings = new TreeSet();

        treeSetStrings.add("element");
        treeSetStrings.add("Is");
        treeSetStrings.add("My");
        treeSetStrings.add("2.1");
        treeSetStrings.add("3");
        treeSetStrings.add("a");

        System.out.println(treeSetStrings);
        // prints out treeSet of strings

        // Happy Path 2 ------------------------------------------------------------------------------------------------
        // create a treeSet and give it values that are Integers
        System.out.println("Happy Path 2: ");
        TreeSet treeSetIntegers = new TreeSet();
        
        treeSetIntegers.add(7);
        treeSetIntegers.add(8);
        treeSetIntegers.add(9);
        treeSetIntegers.add(10);
        treeSetIntegers.add(11);
        treeSetIntegers.add(12);

        System.out.println(treeSetIntegers);
        // prints out treeSet of Integers

        TreeSet treeSetIntegers2 = new TreeSet();
        treeSetIntegers2.add(20);
        treeSetIntegers2.add(21);
        treeSetIntegers2.add(22);
        treeSetIntegers2.add(23);
        treeSetIntegers2.add(24);
        treeSetIntegers2.add(25);
        treeSetIntegers2.add(26);

        System.out.println(treeSetIntegers2);
        // this prints out the values from the second treeSet that we created

        // Happy Path 3 ------------------------------------------------------------------------------------------------
        // remove an element from the treeSet
        System.out.println("Happy Path 3: ");

        treeSetStrings.remove("element");
        System.out.println(treeSetStrings);
        // removes the entry "element" and then prints out the rest of the treeSet

        // Happy Path 4 ------------------------------------------------------------------------------------------------
        // use the addAll() method to add elements from one treeSet to another treeSet
        // adding elements from treeSetIntegers2 to treeSetIntegers
        System.out.println("Happy Path 4: ");
        treeSetIntegers.addAll(treeSetIntegers2);
        System.out.println(treeSetIntegers);
        // this prints out treeSetIntegers with the original values and the new values from the treeSetIntegers2


        /***************************************************************************************************************
         * Nasty Paths
         *
         *
         *
         * *************************************************************************************************************/

    }
}
