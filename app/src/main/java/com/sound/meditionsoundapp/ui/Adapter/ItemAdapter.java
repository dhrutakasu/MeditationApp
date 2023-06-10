package com.sound.meditionsoundapp.ui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sound.meditionsoundapp.Model.ItemModel;
import com.sound.meditionsoundapp.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {
    private final Context con;
    private final ArrayList<ItemModel> models;
    private final setItemClickListener click;

    public ItemAdapter(Context context, ArrayList<ItemModel> itemModelArrayList,setItemClickListener clickListener) {
        con = context;
        models = itemModelArrayList;
        click = clickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_catregory, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.IvCatIcon.setImageResource(models.get(position).getMeditationIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.ItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView IvCatIcon;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            IvCatIcon = (ImageView) itemView.findViewById(R.id.IvCatIcon);
        }
    }

    public interface setItemClickListener {
        void ItemClick(int position);
    }
}
