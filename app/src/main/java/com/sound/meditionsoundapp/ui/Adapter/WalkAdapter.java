package com.sound.meditionsoundapp.ui.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.sound.meditionsoundapp.R;

import androidx.viewpager.widget.PagerAdapter;

public class WalkAdapter extends PagerAdapter {

    private Activity activity;
    private Integer[] imagesArray;

    public WalkAdapter(Activity activity, Integer[] imagesArray) {
        this.activity = activity;
        this.imagesArray = imagesArray;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = activity.getLayoutInflater();

        View viewItem = inflater.inflate(R.layout.item_pager_list, container, false);
        ImageView IvSlider = viewItem.findViewById(R.id.IvSlider);
        TextView TvWalkTitle = (TextView) viewItem.findViewById(R.id.TvWalkTitle);
        TextView TvWalkSubTitle = (TextView) viewItem.findViewById(R.id.TvWalkSubTitle);
        if (position == 0) {
            TvWalkTitle.setText(activity.getResources().getString(R.string.binaural_beats));
            TvWalkSubTitle.setText(activity.getResources().getString(R.string.welcome_first));
        } else if (position == 1) {
            TvWalkTitle.setText(activity.getResources().getString(R.string.relaxing_sounds));
            TvWalkSubTitle.setText(activity.getResources().getString(R.string.welcome_second));
        } else if (position == 2) {
            TvWalkTitle.setText(activity.getResources().getString(R.string.meditation_music));
            TvWalkSubTitle.setText(activity.getResources().getString(R.string.welcome_third));
        }

        IvSlider.setImageResource(imagesArray[position]);
        container.addView(viewItem);


        return viewItem;
    }

    @Override
    public int getCount() {
        return imagesArray.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}