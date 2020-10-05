package com.project.hikingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListPopulerAdapter extends RecyclerView.Adapter<ListPopulerAdapter.ListViewHolder> {
    private ArrayList<PopulerModel> populerModels;
    private Context context;

    public ListPopulerAdapter(ArrayList<PopulerModel> populerModels, Context context) {
        this.populerModels = populerModels;
        this.context = context;
    }


    @NonNull
    @Override
    public ListPopulerAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ListPopulerAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPopulerAdapter.ListViewHolder holder, int position) {
        final PopulerModel model = populerModels.get(position);
        holder.judul.setText(model.getJudul());
        holder.tanggal.setText(model.getTanggal());
    }

    @Override
    public int getItemCount() {
        return populerModels.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView judul, tanggal;

        ListViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            tanggal = itemView.findViewById(R.id.tanggal);
        }
    }
}
