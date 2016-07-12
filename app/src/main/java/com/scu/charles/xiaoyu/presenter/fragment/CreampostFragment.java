package com.scu.charles.xiaoyu.presenter.fragment;

import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.CreampostVu;

/**
 * Created by charles on 2016/7/12.
 */
public class CreampostFragment extends BasePresenterFragment<CreampostVu>{
    @Override
    protected Class<CreampostVu> getVuClass() {
        return CreampostVu.class;
    }

    public static CreampostFragment newInstance(){
        return new CreampostFragment();
    }

    @Override
    protected void onBindVu() {
        super.onBindVu();
    }
}
