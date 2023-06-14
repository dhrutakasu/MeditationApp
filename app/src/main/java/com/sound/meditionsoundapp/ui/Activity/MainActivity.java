package com.sound.meditionsoundapp.ui.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdSize;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sound.meditionsoundapp.Ads.Ad_Banner;
import com.sound.meditionsoundapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private NavController NcMain;
    private ImageView IvSetting;
    private ImageView IvHome, IvSound, IvInfo;
    private AppBarConfiguration AcMain;

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
        IvSetting = (ImageView) findViewById(R.id.IvSetting);
        IvHome = findViewById(R.id.IvHome);
        IvSound = findViewById(R.id.IvSound);
        IvInfo = findViewById(R.id.IvInfo);
        NcMain = Navigation.findNavController(this, R.id.NcMain);
    }

    private void initListeners() {
        IvSetting.setOnClickListener(this);
        IvHome.setOnClickListener(this);
        IvSound.setOnClickListener(this);
        IvInfo.setOnClickListener(this);
    }

    private void initActions() {
        Ad_Banner.getInstance().showBanner(this, AdSize.LARGE_BANNER, (RelativeLayout) findViewById(R.id.RlAdView), (RelativeLayout) findViewById(R.id.RlAdViewMain));

        NcMain.navigate(R.id.NavHome);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NcMain.navigate(R.id.NavHome);
        NavController navController = Navigation.findNavController(this, R.id.NcMain);
        return NavigationUI.navigateUp(navController, AcMain) || super.onSupportNavigateUp();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.IvSetting:
                startActivity(new Intent(context, SettingActivity.class));
                break;
            case R.id.IvHome:
                IvHome.setImageResource(R.drawable.ic_home_selected);
                IvSound.setImageResource(R.drawable.ic_sound);
                IvInfo.setImageResource(R.drawable.ic_info);
                NcMain.navigate(R.id.NavHome);
                break;
            case R.id.IvSound:
                IvHome.setImageResource(R.drawable.ic_home);
                IvSound.setImageResource(R.drawable.ic_sound_selected);
                IvInfo.setImageResource(R.drawable.ic_info);
                NcMain.popBackStack(R.id.NavHome, false);
                NcMain.navigate(R.id.NavDashboard);
                break;
            case R.id.IvInfo:
                IvHome.setImageResource(R.drawable.ic_home);
                IvSound.setImageResource(R.drawable.ic_sound);
                IvInfo.setImageResource(R.drawable.ic_info_selected);
                NcMain.popBackStack(R.id.NavHome, false);
                NcMain.navigate(R.id.NavInformation);
                break;
        }
    }
}