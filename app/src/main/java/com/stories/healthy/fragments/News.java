package com.stories.healthy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stories.healthy.R;
import com.stories.healthy.adapter.MenuPaperAdapter;

import java.util.List;


/**
 * Created by Charlottecao on 9/26/17.
 */

public class News extends Fragment {
    private ViewPager mViewPaer;
    private TabLayout mTabLayout;
    private String[] mTabNameArray;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        mViewPaer= (ViewPager) view.findViewById( R.id.view_paper );
        mTabLayout= (TabLayout) view.findViewById( R.id.tablayout );
        mTabNameArray=getResources().getStringArray( R.array.tab_title );
        MenuPaperAdapter adapter=new MenuPaperAdapter( getFragmentManager(),mTabNameArray );
        mViewPaer.setAdapter( adapter );
        mTabLayout.setupWithViewPager( mViewPaer );
        return view;
    }
}
