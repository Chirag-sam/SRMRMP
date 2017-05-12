package com.example.lenovo.srmcse_rmpcampus;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.Spanned;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlacementActivity extends AppCompatActivity {


    @BindView(R.id.lv)
    ListView lv;
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.tx2)
    TextView tx2;
    @BindView(R.id.cv)
    CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);
        ButterKnife.bind(this);
        tx2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut vitae justo sit amet erat faucibus mollis ut vel risus. Aenean vel felis eget purus ultrices rhoncus. Quisque ultricies interdum nisi. Vestibulum eu lectus tortor. Donec mollis, nulla in iaculis sagittis, elit libero rutrum");
        Glide.with(this).load("https://16815-presscdn-0-13-pagely.netdna-ssl.com/wp-content/uploads/2015/09/iStock_adult-group-Medium151005.png").placeholder(R.drawable.club).into(iv);

        ArrayList<String> items = new ArrayList<>();
        items.add("Google,999");
        items.add("Microsoft,18");
        items.add("Microsoft,18");
        items.add("Microsoft,18");
        items.add("Microsoft,18");
        items.add("Microsoft,18");
        items.add("Microsoft,18");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        //TextView tv = (TextView) findViewById(R.id.textView2);
        //tv.setText(fromHtml(getString(R.string.OurDept)));
        lv.setAdapter(itemsAdapter);


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
