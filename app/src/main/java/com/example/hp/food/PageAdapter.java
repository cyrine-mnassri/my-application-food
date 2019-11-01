package com.example.hp.food;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new TabFragment1();
           case 1:
               return new TabFragment2();
           case 2:
               return new TabFragment3();
       default:
           return null;
       }
    }

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
