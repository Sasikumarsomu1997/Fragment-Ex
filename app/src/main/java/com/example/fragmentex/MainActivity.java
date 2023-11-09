package com.example.fragmentex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button , button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.fragmentButton1);
        button2 = findViewById(R.id.fragmentButton2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadfragment(new BlankFragmentFirst());


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadfragment(new BlankFragmentSecond());

            }
        });


    }

    public void loadfragment(Fragment fragment){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();

    }
}