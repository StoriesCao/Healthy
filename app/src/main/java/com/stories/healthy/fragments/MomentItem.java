package com.stories.healthy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stories.healthy.R;

/**
 * Created by Charlottecao on 9/26/17.
 */

public class MomentItem extends Fragment {

    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moment_item, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.moment_item_recycle_view);

        return view;
    }
}
