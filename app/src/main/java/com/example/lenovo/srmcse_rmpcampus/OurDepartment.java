package com.example.lenovo.srmcse_rmpcampus;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class OurDepartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_department);
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText(Html.fromHtml(getString(R.string.OurDept)));
    }
}
