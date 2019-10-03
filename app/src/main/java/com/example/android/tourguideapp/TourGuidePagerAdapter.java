package com.example.android.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;
    private Context mContext;

    public TourGuidePagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new FunForFreeFragment();
            case 1: return new HistoricFragment();
            case 2: return new FoodFragment();
            default: return new FranzFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: return mContext.getString(R.string.attraction_fun_places);
            case 1: return mContext.getString(R.string.attraction_historic);
            case 2: return mContext.getString(R.string.attraction_food);
            default: return mContext.getString(R.string.attraction_franzbrötchen);
        }
    }
}
