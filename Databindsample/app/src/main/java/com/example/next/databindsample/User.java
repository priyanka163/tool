package com.example.next.databindsample;

/**
 * Created by next on 17/3/17.
 */
public class User {


    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
