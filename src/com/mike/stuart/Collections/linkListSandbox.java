package com.mike.stuart.Collections;

import java.util.LinkedList;

/**
 * Created by Mike on 11/2/2015.
 */
public class linkListSandbox {

    public static void main(String args[]) {

        /***************************************************************************************************************
         * Happy Paths
         *
         * create linkList and add values to it
         * add a value into a linkedList at a specific index
         * use addFirst() to add a value to the beginning of the list
         * set the value of an element that already exists and replace the value
         * remove an element using its index
         *
         * *************************************************************************************************************/

        // Happy Path 1 ------------------------------------------------------------------------------------------------
        // create linkedlist and add values to it
        System.out.println("Happy Path 1: ");
        LinkedList testLinkedList = new LinkedList();

        testLinkedList.add("Example1");
        testLinkedList.add("Example2");
        testLinkedList.add("Example3");
        testLinkedList.add("Example4");
        testLinkedList.add("Example5");
        testLinkedList.add("Example6");
        testLinkedList.add("Example7");
        testLinkedList.add("Example8");

        System.out.println(testLinkedList);
        // printed out the linkedList to the console like expected

        // Happy Path 2 ------------------------------------------------------------------------------------------------
        // add a value into a linkedList at a specific index
        System.out.println("Happy Path 2: ");
        testLinkedList.add(1, "Example10");
        System.out.println(testLinkedList);
        // this adds the value into the index and moves all other values up one to their index

        // Happy Path 3 ------------------------------------------------------------------------------------------------
        // use addFirst() method to add a value to the beginning of the list
        System.out.println("Happy Path 3: ");
        testLinkedList.addFirst("Example11");
        System.out.println(testLinkedList);
        // this adds the value to the beginning of the list

        // Happy Path 4 ------------------------------------------------------------------------------------------------
        // set the value of an element that already exists and replace the value
        System.out.println("Happy Path 4: ");
        testLinkedList.set(1, "NewElement");
        System.out.println(testLinkedList);
        // replaces the value in a specific index

        // Happy Path 5 ------------------------------------------------------------------------------------------------
        // remove an element using its index
        System.out.println("Happy Path 5: ");
        testLinkedList.remove(7);
        System.out.println(testLinkedList);
        // this removes the element at the index defined and moves all elements after it down one index

        /***************************************************************************************************************
         * Nasty Paths
         *
         * remove element by index that doesn't exist
         * add element that is out of bounds
         * add element that is null
         * add element with negative index
         *
         * *************************************************************************************************************/

        // Nasty Path 1 ------------------------------------------------------------------------------------------------
        // remove element that doesn't exist
        System.out.println("Nasty Path 1: ");
        testLinkedList.remove(90);
        System.out.println(testLinkedList);
        // Error: IndexOutOfBoundsException

        // Nasty Path 2 ------------------------------------------------------------------------------------------------
        // add element that is out of bounds
        System.out.println("Nasty Path 2: ");
        testLinkedList.add(65, "out of bounds");
        System.out.println(testLinkedList);
        // Error: IndexOutOfBoundsException

        // Nasty Path 3 ------------------------------------------------------------------------------------------------
        // add element that is null
        System.out.println("Nasty Path 3: ");
        testLinkedList.add(null);
        System.out.println(testLinkedList);
        // adds null value onto the end of the list

        // Nasty Path 4 ------------------------------------------------------------------------------------------------
        // add element with negative index
        System.out.println("Nasty Path 4: ");
        testLinkedList.add(-2, "negative index");
        System.out.println(testLinkedList);
        // Error: checkPositionIndex


    }
}
