package com.example.project_saraat;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
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
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dialogView = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dailogue_box_concepts, null);
                TextView decs;
                decs = dialogView.findViewById(R.id.descs);
                decs.setText(concepts.getDetails());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return conceptsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_MainHeading, textView_SubHeading, textView_Content;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_MainHeading = itemView.findViewById(R.id.txt_highlight);
            textView_SubHeading = itemView.findViewById(R.id.txt_1);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
