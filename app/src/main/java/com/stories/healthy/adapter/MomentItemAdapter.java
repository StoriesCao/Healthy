package com.stories.healthy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.stories.healthy.R;
import com.stories.healthy.bean.MomentItemBean;

import java.util.List;

/**
 * Created by Charlottecao on 9/27/17.
 */

public class MomentItemAdapter extends RecyclerView.Adapter<MomentItemAdapter.ViewHolder> {

    private List<MomentItemBean> mMomentList;

    /**
     * Inner class ViewHolder
     */
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mMomentItemIcon;
        TextView mMomentItemUserName;
        TextView mMomentItemUpdateTime;
        TextView mMomentItemContent;
        TextView mMomentItemFavouriteCount;
        TextView mMomentItemLikeCount;
        TextView mMomentItemCommentCount;

        public ViewHolder(View itemView) {
            super(itemView);

            mMomentItemIcon = (ImageView) itemView.findViewById(R.id.moment_item_icon);
            mMomentItemUserName = (TextView) itemView.findViewById(R.id.moment_item_user_name);
            mMomentItemUpdateTime = (TextView) itemView.findViewById(R.id.moment_item_create_time);
            mMomentItemContent = (TextView) itemView.findViewById(R.id.moment_item_content);
            mMomentItemFavouriteCount = (TextView) itemView.findViewById(R.id.moment_item_favourite_count);
            mMomentItemLikeCount = (TextView) itemView.findViewById(R.id.moment_item_like_count);
            mMomentItemCommentCount = (TextView) itemView.findViewById(R.id.moment_item_comment_count);
        }
    }

    /**
     * Data
     */
    public MomentItemAdapter (List<MomentItemBean> momentItemBeanList) {
        mMomentList = momentItemBeanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.moment_item_recycle_view_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MomentItemBean momentItemBean = mMomentList.get(position);
        holder.mMomentItemIcon.setImageResource(momentItemBean.getImageId());
        holder.mMomentItemUserName.setText(momentItemBean.getUserName());
        holder.mMomentItemUpdateTime.setText(momentItemBean.getUpdateTime());
        holder.mMomentItemContent.setText(momentItemBean.getContent());
        holder.mMomentItemFavouriteCount.setText(momentItemBean.getFavouriteCount());
        holder.mMomentItemCommentCount.setText(momentItemBean.getCommentCount());
        holder.mMomentItemLikeCount.setText(momentItemBean.getLikeCount());

        holder.mMomentItemFavouriteCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Favourite", Toast.LENGTH_SHORT).show();
            }
        });
        holder.mMomentItemCommentCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Comment", Toast.LENGTH_SHORT).show();
            }
        });
        holder.mMomentItemLikeCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Like", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMomentList.size();
    }
}
