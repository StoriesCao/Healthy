package com.stories.healthy.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.stories.healthy.fragments.NewsMenuFragment;

/**
 * Created by 董长峰 on 2017/9/27.
 */

public class MenuPaperAdapter extends FragmentPagerAdapter {
    private String[] tabTitle;
    public MenuPaperAdapter(FragmentManager fm, String[] mTabNameArray) {
        super( fm );
        tabTitle=mTabNameArray;
    }

    @Override
    public Fragment getItem(int position) {
        NewsMenuFragment fragment=new NewsMenuFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
