package com.stories.healthy.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stories.healthy.AddMomentActivity;
import com.stories.healthy.R;
import com.stories.healthy.adapter.MomentViewPaperAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class Moment extends Fragment {

    private Toolbar mToolbar;

    private ViewPager mViewPager;

    private TabLayout mTabLayout;

    private FloatingActionButton mAddMomentButton;

    private List<String> mTabNameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moment, container, false);

        /* ****** */
        mViewPager = (ViewPager) view.findViewById(R.id.moment_view_paper);
        mTabLayout = (TabLayout) view.findViewById(R.id.moment_tab_layout);


        mTabNameList.add("精选");
        mTabNameList.add("最新");
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        MomentViewPaperAdapter momentViewPaperAdapter = new MomentViewPaperAdapter(fragmentManager, mTabNameList);
        momentViewPaperAdapter.addFragment(new MomentItem());
        momentViewPaperAdapter.addFragment(new MomentItem());
        mViewPager.setAdapter(momentViewPaperAdapter);


        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabNameList.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTabNameList.get(1)));
        mTabLayout.setupWithViewPager(mViewPager);

         /* ****** */
        mAddMomentButton = (FloatingActionButton) view.findViewById(R.id.add_moment);

        /* ****** */
        mToolbar = (Toolbar) view.findViewById(R.id.moment_toolbar);
        setHasOptionsMenu(true);  //调用Fragment的onCreateMenu（）方法
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAddMomentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getContext().startActivity(new Intent(getActivity(), AddMomentActivity.class));
            }
        });

    }
}
