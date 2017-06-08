package com.example.next.bosstudent;

/**
 * Created by next on 24/3/17.
 */
public class StudentModel {



    int id;
    String name;
    int rollNo;

    public StudentModel(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
