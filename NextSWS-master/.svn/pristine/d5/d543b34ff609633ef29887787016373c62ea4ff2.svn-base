package com.nexteducation.nextsws.subject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.nexteducation.nextsws.BaseFragment;
import com.nexteducation.nextsws.R;
import com.nexteducation.nextsws.customviews.IconSlider;
import com.nexteducation.nextsws.databinding.FragmentCourseviewBinding;
import com.nexteducation.nextsws.subject.courseview.classwork.dayview.DayViewFragment;
import com.nexteducation.nextsws.subject.courseview.classwork.weekview.WeekViewFragment;
import com.nexteducation.nextsws.subject.courseview.homework.HomeWorkFragment;

/**
 * Created by saisasank on 1/24/2017.
 */

public class HolderFragment extends BaseFragment implements IconSlider.OnIconChangeListener, AdapterView.OnItemSelectedListener{

    private FragmentCourseviewBinding mFragmentCourseviewBinding;
    private String[] mCourseviewModes;
    private String[] mCourseviewCategories;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentCourseviewBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_courseview, container, false);
        return mFragmentCourseviewBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCourseviewModes = getResources().getStringArray(R.array.courseview_modes);
        mCourseviewCategories = getResources().getStringArray(R.array.course_view_mode_names);

        ArrayAdapter<String> modesAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, mCourseviewModes);
        mFragmentCourseviewBinding.courseviewModeSpinner.setAdapter(modesAdapter);
        mFragmentCourseviewBinding.courseviewModeSpinner.setSelection(0);
        mFragmentCourseviewBinding.courseviewModeSpinner.setOnItemSelectedListener(this);

        /* Setting Icon Change Listener */
        mFragmentCourseviewBinding.iconSlider.setOnIconChangeListener(this);

        setCategoryName(mCourseviewCategories[0]);


    }

    private void setCategoryName(String categoryName) {
        mFragmentCourseviewBinding.categoryName.setText(categoryName);
    }


    @Override
    public void onIconChange(View view, int position) {
        setCategoryName(mCourseviewCategories[position]);
        switch (position) {
            case 0:
                addFragment(new DayViewFragment(), R.id.frame_layout, false);
                break;
            case 1:
                addFragment(new HomeWorkFragment(), R.id.frame_layout, false);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new DayViewFragment();
                break;
            case 1:
                fragment = new WeekViewFragment();
                break;
        }
        addFragment(fragment, R.id.frame_layout, false);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
