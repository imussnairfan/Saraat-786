package com.example.project_saraat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.project_saraat.R.color.yellow_frag_bg;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder> {
    Context context;
    List<Highlights> highlightsList;

    public RecyclerViewAdapter1(Home_frag home_frag, List<Highlights> highlights) {
    }

    public RecyclerViewAdapter1(List<Highlights> highlightsList) {
        this.context = context;
        this.highlightsList = highlightsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_frag_rv_items,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Highlights highlights = highlightsList.get(position);
        holder.imageView.setImageResource(highlights.Highlight_Images);
    }

    @Override
    public int getItemCount() {
        return highlightsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
