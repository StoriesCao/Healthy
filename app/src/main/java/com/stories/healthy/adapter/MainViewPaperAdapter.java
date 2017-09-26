package com.stories.healthy.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class MainViewPaperAdapter extends FragmentPagerAdapter {

    private static List<Fragment> mFragmentList = new ArrayList();

    public MainViewPaperAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return  mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public static void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }
}
