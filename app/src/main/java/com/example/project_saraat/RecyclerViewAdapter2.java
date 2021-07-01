package com.example.project_saraat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder> {
    Context context;
    List<Concepts> conceptsList;

    public RecyclerViewAdapter2(Concepts_frag concepts_frag, List<Concepts> concepts) {
    }

    public RecyclerViewAdapter2( List<Concepts> conceptsList) {
        this.context = context;
        this.conceptsList = conceptsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.concepts_frag_rv_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Concepts concepts = conceptsList.get(position);
        holder.textView_MainHeading.setText(concepts.Heading);
        holder.textView_SubHeading.setText(concepts.SubHeading);
        holder.textView_Content.setText(concepts.Details);
    }

    @Override
    public int getItemCount() {
        return conceptsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_MainHeading, textView_SubHeading, textView_Content;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_MainHeading = itemView.findViewById(R.id.txt_mainheading);
            textView_SubHeading = itemView.findViewById(R.id.txt_subheading);
            textView_Content = itemView.findViewById(R.id.txt_content);
        }
    }
}
