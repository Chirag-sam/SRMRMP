package com.example.lenovo.srmcse_rmpcampus;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;

import com.bluejamesbond.text.DocumentView;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OurDepartment extends AppCompatActivity {

    @BindView(R.id.tx2)
    DocumentView tx2;
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.iv2)
    ImageView iv2;
    @BindView(R.id.tx3)
    DocumentView tx3;
    @BindView(R.id.tx0)
    DocumentView tx0;
    @BindView(R.id.cv1)
    CardView cv1;
    @BindView(R.id.iv3)
    ImageView iv3;
    @BindView(R.id.tx4)
    DocumentView tx4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_department);
        ButterKnife.bind(this);
        //TextView tv = (TextView) findViewById(R.id.textView2);
        //tv.setText(fromHtml(getString(R.string.OurDept)));
        Glide.with(this).load("http://www.srmuniv.ac.in/ramapuram/sites/ramapuram/files/images/vision_mission.jpg").placeholder(R.drawable.dept).into(iv);
        Glide.with(this).load("http://www.srmuniv.ac.in/ramapuram-part-vadapalani/sites/vadapalani/files/images/iste_vdp_banner.jpg").placeholder(R.drawable.gallery).into(iv2);
        Glide.with(this).load("http://i.imgur.com/Wp9rtHd.jpg").placeholder(R.drawable.gallery).into(iv3);

        tx2.setText(fromHtml(getString(R.string.Abtdept)));
        tx3.setText(fromHtml(getString(R.string.Faculties)));
        tx0.setText(fromHtml(getString(R.string.OurDept)));
        tx4.setText(fromHtml(getString(R.string.lab)));

    }

    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html) {
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
