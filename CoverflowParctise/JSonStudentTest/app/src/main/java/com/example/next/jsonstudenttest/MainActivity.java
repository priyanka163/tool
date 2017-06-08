package com.example.next.jsonstudenttest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
String reader=jsonreader();

        JsonData jsonData= new JsonData();
        jsonData.readJson(reader);
    }
    public String jsonreader()
    {
        String json = null;
        InputStream jsondata = null;
        try
        {
            jsondata = getAssets().open("student.json");

            int size = jsondata.available();
            byte[] buffer = new byte[size];
            jsondata.read(buffer);
            jsondata.close();
            json = new String(buffer);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return json;
    }


}
