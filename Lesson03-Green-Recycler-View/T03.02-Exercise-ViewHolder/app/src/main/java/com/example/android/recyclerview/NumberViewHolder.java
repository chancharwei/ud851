package com.example.android.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jtborst on 13/02/2017.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView view;

    public NumberViewHolder(View itemView) {
        super(itemView);

        view = (TextView) itemView.findViewById(R.id.rv_tv_item_number);
    }

    public void bind(int viewId) {
        view.setText(String.valueOf(viewId));
    }
}
