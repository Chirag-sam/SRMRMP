package com.example.lenovo.srmcse_rmpcampus;

import android.content.Context;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by lenovo on 2/22/2017.
 */

public class StaffAdapter extends RecyclerView.Adapter <StaffHolder>{
ArrayList<Teacher> list;
    Context mContext;

    public StaffAdapter(ArrayList<Teacher> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public StaffHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.displaystaff, parent, false);

        return new StaffHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StaffHolder holder, int position) {
        final Teacher t=list.get(position);
        holder.tv.setText(t.getName());
        holder.tv2.setText("Qualifications: "+t.getQualifications());
        holder.tv3.setText("Designation: "+t.getDes());
        holder.tv4.setText("Specialisation: "+t.getSpe());
        if (t.getPhoto()!=null)
            Glide.with(mContext).load(t.getPhoto()).placeholder(R.drawable.ic_blackboard).into(holder.iv);
        else holder.iv.setImageResource(R.drawable.ic_blackboard);
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(mContext,R.color.colorPrimary));
                CustomTabsIntent customTabsIntent=builder.build();
                if (t.getLink()!=null)
                customTabsIntent.launchUrl(mContext, Uri.parse(t.getLink()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
