package com.example.lenovo.srmcse_rmpcampus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClubsActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.activity_clubs)
    RelativeLayout activityClubs;
    ArrayList<Club> list = new ArrayList<>();
    ClubAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        ButterKnife.bind(this);
        recycler.setHasFixedSize(false);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        list.add(new Club("http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tedx15_img6.jpg","TED-X","TED Talks, is a global initiative about ideas worth spreading via TEDx","https://www.ted.com/tedx/events/9536"));
        adapter=new ClubAdapter(list,ClubsActivity.this);
    }
}
