package com.sound.meditionsoundapp.ui.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sound.meditionsoundapp.R;

public class SettingFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private View SettingView;
    private TextView TvExerciseTime,TvShare,TvRate,TvPolicy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SettingView=inflater.inflate(R.layout.fragment_setting, container, false);
        initViews();
        initListeners();
        initActions();
        return SettingView;
    }

    private void initViews() {
        context = getContext();
        TvExerciseTime=(TextView)SettingView.findViewById(R.id.TvExerciseTime);
        TvShare=(TextView)SettingView.findViewById(R.id.TvShare);
        TvRate=(TextView)SettingView.findViewById(R.id.TvRate);
        TvPolicy=(TextView)SettingView.findViewById(R.id.TvPolicy);
    }

    private void initListeners() {
        TvExerciseTime.setOnClickListener(this);
        TvShare.setOnClickListener(this);
        TvRate.setOnClickListener(this);
        TvPolicy.setOnClickListener(this);
    }

    private void initActions() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.TvExerciseTime:
                GotoExerciseTimer();
                break;
            case R.id.TvShare:

                break;
            case R.id.TvRate:

                break;
            case R.id.TvPolicy:

                break;
        }
    }

    private void GotoExerciseTimer() {

    }
}