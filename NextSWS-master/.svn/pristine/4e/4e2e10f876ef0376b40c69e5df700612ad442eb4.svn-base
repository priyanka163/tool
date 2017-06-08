package com.nexteducation.nextsws.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nexteducation.nextsws.subject.HolderFragment;

/**
 * Created by saisasank on 1/24/2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        fragment = new HolderFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
