package com.sound.meditionsoundapp.ui.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sound.meditionsoundapp.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Context context;
    private NavController NcMain;
    private AppBarConfiguration AcMain;
    private BottomNavigationView NavBottomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
        initActions();
    }

    private void initViews() {
        context = this;
        NavBottomView = (BottomNavigationView) findViewById(R.id.NavBottomView);
        NcMain = Navigation.findNavController(this, R.id.NcMain);
    }

    private void initListeners() {
        NavBottomView.setOnNavigationItemSelectedListener(this);
    }

    private void initActions() {
        NcMain.navigate(R.id.NavHome);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.NcMain);
        return NavigationUI.navigateUp(navController, AcMain) || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.NavHome:
                NcMain.navigate(R.id.NavTraining);
                return true;
            case R.id.NavDashboard:
                NcMain.popBackStack(R.id.NavTraining, false);
                NcMain.navigate(R.id.NavDashboard);
                return true;
            case R.id.NavInformation:
                NcMain.popBackStack(R.id.NavTraining, false);
                NcMain.navigate(R.id.NavInformation);
                return true;
            case R.id.NavNotification:
                NcMain.popBackStack(R.id.NavTraining, false);
                NcMain.navigate(R.id.NavNotification);
                return true;
        }
        return false;
    }
}