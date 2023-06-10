package com.sound.meditionsoundapp.ui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sound.meditionsoundapp.Model.ItemModel;
import com.sound.meditionsoundapp.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.MyViewHolder> {
    private final Context con;
    private final ArrayList<ItemModel> models;
    private final setSoundClickListener click;

    public SoundsAdapter(Context context, ArrayList<ItemModel> modelArrayList, setSoundClickListener clickListener) {
        con = context;
        models = modelArrayList;
        click = clickListener;
    }

    @NonNull
    @Override
    public SoundsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sound, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsAdapter.MyViewHolder holder, int position) {
        System.out.println("--*****---- : val : "+models.get(position).getMeditationValue());
        if (models.get(position).getMeditationValue()==0){
            holder.ConstSound.setBackgroundResource(0);
        }else {
            holder.ConstSound.setBackgroundResource(R.drawable.ic_border_color);
        }
        holder.TvSoundName.setText(models.get(position).getMeditationName());
        holder.IvSoundIcon.setImageResource(models.get(position).getMeditationIcon());
        holder.itemView.setOnClickListener(view -> {
            click.SoundClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView TvSoundName;
        private final ImageView IvSoundIcon;
        private final ConstraintLayout ConstSound;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TvSoundName = itemView.findViewById(R.id.TvSoundName);
            IvSoundIcon = itemView.findViewById(R.id.IvSoundIcon);
            ConstSound = itemView.findViewById(R.id.ConstSound);
        }
    }

    public interface setSoundClickListener {
        void SoundClick(int position);
    }
}
