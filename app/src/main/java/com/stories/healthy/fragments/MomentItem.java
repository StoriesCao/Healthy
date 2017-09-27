package com.stories.healthy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stories.healthy.R;
import com.stories.healthy.adapter.MomentItemAdapter;
import com.stories.healthy.bean.MomentItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class MomentItem extends Fragment {

    private RecyclerView mRecyclerView;

    private List<MomentItemBean> mMomentItemList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moment_item, container, false);

        init();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.moment_item_recycle_view);
        MomentItemAdapter momentItemAdapter = new MomentItemAdapter(mMomentItemList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(momentItemAdapter);

        return view;
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            MomentItemBean momentItemBean = new MomentItemBean(R.drawable.ic_moment_icon_test, "Obama", "19:20发布", getResources().getString(R.string.content_test), "168", "98", "100");
            mMomentItemList.add(momentItemBean);
        }
    }
}
