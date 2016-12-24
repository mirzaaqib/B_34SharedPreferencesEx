package com.pallefire.b_34sharedpreferencesex;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentsecond extends Fragment {
    TextView tv1,tv2;


    public Fragmentsecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragmentsecond, container, false);
        tv1= (TextView) v.findViewById(R.id.tv1);
         tv2 = (TextView) v.findViewById(R.id.tv2);
        //we have to read data from reference file here

        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("Credentials",0);
        String val1=sharedPreferences.getString("name",null);
        String val2=sharedPreferences.getString("pw",null);
        tv1.setText("Name is.."+val1);
        tv2.setText("password is.."+val2);
        //end of task
        return v;
    }

}
