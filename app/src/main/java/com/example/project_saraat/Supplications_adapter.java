package com.example.project_saraat;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Supplications_adapter extends RecyclerView.Adapter<Supplications_adapter.ViewHolder> {
    List<Model_Suplications> saraat;
    Context context;

    public Supplications_adapter(List<Model_Suplications> saraat) {
        this.saraat = saraat;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_supplications, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model_Suplications model = saraat.get(position);
        holder.txt.setText(saraat.get(position).getText());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dialogView = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_supplications, null);
                TextView decs;
                decs = dialogView.findViewById(R.id.descs);
                decs.setText(model.getDecs());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return saraat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txt_heading);
            constraintLayout = itemView.findViewById(R.id.item_supplications);
        }
    }
}
