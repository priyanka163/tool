package com.example.next.datediffexmp;

import android.net.ParseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String dateStart = "01/14/2015";
        String dateStop = "01/20/2015";

        //HH converts hour in 24 hours format (0-23), day calculation
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        Date d1 = null;
        Date d2 = null;

        try {
            try {
                d1 = format.parse(dateStart);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            try {
                d2 = format.parse(dateStop);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //in milliseconds
        long diff = d2.getTime() - d1.getTime();

        // millisecond 1 Day : 24 * 60 * 1000 milisecond
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days ");

    }
}
