package com.stories.healthy.bean;

/**
 * Created by Charlottecao on 9/27/17.
 */

public class MomentItemBean {

    private int mImageId;

    private String mUserName;

    private String mUpdateTime;

    private String mContent;

    private String mFavouriteCount;

    private String mLikeCount;

    private String mCommentCount;

    public MomentItemBean(int imageId, String userName, String updateTime, String content, String favouriteCount, String likeCount, String commentCount) {
        mImageId = imageId;
        mUserName = userName;
        mUpdateTime = updateTime;
        mContent = content;
        mFavouriteCount = favouriteCount;
        mLikeCount = likeCount;
        mCommentCount = commentCount;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getUserName() {
        return mUserName;
    }

    public String getUpdateTime() {
        return mUpdateTime;
    }

    public String getContent() {
        return mContent;
    }

    public String getFavouriteCount() {
        return mFavouriteCount;
    }

    public String getLikeCount() {
        return mLikeCount;
    }

    public String getCommentCount() {
        return mCommentCount;
    }
}
