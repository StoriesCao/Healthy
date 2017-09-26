package com.stories.healthy.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class MomentViewPaperAdapter extends FragmentPagerAdapter{

    private List<Fragment> mFragmentList = new ArrayList<>();

    private List<String> mTabNameList = new ArrayList<>();

    public MomentViewPaperAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public MomentViewPaperAdapter(FragmentManager fm, List<String> tabNameList) {
        super(fm);
        mTabNameList = tabNameList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabNameList.get(position);
    }

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }
}
