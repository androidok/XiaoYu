package com.scu.charles.xiaoyu.presenter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scu.charles.xiaoyu.ui.BaseVu;

/**
 * Created by charles on 2016/7/8.
 */
public abstract class BasePresenterFragment<V extends BaseVu> extends Fragment {
    protected V vu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = null;
        try {
            vu = getVuClass().newInstance();
            vu.init(inflater,container);
            onBindVu();
            view = vu.getView();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void onDestroy() {
        onDestroyVu();
        vu = null;
        super.onDestroy();
    }

    protected void onDestroyVu(){};

    protected void onBindVu(){};

    protected abstract Class<V> getVuClass();
}
