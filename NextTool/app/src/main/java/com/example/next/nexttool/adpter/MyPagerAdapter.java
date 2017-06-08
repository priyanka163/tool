package com.example.next.nexttool.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.next.nexttool.views.SubjectFragment;

import java.util.ArrayList;

/**
 * Created by next on 11/5/17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;
   ArrayList<String> stringArrayList ;
    public MyPagerAdapter(FragmentManager fragmentManager, ArrayList<String> stringArrayListt) {
        super(fragmentManager);
        this.stringArrayList = stringArrayListt;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return stringArrayList.size();
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {

        return SubjectFragment.getInstance(position,stringArrayList.get(position));
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return stringArrayList.get(position);
    }

}