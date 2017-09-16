package com.example.brandonholderman.snapdemo.view;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.view.View;

import com.example.brandonholderman.snapdemo.R;

/**
 * Created by brandonholderman on 9/15/17.
 */

public class SnapTabsView extends FrameLayout implements ViewPager.OnPageChangeListener {
    private ImageView mCenterImage;
    private ImageView mStartImage;
    private ImageView mEndImage;
    private ImageView mBottomImage;

    private View mIndicator;

    public SnapTabsView(@NonNull Context context) {
        this(context, null);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    public void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_snap_tabs, this, false);

        mCenterImage = findViewById(R.id.vst_center_image);
        mStartImage = findViewById(R.id.vst_start_image);
        mEndImage = findViewById(R.id.vst_end_image);
        mBottomImage = findViewById(R.id.vst_bottom_image);

        mIndicator = findViewById(R.id.vst_indicator);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
