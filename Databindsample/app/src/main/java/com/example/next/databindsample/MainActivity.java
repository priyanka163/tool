package com.example.next.databindsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.next.databindsample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        User user= new User("priyanka","ganajalkhed");

        binding.setUserviewmodel(new Userviewmodel(user));




    }
}
