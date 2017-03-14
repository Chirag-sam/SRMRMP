package com.example.lenovo.srmcse_rmpcampus;

import android.content.Context;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 3/3/2017.
 */

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ClubHolder> {
    ArrayList<Club> list;
    Context mContext;
    Boolean a=false;

    public ClubAdapter(ArrayList<Club> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public ClubAdapter(ArrayList<Club> list, Context mContext, Boolean a) {
        this.list = list;
        this.mContext = mContext;
        this.a = a;
    }

    @Override
    public ClubHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.clubcard, parent, false);

        return new ClubHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ClubHolder holder, int position) {
        final Club c=list.get(position);
        if (c.getImageurl()!=null)
        Glide.with(mContext).load(c.getImageurl()).centerCrop().placeholder(R.drawable.club).into(holder.iv);
        else {
            holder.iv.setPadding(10,10,10,10);
            holder.iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
            holder.iv.setImageResource(R.drawable.ic_cup);}
        holder.tv.setText(c.getTitle());
        holder.tv2.setText(c.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!a){
                CustomTabsIntent.Builder builder=new CustomTabsIntent.Builder();
                builder.setToolbarColor(ContextCompat.getColor(mContext,R.color.colorPrimary));
                CustomTabsIntent customTabsIntent=builder.build();
                if (c.getLink()!=null)
                    customTabsIntent.launchUrl(mContext, Uri.parse(c.getLink()));}
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ClubHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.tv)
        TextView tv;
        @BindView(R.id.tv2)
        TextView tv2;
        @BindView(R.id.cv)
        CardView cv;
        public ClubHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
