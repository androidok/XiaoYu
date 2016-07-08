package com.scu.charles.xiaoyu.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by charles on 2016/7/8.
 */
public interface BaseVu {
    void init(LayoutInflater inflater, ViewGroup container);
    View getView();
}
