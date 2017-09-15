package com.example.brandonholderman.snapdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brandonholderman.snapdemo.R;

/**
 * Created by brandonholderman on 9/15/17.
 */

public class StoryFragment extends BaseFragment {

    public static StoryFragment create() {
        return new StoryFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_story;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
