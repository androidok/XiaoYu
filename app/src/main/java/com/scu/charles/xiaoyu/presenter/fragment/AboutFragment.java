package com.scu.charles.xiaoyu.presenter.fragment;

import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.AboutVu;

/**
 * Created by charles on 2016/7/9.
 */
public class AboutFragment extends BasePresenterFragment<AboutVu>{
    @Override
    protected Class<AboutVu> getVuClass() {
        return AboutVu.class;
    }

    public static AboutFragment newInstance(){
        return new AboutFragment();
    }

    @Override
    protected void onBindVu() {
        super.onBindVu();
    }
}
