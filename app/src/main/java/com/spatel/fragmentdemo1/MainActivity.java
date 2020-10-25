package com.spatel.fragmentdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragClick1(View view) {
        setFragment(new Fragment1());
        Log.d("tag","setFrag1");
    }

    public void fragClick2(View view) {
        setFragment(new Fragment2());
        Log.d("tag","setFrag2");
    }

    private void setFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction tr = manager.beginTransaction();
        tr.replace(R.id.frame,fragment);
        tr.commit();
    }

}