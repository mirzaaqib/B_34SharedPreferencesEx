package com.pallefire.b_34sharedpreferencesex;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragmentone fragmentone=new Fragmentone();
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1,fragmentone);
        fragmentTransaction.commit();
    }
    public  void startSecond(){
        Fragmentsecond fragmentsecond=new Fragmentsecond();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container1,fragmentsecond);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
