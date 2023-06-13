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

public class DashboardFragment extends Fragment {

    private View DashboardView;
    private Context context;
    private RecyclerView RvDashboard;
    private ArrayList<ItemModel> itemModelArrayList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DashboardView = inflater.inflate(R.layout.fragment_dashboard, container, false);

        initViews();
        initListeners();
        initActions();
        return DashboardView;
    }

    private void initViews() {
        context = getContext();
        RvDashboard = (RecyclerView) DashboardView.findViewById(R.id.RvDashboard);
    }

    private void initListeners() {

    }

    private void initActions() {
        itemModelArrayList = new ArrayList<>();
        ItemModel itemModel = new ItemModel(getString(R.string.ocean), R.drawable.ic_ocean);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.forest), R.drawable.ic_forest_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.rain), R.drawable.ic_rain_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.night), R.drawable.ic_night);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.lake), R.drawable.ic_lake_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.creek), R.drawable.ic_creek);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.grassland), R.drawable.ic_grassland_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.cave), R.drawable.ic_cave_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.farm), R.drawable.ic_farm_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.fire), R.drawable.ic_fire_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.waterfall), R.drawable.ic_waterfall_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.underwater), R.drawable.ic_underwater_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.dessert), R.drawable.ic_dessert_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.train), R.drawable.ic_train_joureny);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.air_travel), R.drawable.ic_air_travel);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.cafe), R.drawable.ic_cafe_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.harmony), R.drawable.ic_harmony_card);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.hope_of_better), R.drawable.ic_hop_better);
        itemModelArrayList.add(itemModel);
            itemModel = new ItemModel(getString(R.string.look_within), R.drawable.ic_look_within);
        itemModelArrayList.add(itemModel);

        RvDashboard.setLayoutManager(new GridLayoutManager(context,2));
        RvDashboard.setAdapter(new ItemAdapter(context,itemModelArrayList,position -> {
            startActivity(new Intent(context, SoundPlayerActivity.class)
                    .putExtra(Constants.ItemName,itemModelArrayList.get(position).getMeditationName())
                    .putExtra(Constants.ItemIcon,itemModelArrayList.get(position).getMeditationIcon()));
        }));
    }
}