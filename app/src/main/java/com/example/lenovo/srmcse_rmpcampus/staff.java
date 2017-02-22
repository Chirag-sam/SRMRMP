package com.example.lenovo.srmcse_rmpcampus;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class staff extends AppCompatActivity {
    ArrayList<Teacher> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        RecyclerView rv=(RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(false);
        rv.setLayoutManager(new LinearLayoutManager(this));
        list.add(new Teacher("Vijay","CSE",null,"HOD","AI"));
        list.add(new Teacher("Chirag","CSE",null,"Dean","AI"));
        list.add(new Teacher("Mrudula","CSE","http://www.srmuniv.ac.in/sites/ramapuram/files/images/mrs_mrudula_oruganti.jpg","Chairman","Android"));
        StaffAdapter s=new StaffAdapter(list,staff.this);
        rv.setAdapter(s);

    }
}
