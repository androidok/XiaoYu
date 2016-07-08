package com.scu.charles.xiaoyu.presenter;

import android.app.Activity;
import android.os.Bundle;

import com.scu.charles.xiaoyu.ui.BaseVu;

/**
 * Created by charles on 2016/7/8.
 */
public abstract class BasePresenterActivity<V extends BaseVu> extends Activity{
    protected V vu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            vu =getVuClass().newInstance();
            vu.init(getLayoutInflater(),null);
            setContentView(vu.getView());
            onBindVu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        onDestroyVu();
        vu=null;
        super.onDestroy();
    }

    protected abstract Class<V> getVuClass();

    protected void onBindVu(){};

    protected void onDestroyVu(){};
}
