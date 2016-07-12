package com.scu.charles.xiaoyu.presenter.fragment;

import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.HotpostVu;

/**
 * Created by charles on 2016/7/12.
 */
public class HotpostFragment extends BasePresenterFragment<HotpostVu>{
    @Override
    protected Class<HotpostVu> getVuClass() {
        return HotpostVu.class;
    }

    public static HotpostFragment newInstance(){
        return new HotpostFragment();
    }

    @Override
    protected void onBindVu() {
        super.onBindVu();
    }
}
