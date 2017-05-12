package com.example.lenovo.srmcse_rmpcampus;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        TextView version = (TextView) findViewById(R.id.introtext2);
        TextView name1 = (TextView) findViewById(R.id.name1);
        TextView name2 = (TextView) findViewById(R.id.name2);
        ImageView logo = (ImageView) findViewById(R.id.introimg);
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        ImageView img3 = (ImageView) findViewById(R.id.image3);
        Glide.with(this).load(R.mipmap.ic_launcher).into(logo);
        img1.setImageResource(R.drawable.ic_person_outline_black_24dp);
        img2.setImageResource(R.drawable.ic_person_outline_black_24dp);
        img3.setImageResource(R.drawable.ic_person_outline_black_24dp);
        version.setText("Version: " + GetAppVersion());
    }

    private String GetAppVersion() {
        try {
            PackageInfo _info = getPackageManager().getPackageInfo(getPackageName(), 0);
            return _info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}