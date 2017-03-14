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
        list.add(new Club(null,null,"We provide an International Exposure to students. Our students are sent to the Semester Abroad Program to Ivy League Universities.",null));
        list.add(new Club(null,null,"Our students have made their way to Mozilla Foundation- Learning Hub and selected as  Mozilla Regional Co-Ordinator",null));
        list.add(new Club(null,null,"Our students won various awards and Promotion in Model United Nations conference. ",null));
        list.add(new Club(null,null,"Our Department student has been hired as a member of Dalhousie University, Canada to work with the creative group of “House Tech Incubator”.",null));
        list.add(new Club(null,null,"Our second year student Vijay kishore entered in Guinness World Records Book for “Speed Cubing”.",null));
        list.add(new Club(null,null,"Department has excelled in the field of latest Research Projects, students Innovative Projects and App development.",null));
        list.add(new Club(null,null,"In order to bring in industrial exposure to our department students, we maintain a strong bonding with our alumni and frequent alumni interactions have been arranged.",null));
        list.add(new Club(null,null,"Guest lectures on Entrepreneurship, Placements and IT infrastructure have been conducted by inviting the resource persons from industry to impart entrepreneurial traits and to give the current affairs in tech world.",null));
        list.add(new Club(null,null,"The department achieved 100% placement for successive three years from 2014 to 2016. Many of our students have been placed in Dream Comdpanies like AMAZON, D.E.SHAW, GOLDMAN SACHS, CISCO, etc.,",null));
        list.add(new Club(null,null,"Our UG and PG students achieved University Ranks and Merit Scholarship every year.  ",null));
        list.add(new Club(null,null,"Our Faculty members received the Gold medal in State Level YOGA Competition, Best Paper award in IIT-M computer vision Conference.",null));
        list.add(new Club(null,null,"Career development program has been organized for all the batch students and also students have published various technical papers in indexed journals.",null));
        list.add(new Club(null,null,"Many of our students undergone in-plant training and internship in reputed companies like CISCO, AMAZON, GOLDMAN SACHS etc.",null));
        list.add(new Club(null,null,"Our students gain real world experience by Industrial visits to prominent industries that we are arranging every semester.",null));
        list.add(new Club(null,null," Workshop on APP-X was conducted by CSI student chapter to make every individual to acquire some fruitful knowledge of App Development.",null));

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
