package com.mike.stuart;

import org.quickconnectfamily.json.JSONUtilities;
import java.io.Serializable;

/**
 * Created by Mike on 10/13/2015.
 */
public class testThingSandbox implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String address;
    protected int age;

    public testThingSandbox(String aFirstName, String aLastName, String aAddress, int aAge) {
        firstName = aFirstName;
        lastName = aLastName;
        address = aAddress;
        age = aAge;
    }

    public static void main(String[] args) {
        testThingSandbox anInstance = new testThingSandbox("Mike", "Stuart", "246 Walnut Ave", 25);
            try {
                String jsonString = JSONUtilities.stringify(anInstance);
                System.out.println(jsonString);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
    }
}

