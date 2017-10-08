package com.example.root.nestedactivities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buGoToForm1(View view) {
        FormOneFragment formOneFragment = new FormOneFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainLayout, formOneFragment)
                .commit();
    }

    public void buGoToForm2(View view) {
        FormTwoFragment formtwoFragment = new FormTwoFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainLayout, formtwoFragment)
                .commit();
    }
}
