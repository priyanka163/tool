package com.example.next.bosstudent;

/**
 * Created by next on 23/3/17.
 */
public class Course {


        int id;
        String name;

        public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

