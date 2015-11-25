package com.mike.stuart.JavaBeans;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Mike on 10/7/2015.
 * This class creates a Java Bean called personBean. It has 3 elements, firstName, lastName and age. There is a default
 * constructor, a constructor that accepts 2 strings and a integer, another constructor accepts a hashmap. This creates
 * a personBean object.
 */
public class personBean implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    // default constructor
    public personBean() {

    }
    // constructor
    public personBean(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // constructor to accept a hashmap
    public personBean(HashMap myHashMap) {

        this.firstName = (String)myHashMap.get("firstName");
        this.lastName = (String)myHashMap.get("lastName");
        this.age = Integer.parseInt((String)myHashMap.get("age"));
    }
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personBean{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
