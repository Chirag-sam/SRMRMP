package com.example.lenovo.srmcse_rmpcampus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by lenovo on 2/22/2017.
 */

public class GridAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> cate;
    private  String[] text={
            "Our Department",
            "Campus life",
            "Clubs",
            "Placements",
            "Academics",
            "Staff"
    };

    private  int[] Imageid={
            R.drawable.dept,
            R.drawable.gallery,
            R.drawable.club,
            R.drawable.place,
            R.drawable.rules,
            R.drawable.tea



    };
    public GridAdapter(Context c) {
        mContext = c;

    }
    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View v;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            v = LayoutInflater.from(mContext).inflate(R.layout.iconlayout,null);


        } else {
            v =  convertView;
        }

        ImageView imageView = (ImageView)v.findViewById(R.id.iv);
        TextView textView=(TextView)v.findViewById(R.id.tv);
        textView.setText(text[i]);
        Glide.with(mContext).load(Imageid[i]).into(imageView);
       // imageView.setImageResource(Imageid[i]);


        return v;
    }
}
