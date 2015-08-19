package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * List fragment class
 */
public class CrimeListFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
    }
}
