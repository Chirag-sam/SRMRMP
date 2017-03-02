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
        list.add(new Teacher("Dr.J.Jagadeesan","Ph.D","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/it_jagadeesan_j.jpg","Professor and HOD","DBMS, Software Engineering , Networking","http://www.srmuniv.ac.in/"));
        list.add(new Teacher("Mr.Augusitan Issac","M.E,CSE,(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/augustian.jpg","A.P[Sr.G]","CSE"));
        list.add(new Teacher("Mr.Balika J Chellaiah","M.E,CSE,(Ph.D)","http://www.srmuniv.ac.in/sites/ramapuram/files/images/balika_chelliah.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.S.Jaya Kumar","M.E,CSE(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/jayakumar.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.Rathika T","CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/rathika_t_cse.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.R.J.Poovaraghan","CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/poovaraghan.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.Beneth Praba","CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/bennet.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.S.Pandiaraj","CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/pandiya.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.V.Praveena","M.Tech,VLSI Design","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/praveena.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.S.Arun Kumar","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/arun_s.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.M.S.Antony Vigil","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/antony_vigil_cse_rmp.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.T.H.Feiroz Khan","M.E,CSE,(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/t_h_feiroz_khan.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.B.DojohnLoyd","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/Loyd_faculty.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.S.P.Maniraj","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/maniraj_faculty.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.Ahalya Mary J","CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ahalyamary.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.Mrudula Oruganti","M.Tech,CSE","http://www.srmuniv.ac.in/sites/ramapuram/files/images/mrs_mrudula_oruganti.jpg","A.P[O.G]","Android,Programming in C++,Java,Data Analytics,IOT"));
        list.add(new Teacher("Mrs.V.Sellam","M.E,CSE(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sellem_faculty.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.Sarooraj R.B","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sarooraj_faculty.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Ms.Caroline El Fiorenza","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/caroline_cse_rmp.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs. D.Deva Hema","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/deva_hema_cse_rmp.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.R.Angeline","M.E,CSE","http://www.srmuniv.ac.in/sites/ramapuram/files/images/angeline.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.M.Narendran","M.Tech,IT(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/m_narendran.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.P.Sabitha","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/p_sabitha.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.Tadepalli Sarada Kiranmayee","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tadepalli_sarada_kiranmayee.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.G.Kalpana","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/g_kalpana.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.M.Senthil","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/m_senthil.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.M.Subha","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/subha.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.S.Vishnu Dharsini","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/vishnudharshini.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.S.Usha Krithika","M.E,CSE(Ph.D)","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ushakiruthika.jpg","A.P[O.G]","CSE"));
       list.add(new Teacher("Ms.A.Shiny","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/shiny.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.A.Sharmila Agnal","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sharmila_agnal.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mrs.S.Sathya","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sathya.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.K.Sathish","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sathish.jpg","A.P[O.G]","Computer Networks, Database Management Systems"));
        list.add(new Teacher("Mr.M.Saravanan","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/saravanan.jpg","A.P[O.G]","Natural Language Processing, Data Mining, Theory of computations"));
        list.add(new Teacher("Mrs.E.Saraswathi","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/saraswathi.jpg","A.P[O.G]","Data Structures, Computer Networks, Web Technology, Compiler Design"));
        list.add(new Teacher("Ms.S.R.Rajeswari","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/rajeshwari.jpg","A.P[O.G]"," Data Structures, Web Design"));
        list.add(new Teacher("Ms. S.Nandhini","M.E,CSE",null,"A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.M.Prabhu","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/prabhu.jpg","A.P[O.G]","Cloud computing, Data structures, Compiler design, object oriented programming"));
        list.add(new Teacher("Mr.D.Ganesan","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ganesan_d.jpg","A.P[O.G]","Cloud Computing, Cryptography, Network And Domain Security"));
        list.add(new Teacher("Mr.B.Divagar","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/divager.jpg","A.P[O.G]","Cloud computing, computer architecture , software engineering, computer networks"));
        list.add(new Teacher("Mr.D.Bhaskar","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/baskar_d.jpg","A.P[O.G]","Cloud computing and Big Data"));
        list.add(new Teacher("Ms.Adlene Ebenzer","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ebenezer.jpg","A.P[O.G]","Computer System Architecture And Object Oriented Programming Using C++"));
        list.add(new Teacher("Ms.J.Shiva Nandini","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/shivanandhini.jpg","A.P[O.G]","CSE"));
        list.add(new Teacher("Mr.R.J.Shoban Babu","M.E,CSE","http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/shobanbabu.jpg","A.P[O.G]","Computer System Architecture, Database Management System"));
        StaffAdapter s=new StaffAdapter(list,staff.this);
        rv.setAdapter(s);

    }
}
