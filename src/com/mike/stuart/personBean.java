package com.mike.stuart;

import java.io.Serializable;

/**
 * Created by Mike on 10/7/2015.
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
}
