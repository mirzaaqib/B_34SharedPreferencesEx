package com.pallefire.b_34sharedpreferencesex;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentone extends Fragment {


    public Fragmentone() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragmentone, container, false);
        final EditText et1= (EditText) v.findViewById(R.id.et1);
        final EditText et2 = (EditText) v.findViewById(R.id.et2);
        Button bt1 = (Button) v.findViewById(R.id.bt1);
        Button bt2 = (Button) v.findViewById(R.id.bt2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SharedPreferences sharedPreferences=getActivity().getSharedPreferences("Credentials",0);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("name",et1.getText().toString());
                editor.putString("pw",et2.getText().toString());
                editor.commit(); //save into preferrence file
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.startSecond();


            }
        });
        return v;

    }

}
