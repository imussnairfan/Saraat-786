package com.example.project_saraat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

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

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Highlights highlights = highlightsList.get(position);
        holder.textView_mainHeading.setText(highlights.Main_Heading);
        holder.textView_subheading.setText(highlights.Sub_Heading);
        holder.textView_highlights.setText(highlights.Highlight);
    }

    @Override
    public int getItemCount() {
        return highlightsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_mainHeading, textView_subheading, textView_highlights;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_mainHeading = itemView.findViewById(R.id.txt_highlight);
            textView_subheading = itemView.findViewById(R.id.txt_1);
            textView_highlights = itemView.findViewById(R.id.txt_2);
        }
    }
}
