package com.sound.meditionsoundapp.ui.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sound.meditionsoundapp.Model.ItemModel;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.ui.Activity.SoundPlayerActivity;
import com.sound.meditionsoundapp.ui.Adapter.ItemAdapter;
import com.sound.meditionsoundapp.utils.Constants;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private View HomeView;
    private Context context;
    private RecyclerView RvHome;
    private ArrayList<ItemModel> itemModelArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeView = inflater.inflate(R.layout.fragment_main, container, false);

        initViews();
        initActions();
        return HomeView;
    }

    private void initViews() {
        context = getContext();
        RvHome = (RecyclerView) HomeView.findViewById(R.id.RvHome);
    }

    private void initActions() {
        itemModelArrayList = new ArrayList<>();
        ItemModel itemModel = new ItemModel(getString(R.string.study), R.drawable.ic_study);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.focus), R.drawable.ic_focus);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.chanting), R.drawable.ic_chanting);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.memory), R.drawable.ic_memory);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.relaxation), R.drawable.ic_relaxation);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.sleep), R.drawable.ic_sleep);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.intelligence), R.drawable.ic_intelligent);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.euphoria), R.drawable.ic_euphoria);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.healing), R.drawable.ic_helling);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.astral_travel), R.drawable.ic_astral_travel);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.intuition), R.drawable.ic_intuition);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.creativity), R.drawable.ic_creativity);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.third_eye), R.drawable.ic_third_eye);
        itemModelArrayList.add(itemModel);

        RvHome.setLayoutManager(new GridLayoutManager(context, 2,RecyclerView.VERTICAL,false));
        RvHome.setAdapter(new ItemAdapter(context, itemModelArrayList, position -> {
            startActivity(new Intent(context, SoundPlayerActivity.class)
                    .putExtra(Constants.ItemName,itemModelArrayList.get(position).getMeditationName())
                    .putExtra(Constants.ItemIcon,itemModelArrayList.get(position).getMeditationIcon()));
        }));
    }
}