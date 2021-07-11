package com.example.fragments;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment {
    String[] name={"CEO","COO","CFO","CIO","CDO","CMO","CHRO"};
    String[] name1={"Olivia","Sophia","Jayden","Amelia","Josiah","Oliver","Jordan"};

    int [] image={R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,R.drawable.f7};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        ListView li=(ListView)v.findViewById(R.id.l1);
        li.setAdapter(new PasswordAdapter(getActivity(),R.layout.activity_list,name));
        li.setAdapter(new PasswordAdapter(getActivity(),R.layout.activity_list,name1));
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String s=name[position];
                MainActivity m=(MainActivity) getActivity();
                assert m != null;
                m.f1(s);

            }
        });

        return v;
    }
    class PasswordAdapter extends ArrayAdapter {

        public PasswordAdapter(Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.activity_list, null);
            TextView txt1 = (TextView) v.findViewById(R.id.t1);
            txt1.setText(name[position]);
            TextView txt2 = (TextView) v.findViewById(R.id.t2);
            txt2.setText(name1[position]);
            ImageView img = (ImageView) v.findViewById(R.id.i1);
            img.setBackgroundResource(image[position]);

            return v;
        }
    }


}







