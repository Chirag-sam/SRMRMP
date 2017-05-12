package com.example.lenovo.srmcse_rmpcampus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class staff extends AppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    ArrayList<Teacher> list = new ArrayList<>();
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.tx2)
    TextView tx2;
    @BindView(R.id.cv)
    CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        ButterKnife.bind(this);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(false);
        rv.setLayoutManager(new LinearLayoutManager(this));
        tx2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut vitae justo sit amet erat faucibus mollis ut vel risus. Aenean vel felis eget purus ultrices rhoncus. Quisque ultricies interdum nisi. Vestibulum eu lectus tortor. Donec mollis, nulla in iaculis sagittis, elit libero rutrum");
        Glide.with(this).load("https://16815-presscdn-0-13-pagely.netdna-ssl.com/wp-content/uploads/2015/09/iStock_adult-group-Medium151005.png").placeholder(R.drawable.club).into(iv);
        list.add(new Teacher("Dr.J.Jagadeesan", "Ph.D", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/it_jagadeesan_j.jpg", "Professor and HOD", "DBMS, Software Engineering , Networking", "http://www.srmuniv.ac.in/ramapuram/content/j-jagadeesan"));
        list.add(new Teacher("Mr.Augusitan Issac", "M.E,CSE,(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/augustian.jpg", "A.P[Sr.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/r-augustian-isaac"));
        list.add(new Teacher("Mr.Balika J Chellaiah", "M.E,CSE,(Ph.D)", "http://www.srmuniv.ac.in/sites/ramapuram/files/images/balika_chelliah.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/balika-j-chelliah"));
        list.add(new Teacher("Mr.S.Jaya Kumar", "M.E,CSE(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/jayakumar.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/mr-s-jaya-kumar"));
        list.add(new Teacher("Mrs.Rathika T", "CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/rathika_t_cse.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/rathika-t"));
        list.add(new Teacher("Mr.R.J.Poovaraghan", "CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/poovaraghan.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/rj-poovaraghan"));
        list.add(new Teacher("Mrs.Beneth Praba", "CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/bennet.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/ms-bennet-praba"));
        list.add(new Teacher("Mr.S.Pandiaraj", "CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/pandiya.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/mr-pandiyarajan"));
        list.add(new Teacher("Mrs.V.Praveena", "M.Tech,VLSI Design", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/praveena.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/v-praveena"));
        list.add(new Teacher("Mr.S.Arun Kumar", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/arun_s.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/s-arunkumar"));
        list.add(new Teacher("Mrs.M.S.Antony Vigil", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/antony_vigil_cse_rmp.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/m-s-antony-vigil"));
        list.add(new Teacher("Mr.T.H.Feiroz Khan", "M.E,CSE,(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/t_h_feiroz_khan.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/t-h-feiroz-khan"));
        list.add(new Teacher("Mr.B.DojohnLoyd", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/Loyd_faculty.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/b-dojohn-loyd"));
        list.add(new Teacher("Mr.S.P.Maniraj", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/maniraj_faculty.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/spmaniraj"));
        list.add(new Teacher("Mrs.Ahalya Mary J", "CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ahalyamary.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/ms-ahalya-mary-j"));
        list.add(new Teacher("Mrs.Mrudula Oruganti", "M.Tech,CSE", "http://www.srmuniv.ac.in/sites/ramapuram/files/images/mrs_mrudula_oruganti.jpg", "A.P[O.G]", "Android,Programming,,IOT", "http://www.srmuniv.ac.in/ramapuram/content/mrs-mrudula-oruganti"));
        list.add(new Teacher("Mrs.V.Sellam", "M.E,CSE(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sellem_faculty.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/v-sellam"));
        list.add(new Teacher("Mr.Sarooraj R.B", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sarooraj_faculty.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/mrrbsaroo-raj"));
        list.add(new Teacher("Ms.Caroline El Fiorenza", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/caroline_cse_rmp.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/j-caroline-el-fiorenza"));
        list.add(new Teacher("Mrs. D.Deva Hema", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/deva_hema_cse_rmp.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/d-deva-hema"));
        list.add(new Teacher("Mrs.R.Angeline", "M.E,CSE", "http://www.srmuniv.ac.in/sites/ramapuram/files/images/angeline.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/r-angeline"));
        list.add(new Teacher("Mr.M.Narendran", "M.Tech,IT(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/m_narendran.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/dr-m-narendran"));
        list.add(new Teacher("Mrs.P.Sabitha", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/p_sabitha.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/mrs-p-sabitha"));
        list.add(new Teacher("Mrs.Tadepalli Sarada Kiranmayee", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/tadepalli_sarada_kiranmayee.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/ms-tadepalli-sarada-kiranmayee"));
        list.add(new Teacher("Mrs.G.Kalpana", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/g_kalpana.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/ms-gkalpana"));
        list.add(new Teacher("Mr.M.Senthil", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/m_senthil.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/mr-m-senthil"));
        list.add(new Teacher("Mrs.M.Subha", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/subha.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/k-subha"));
        list.add(new Teacher("Mrs.S.Vishnu Dharsini", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/vishnudharshini.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/s-vishudharshini"));
        list.add(new Teacher("Mr.S.Usha Krithika", "M.E,CSE(Ph.D)", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ushakiruthika.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/s-usha-kiruthika"));
        list.add(new Teacher("Ms.A.Shiny", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/shiny.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/content/ms-shiny"));
        list.add(new Teacher("Mrs.A.Sharmila Agnal", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sharmila_agnal.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/a-sharmila-agnal"));
        list.add(new Teacher("Mrs.S.Sathya", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sathya.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty-v-sathya"));
        list.add(new Teacher("Mr.K.Sathish", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/sathish.jpg", "A.P[O.G]", "Computer Networks, Database Management Systems", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/k-sathish"));
        list.add(new Teacher("Mr.M.Saravanan", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/saravanan.jpg", "A.P[O.G]", "Natural Language Processing, Data Mining, Theory of computations", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/m-saravanan"));
        list.add(new Teacher("Mrs.E.Saraswathi", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/saraswathi.jpg", "A.P[O.G]", "Data Structures, Computer Networks, Web Technology, Compiler Design", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/e-saraswathi"));
        list.add(new Teacher("Ms.S.R.Rajeswari", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/rajeshwari.jpg", "A.P[O.G]", " Data Structures, Web Design", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/s-r-rajeswari"));
        list.add(new Teacher("Ms. S.Nandhini", "M.E,CSE", " ", "A.P[O.G]", "CSE"));
        list.add(new Teacher("Mr.M.Prabhu", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/prabhu.jpg", "A.P[O.G]", "Cloud computing, Data structures, Compiler design, object oriented programming", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/m-prabhu"));
        list.add(new Teacher("Mr.D.Ganesan", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ganesan_d.jpg", "A.P[O.G]", "Cloud Computing, Cryptography, Network And Domain Security", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/d-ganesan"));
        list.add(new Teacher("Mr.B.Divagar", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/divager.jpg", "A.P[O.G]", "Cloud computing, computer architecture , software engineering, computer networks", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/b-divager"));
        list.add(new Teacher("Mr.D.Bhaskar", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/baskar_d.jpg", "A.P[O.G]", "Cloud computing and Big Data", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/d-bhaskar"));
        list.add(new Teacher("Ms.Adlene Ebenzer", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/ebenezer.jpg", "A.P[O.G]", "Computer System Architecture And Object Oriented Programming Using C++", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/p-adlene-ebenezer"));
        list.add(new Teacher("Ms.J.Shiva Nandini", "M.E,CSE", "http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/shivanandhini.jpg", "A.P[O.G]", "CSE", "http://www.srmuniv.ac.in/ramapuram/cse/faculty/j-shivanandhini"));
        StaffAdapter s = new StaffAdapter(list, staff.this);
        rv.setAdapter(s);

    }
}
