package com.scu.charles.xiaoyu.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scu.charles.xiaoyu.R;

/**
 * Created by charles on 2016/7/8.
 */
public class SynthesisVu implements BaseVu{
    View view;
    RecyclerView mListview;

    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_synthesis,container,false);
        mListview = (RecyclerView) view.findViewById(R.id.rv_synthesis);
        //此处初始化控件时怎么获得上下文
    }

    @Override
    public View getView() {
        return view;
    }

    public RecyclerView getmListview(){
        return mListview;
    }
}
