package com.example.next.githubdragndropimpl;

/**
 * Created by next on 3/5/17.
 */

import com.touchmenotapps.keyring.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutFragment extends Fragment {

    private View mHolder;

    public AboutFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mHolder = inflater.inflate(R.layout.fragment_about, null);
        return mHolder;
    }

}