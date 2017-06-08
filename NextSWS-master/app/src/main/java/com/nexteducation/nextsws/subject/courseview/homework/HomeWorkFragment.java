package com.nexteducation.nextsws.subject.courseview.homework;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexteducation.nextsws.BaseFragment;
import com.nexteducation.nextsws.R;
import com.nexteducation.nextsws.databinding.FragmentHomeworkBinding;

/**
 * Created by saisasank on 1/27/2017.
 */

public class HomeWorkFragment extends BaseFragment {

    private FragmentHomeworkBinding mFragmentHomeworkBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentHomeworkBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_homework, container, false);
        return mFragmentHomeworkBinding.getRoot();
    }
}
