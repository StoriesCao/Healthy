package com.stories.healthy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stories.healthy.R;
import com.stories.healthy.adapter.MomentViewPaperAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class Moment extends Fragment {

    private ViewPager mViewPager;

    private TabLayout mTabLayout;

    private List<String> mTabNameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moment, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.moment_view_paper);
        mTabLayout = (TabLayout) view.findViewById(R.id.moment_tab_layout);


        mTabNameList.add("精选");
        mTabNameList.add("最新");
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        MomentViewPaperAdapter momentViewPaperAdapter = new MomentViewPaperAdapter(fragmentManager, mTabNameList);
        momentViewPaperAdapter.addFragment(new MomentGreat());
        momentViewPaperAdapter.addFragment(new MomentNow());
        mViewPager.setAdapter(momentViewPaperAdapter);


        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabNameList.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabNameList.get(1)));
        mTabLayout.setupWithViewPager(mViewPager);

        return view;
    }
}
