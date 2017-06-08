package com.example.next.bosstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StudentModel> studentModelList= new ArrayList<>();
        StudentModel  studentModel= new StudentModel(1,"priya",234);
        studentModelList.add(studentModel);
          studentModel= new StudentModel(3,"soumya",432);
        studentModelList.add(studentModel);
          studentModel= new StudentModel(6,"Shreya",223);
        studentModelList.add(studentModel);
        studentModel= new StudentModel(5,"bhavya",203);
        studentModelList.add(studentModel);



        ArrayList<Subscription> subscriptionsList = new ArrayList<>();
        Subscription subscriptions = new Subscription(23, "Subcription1", new Course(1, "java"));
        subscriptionsList.add(subscriptions);
        subscriptions = new Subscription(45, "Subcription2", new Course(2, "android"));
        subscriptionsList.add(subscriptions);
        subscriptions = new Subscription(77, "Subcription3", new Course(3, "ios"));
        subscriptionsList.add(subscriptions);
        subscriptions = new Subscription(32, "Subcription4", new Course(4, "javascript"));
        subscriptionsList.add(subscriptions);



        Map<Integer, ArrayList<Subscription>> arrayList = new HashMap<>();

        for(int i=0; i<studentModelList.size(); i++)
        {
            arrayList.put(studentModelList.get(i).getId(), subscriptionsList);
            //Log.i( "onCreate: "+arrayList.put(studentModelList.get(i).getId(), subscriptionsList);
        }

        int i=0;
        for (Map.Entry<Integer, ArrayList<Subscription>> entry : arrayList.entrySet())
        {
            System.out.println("Student---");
            int rollNo = entry.getKey();
            System.out.println("Student roll No: "+rollNo);
            for(int j=0; j<arrayList.get(rollNo).size(); j++)
            {
                System.out.println("Subscription id: "+arrayList.get(rollNo).get(j).getId()
                        +" Subscription name: "+arrayList.get(rollNo).get(j).getName()
                        +" Course name: "+arrayList.get(rollNo).get(j).getCourse().getName());
            }
            i++;

        }
    }



    }

