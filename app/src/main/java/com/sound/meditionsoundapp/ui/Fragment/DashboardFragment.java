package com.sound.meditionsoundapp.ui.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sound.meditionsoundapp.Model.ItemModel;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.ui.Adapter.ItemAdapter;

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
        ItemModel itemModel = new ItemModel(getString(R.string.ocean), R.drawable.re_img13);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.forest), R.drawable.re_img8);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.rain), R.drawable.re_img14);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.night), R.drawable.re_img12);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.lake), R.drawable.re_img11);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.creek), R.drawable.re_img4);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.grassland), R.drawable.re_img9);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.cave), R.drawable.re_img3);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.farm), R.drawable.re_img6);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.fire), R.drawable.re_img7);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.waterfall), R.drawable.re_img18);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.underwater), R.drawable.re_img16);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.dessert), R.drawable.re_img5);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.train), R.drawable.re_img15);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.air_travel), R.drawable.re_img1);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.cafe), R.drawable.re_img2);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.harmony), R.drawable.re_img10);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.hope_of_better), R.drawable.re_img19);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.look_within), R.drawable.re_img20);
        itemModelArrayList.add(itemModel);

        RvDashboard.setLayoutManager(new GridLayoutManager(context,2));
        RvDashboard.setAdapter(new ItemAdapter(context,itemModelArrayList,position -> {

        }));
    }
}