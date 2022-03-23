package com.example.notificationmoduledesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notificationmoduledesign.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PendingFragmentP8#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PendingFragmentP8 extends Fragment {


    public PendingFragmentP8(String s) {
        // Required empty public constructor
    }


    public static PendingFragmentP8 newInstance(String param1, String param2) {
        PendingFragmentP8 fragment = new PendingFragmentP8("Page 1");

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pending_p8, container, false);
    }
}