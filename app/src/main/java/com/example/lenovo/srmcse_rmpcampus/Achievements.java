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
    ArrayList<Club> list = new ArrayList<>();
ClubAdapter adapter;
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
        list.add(new Club("http://i64.tinypic.com/o8gtjp.png","Achievements in sports","The Department of Computer Science and Engineering of SRM University, Ramapuram is proud to have B.Aravind and S.G.Thilak Desingh of III year who have brought laurels to the department by being part of winning under 19 Thiruvallur District and All – India YSCA trophy respectively by April 2013. Both are currently playing under Tamil Nadu Cricket Association for III Division.",null));
        list.add(new Club("http://i68.tinypic.com/213rz1y.png","SAP Programs","In SRM University, the department of CSE makes sure that its students get global exposure through its Semester Abroad Program, students of  this department are given an opportunity to apply to some of the well known Universities of, MIT, Cornell, Casrneige Melton, University of Wisconsin etc,. The program aims at providing students a way that can help them to develop skill that will bridge the gap the eastern and western way of applying knowledge. Students are given an opportunity to finish one complete semester ion any of the universities and return back to SRM University ",null));
        list.add(new Club("http://i68.tinypic.com/m99l48.png","Extra curricular activities","Nikhila Nyapathy, Palla Nitin Kumar Reddy, Rahul D. Pathak won the First Runner up team award by IIT – Delhi and BITS Pilani,In Strengthening the Policing Contest 2013- Ensuring Women Safety in India held by FICCI .",null));

        adapter=new ClubAdapter(list,Achievements.this,true);
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
