package com.example.lenovo.srmcse_rmpcampus;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AchievementsAdapter extends RecyclerView.Adapter<AchievementsAdapter.ViewHolder> {

    private List<Achievement> myItems;


    public AchievementsAdapter(List<Achievement> items) {
        myItems = items;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.achievementcard, parent, false)); // TODO
    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setData(myItems.get(position));
    }

    public interface ItemListener {
        void onItemClick(Achievement item);
    }

    static

    public class ViewHolder extends RecyclerView.ViewHolder  {
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.tv)
        TextView tv;
        @BindView(R.id.tv2)
        TextView tv2;
        @BindView(R.id.tv3)
        TextView tv3;
        @BindView(R.id.cv)
        CardView cv;
        // TODO - Your view members
        public Achievement item;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            // TODO instantiate/assign view members
        }

        public void setData(Achievement item) {
            this.item = item;
            tv.setText(item.getName());
            tv2.setText(item.getEvent());
            tv3.setText(item.getFest());

            // TODO set data to view
        }


    }

    public static class Achievement {
        String name;
        String event;
        String fest;

        public Achievement(String name, String event, String fest) {
            this.name = name;
            this.event = event;
            this.fest = fest;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public String getFest() {
            return fest;
        }

        public void setFest(String fest) {
            this.fest = fest;
        }
    }


}
