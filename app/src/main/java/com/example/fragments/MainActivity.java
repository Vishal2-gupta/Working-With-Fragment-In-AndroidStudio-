package com.example.fragments;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction t=manager.beginTransaction();
        Fragment1 n=new Fragment1();
        t.add(R.id.fragment1,n);
        t.commit();
    }

    public void f1(String s) {
        FragmentManager manager1=getSupportFragmentManager();
        FragmentTransaction t1=manager1.beginTransaction();
        Fragment2 m=new Fragment2();
        Bundle b=new Bundle();
        b.putString("s",s);
        m.setArguments(b);
        t1.replace(R.id.fragment2,m);
        t1.commit();
    }


}