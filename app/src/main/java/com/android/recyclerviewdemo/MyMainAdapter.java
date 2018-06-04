package com.android.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kamalshree on 6/4/2018.
 */

public class MyMainAdapter extends RecyclerView.Adapter<MyMainAdapter.ViewHolderMotivationalList>{

    private static final String TAG = "mainAdapter";
    private int motivationalItems;

    public MyMainAdapter(int motivationalItems) {
        this.motivationalItems = motivationalItems;
    }

    @NonNull
    @Override
    public MyMainAdapter.ViewHolderMotivationalList onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.motivation_list_items;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        ViewHolderMotivationalList viewHolder = new ViewHolderMotivationalList(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolderMotivationalList holder, int position) {
        Log.d(TAG, "#" + position);
        holder.motivational_List.setText("Position Val--- "+String.valueOf(position));
    }


    @Override
    public int getItemCount() {
        return motivationalItems;
    }

    class ViewHolderMotivationalList extends RecyclerView.ViewHolder{

        TextView motivational_List;
        public ViewHolderMotivationalList(View itemView) {
            super(itemView);
            motivational_List= itemView.findViewById(R.id.tv_motivation);
        }
    }
}


