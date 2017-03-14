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
        list.add(new Club("http://imgur.com/A5JyGiN.jpg","SLUG-N-PLUG","SLUG N PLUG creates a visual battlefield where students can war against themselves and break the limits of their productive capacity. The hands on experience add to the variety of technical events and programs which prove to be encouraging and resourceful. Slug N Plug is committed to build the best learning experience inside and out.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/U3sMVDG.jpg","SKETCH","A unique club which is focusing on mainly Technical Design. Technical Design has a no of applications and is a very popular occupation. The club is training the students who are interested in artistic ability","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/YnqQasg.jpg","TECH-WIZ"," The motive of the club is to impart knowledge to students about emerging technologies. Techwiz conducts workshops on various topics which are hands-on. Students are benefited as they learn new technologies.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/I6RtwDH.jpg","ANDROPEDIA","Andropedia is an application based community. It aims at nurturing the latest trends and technology. Android being an up growing platform of use. It becomes a need to introduce it to the students. Andropedia does not restrict itself to the android. It keeps updating itself to the latest trends in technology.”","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/mxPGYjN.jpg","CODE CHEF","CodeChef is created as a platform to help programmers make it big in the world of algorithms, computer programming and programming contests.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/hRJQsVt.jpg","CHIPSET","Chipset is an ultimate platform for hackers, innovators, programmers, script writers, entrepreneurs and technocrats. It is an effort towards bringing together innovative minds who dare to see the world differently and hold the potential to use their talents to bring changes to their immediate surroundings and society at large.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tedx15_img6.jpg","LOGIC PLAY","The main objective of this club is to increase the creative and logical thinking of students  by organizing various events such as seminars, activites etc. It also hosts educational workshops in various domanis . Students are encouraged to take part in these events to increase their academic skills.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/q1iIxid.jpg","INTELLECTS","TED Talks, is a global initiative about ideas worth spreading via TEDx","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tedx15_img6.jpg","SYNERGIES","The main aim of this club is to get prepared students for Placements. This club conducts sessions on programming , tests on aptitude and technical programming as well. It also conducts group discussions to practice students to make them prepared for placements.","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tedx15_img6.jpg","TECH-PRO","TED Talks, is a global initiative about ideas worth spreading via TEDx","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/grg1z9w.jpg","RIPPLE","TED Talks, is a global initiative about ideas worth spreading via TEDx","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("https://scontent-sin6-1.xx.fbcdn.net/v/t1.0-9/13432253_1647247632266189_124235939526199415_n.jpg?oh=a0b3aced4a54a9d8f799a6134935bee8&oe=59294189","TECH VAYUNA!","The club is a culinary dish, of ingredients like entrepreneurship, technology and internships. An Enthusiastic CREW!\n" +
                "The main goal of this club is to provide an opportunity for students to broaden their knowledge in these fields and interact with others who have knowledge in these fields.","http://www.techvayuna.com/"));
        list.add(new Club("http://imgur.com/bd0U4Jz.jpg","CYBORG","TED Talks, is a global initiative about ideas worth spreading via TEDx","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/GulReOX.jpg","CSI","CSI is the professional society in which students can participate in all the events conducted by CSI throughout India. As CSI SRM Ramapuram we have conducted various programs in cutting edge technology to enrich students innovative ideas to flourish in different horizons. Students are motivated then and there and help them in growing both technical and managerial skills","https://www.ted.com/tedx/events/9536"));
        list.add(new Club("http://imgur.com/k6wZUs1.jpg","YOGSER5","The main motive of the CLUB is to destress and to increase the memory power as a yoga approach and also to create the awareness of human engineering through  enrichment sessions to reduce the stress and to increase the concentration power.","https://www.ted.com/tedx/events/9536"));



        adapter=new ClubAdapter(list,ClubsActivity.this);
        recycler.setAdapter(adapter);
    }
}
