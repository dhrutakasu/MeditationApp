package com.sound.meditionsoundapp.ui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.ui.Adapter.WalkAdapter;

public class WalkThroughActivity extends AppCompatActivity {

    private Context context;
    private ViewPager PagerWalk;
    private TextView TvWalkContinue;

    private Integer[] images = {R.drawable.ic_bg_1, R.drawable.ic_bg_2, R.drawable.ic_bg_3};
    private TabLayout TabWalk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        initViews();
        initListeners();
        initActions();
    }

    private void initViews() {
        context = this;
        PagerWalk = (ViewPager) findViewById(R.id.PagerWalk);
        TvWalkContinue = (TextView) findViewById(R.id.TvWalkContinue);
        TabWalk = (TabLayout) findViewById(R.id.TabWalk);
    }

    private void initListeners() {
        TvWalkContinue.setOnClickListener(view -> {
            if (PagerWalk.getCurrentItem() == 0) {
                PagerWalk.setCurrentItem(1);
            } else if (PagerWalk.getCurrentItem()==1) {
                PagerWalk.setCurrentItem(2);
            }else {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initActions() {
        WalkAdapter adapter = new WalkAdapter(this, images);
        PagerWalk.setAdapter(adapter);
        TabWalk.setupWithViewPager(PagerWalk, true);

        PagerWalk.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                changeText(i);
            }

            @Override
            public void onPageSelected(int i) {
                changeText(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void changeText(int i) {
        if (i != 2) {
            TvWalkContinue.setText("Next");
        } else {
            TvWalkContinue.setText("Let's Start");
        }
    }
}