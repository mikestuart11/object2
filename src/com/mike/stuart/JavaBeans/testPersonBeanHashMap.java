package com.mike.stuart.JavaBeans;

import com.mike.stuart.JavaBeans.personBean;

import java.util.HashMap;

/**
 * Created by Mike on 10/21/2015.
 * This is a test for a constructor in my personBean class. This creates a test hashmap and adds keys and values just
 * like what you would get from a JSON string. This then passes the hashmap to the personBean class and the constructor
 * takes the values in the hashmap and converts them into a personBean object
 * the program then uses get functions to access the elements of the object and prints them out
 */
public class testPersonBeanHashMap {

    public static void main(String[] args) {

        HashMap<String, String> hashBobSaget = new HashMap<String, String>();

        hashBobSaget.put("firstName", "Bob");
        hashBobSaget.put("lastName", "Saget");
        hashBobSaget.put("age", "46");

        personBean bobSaget = new personBean(hashBobSaget);

        System.out.println(bobSaget.toString());
    }
}
