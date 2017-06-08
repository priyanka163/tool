package com.example.next.program4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
             numbers.add(10);
             numbers.add(20);
             numbers.add(30);
             numbers.add(40);
             numbers.add(50);
             numbers.add(60);
             numbers.add(70);
             numbers.add(80);
             numbers.add(90);
             numbers.add(100);
             numbers.add(110);
             numbers.add(120);





        while(numbers.size() > 1)


         { for(int i = 1; i < numbers.size()-1;i++){
             if(i%2 == 0)
         {
             //Every 3rd element should be true

             numbers.remove(i);
             Log.i("deleting", "onCreate: "+numbers.remove(i));
                  break;

         } }
             Log.i("delete", "onCreate: "+numbers);
         }



        }
}
