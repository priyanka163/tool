package com.nexteducation.nextsws.subject.courseview.classwork.weekview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexteducation.nextsws.BaseFragment;
import com.nexteducation.nextsws.R;
import com.nexteducation.nextsws.databinding.FragmentWeekviewBinding;

/**
 * Created by saisasank on 1/27/2017.
 */

public class WeekViewFragment extends BaseFragment {

    private FragmentWeekviewBinding mFragmentWeekviewBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentWeekviewBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_weekview, container, false);
        return mFragmentWeekviewBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
