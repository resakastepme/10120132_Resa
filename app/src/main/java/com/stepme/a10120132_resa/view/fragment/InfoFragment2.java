package com.stepme.a10120132_resa.view.fragment;
//10120132
// RESA KOMARA AKBARI
// IF4
// 23 MAY 2023
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.stepme.a10120132_resa.R;

public class InfoFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info_slide2, container, false);
        return rootView;
    }
}

