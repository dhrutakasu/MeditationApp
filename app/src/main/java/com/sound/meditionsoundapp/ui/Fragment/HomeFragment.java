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

public class HomeFragment extends Fragment {
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
        HomeView = inflater.inflate(R.layout.fragment_home, container, false);

        initViews();
        initListeners();
        initActions();
        return HomeView;
    }

    private void initViews() {
        context = getContext();
        RvHome = (RecyclerView) HomeView.findViewById(R.id.RvHome);
    }

    private void initListeners() {

    }

    private void initActions() {
        itemModelArrayList = new ArrayList<>();
        ItemModel itemModel = new ItemModel(getString(R.string.study), R.drawable.img12);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.focus), R.drawable.img3);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.chanting), R.drawable.img2);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.memory), R.drawable.img9);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.relaxation), R.drawable.img10);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.sleep), R.drawable.img11);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.intelligence), R.drawable.img7);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.euphoria), R.drawable.img4);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.healing), R.drawable.img6);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.astral_travel), R.drawable.img1);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.intuition), R.drawable.intuition);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.creativity), R.drawable.creativity);
        itemModelArrayList.add(itemModel);
        itemModel = new ItemModel(getString(R.string.third_eye), R.drawable.img13);
        itemModelArrayList.add(itemModel);

        RvHome.setLayoutManager(new GridLayoutManager(context,2));
        RvHome.setAdapter(new ItemAdapter(context,itemModelArrayList));

    }
}