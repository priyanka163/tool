package com.example.next.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.next.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv= (TextView) findViewById(R.id.textViewUnBound);

        DatabindingHelper databindingHelper= DatabindingHelper.get("unbound");
        tv.setText(databindingHelper.message());


        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.setDatabindingHelper(DatabindingHelper.get("Bound"));
    }
}
