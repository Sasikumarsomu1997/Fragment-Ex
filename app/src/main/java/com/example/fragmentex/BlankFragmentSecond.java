package com.example.fragmentex;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragmentSecond extends Fragment {

    Button button2;
    TextView textView2;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@NonNull ViewGroup container , @NonNull Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.fragment_blank_second,container,false);

        button2 = view.findViewById(R.id.button2);
        textView2 = view.findViewById(R.id.text2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Welcome to the fragment 1", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}