package com.example.next.deleteelement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        deleteElement();
        }

    private void deleteElement()
    {
        for (int i = 1; i < 16; i++)
            arrayList.add((i + 1) * 10);


        System.out.println("Elements before deletion:");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");

        int j = 0;
        for (int i = 0; i < arrayList.size(); ) {
            j++;
            if (j == 3) {
                arrayList.remove(i);
                j = 0;
            } else
                i++;
        }
        System.out.println("Elements after deletion:");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
    }




}

