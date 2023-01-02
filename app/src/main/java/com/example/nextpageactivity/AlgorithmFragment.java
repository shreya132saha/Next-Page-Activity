package com.example.nextpageactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AlgorithmFragment extends Fragment {

    //public static final String TITLE="title";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_algorithm, container, false);
    }
    /*@Override
    public  void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        ((TextView)view.findViewById(R.id.textView)).setText(TITLE) ;
    }*/
}