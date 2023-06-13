package com.sound.meditionsoundapp.ui.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sound.meditionsoundapp.BuildConfig;
import com.sound.meditionsoundapp.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private ImageView IvBack;
    private TextView TvTitle,TvExerciseTime, TvShare, TvRate, TvPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initViews();
        initListeners();
        initActions();
    }
    private void initViews() {
        context = this;
        IvBack = (ImageView) findViewById(R.id.IvBack);
        TvTitle = (TextView) findViewById(R.id.TvTitle);
        TvExerciseTime = (TextView) findViewById(R.id.TvExerciseTime);
        TvShare = (TextView) findViewById(R.id.TvShare);
        TvRate = (TextView) findViewById(R.id.TvRate);
        TvPolicy = (TextView) findViewById(R.id.TvPolicy);
    }

    private void initListeners() {
        IvBack.setOnClickListener(this);
        TvExerciseTime.setOnClickListener(this);
        TvShare.setOnClickListener(this);
        TvRate.setOnClickListener(this);
        TvPolicy.setOnClickListener(this);
    }

    private void initActions() {
        TvTitle.setText(getString(R.string.setting));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.IvBack:
                onBackPressed();
                break;
            case R.id.TvExerciseTime:
                GotoExerciseTimer();
                break;
            case R.id.TvShare:
                GotoShare();
                break;
            case R.id.TvRate:
                GotoRate();
                break;
            case R.id.TvPolicy:
                GotoPrivacy();
                break;
        }
    }

    private void GotoExerciseTimer() {
        startActivity(new Intent(context, ExerciseTimerActivity.class));
    }
    private void GotoShare() {
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
            String shareMessage= "\nInstall this application: \n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "Share link:"));
        } catch(Exception e) {
        }
    }
    private void GotoRate() {
    }
    private void GotoPrivacy() {
    }
}