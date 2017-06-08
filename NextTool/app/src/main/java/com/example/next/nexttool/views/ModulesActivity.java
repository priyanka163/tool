package com.example.next.nexttool.views;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.next.nexttool.R;
import com.example.next.nexttool.adpter.MyPagerAdapter;
import com.example.next.nexttool.threads.HomeAsyncTask;

import java.util.ArrayList;

public class ModulesActivity extends AppCompatActivity {
FragmentPagerAdapter adapterViewPager;


    ArrayList<String>  stringArrayListt = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);

        HomeAsyncTask homeAsyncTask= new HomeAsyncTask(this);
        homeAsyncTask.execute();
        stringArrayListt.add("Maths");
        stringArrayListt.add("Chemistry");
        stringArrayListt.add("Social");
        stringArrayListt.add("English");
        stringArrayListt.add("Primary");
        ViewPager vpPager = (ViewPager) findViewById(R.id.Viewpager);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager(),stringArrayListt);
        vpPager.setAdapter(adapterViewPager);

    }




}
