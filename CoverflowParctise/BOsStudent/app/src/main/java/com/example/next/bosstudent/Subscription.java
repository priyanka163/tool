package com.example.next.bosstudent;

/**
 * Created by next on 24/3/17.
 */
public class Subscription {
    int id;
    String name;
    Course course;

    public Subscription(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
