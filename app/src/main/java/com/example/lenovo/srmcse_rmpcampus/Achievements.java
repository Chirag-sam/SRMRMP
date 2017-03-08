package com.example.lenovo.srmcse_rmpcampus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Achievements extends AppCompatActivity {
    ArrayList<AchievementsAdapter.Achievement> list = new ArrayList<>();
AchievementsAdapter adapter;
    RelativeLayout activityAchievements;
    ArrayAdapter<String> x;
    @BindView(R.id.rv)
    RecyclerView rv;
    @BindView(R.id.activity_staff)
    RelativeLayout activityStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        ButterKnife.bind(this);
        rv.setHasFixedSize(false);
        rv.setLayoutManager(new LinearLayoutManager(this));
        list.add(new AchievementsAdapter.Achievement("Dhruv Marwha","Exploit the code, coding and debugging, web development , project"," 	Aurganon 2K14, Infoyez 2K14,Tech Club" ));
        adapter=new AchievementsAdapter(list);
        rv.setAdapter(adapter);

    }
    public class Achievement {
        String name;
        String event;
        String fest;

        public Achievement(String name, String event, String fest) {
            this.name = name;
            this.event = event;
            this.fest = fest;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public String getFest() {
            return fest;
        }

        public void setFest(String fest) {
            this.fest = fest;
        }
    }

}
