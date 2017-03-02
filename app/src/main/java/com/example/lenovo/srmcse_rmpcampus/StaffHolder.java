package com.example.lenovo.srmcse_rmpcampus;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lenovo on 2/22/2017.
 */
// app:srcCompat="@drawable/cse_hd"
public class StaffHolder extends RecyclerView.ViewHolder {
    TextView tv;
    TextView tv2;
    ImageView iv;
    TextView tv3;
    TextView tv4;
    CardView cv;
    public StaffHolder(View itemView) {
        super(itemView);
        cv=(CardView)itemView.findViewById(R.id.cv);
        tv = (TextView)itemView.findViewById(R.id.tv);
        tv2= (TextView)itemView.findViewById(R.id.tv2);
        iv = (ImageView)itemView.findViewById(R.id.iv);
        tv3= (TextView)itemView.findViewById(R.id.tv3);
        tv4= (TextView)itemView.findViewById(R.id.tv4);
    }


}
