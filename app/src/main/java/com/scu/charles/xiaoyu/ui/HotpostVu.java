package com.scu.charles.xiaoyu.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.scu.charles.xiaoyu.R;

/**
 * Created by charles on 2016/7/12.
 */
public class HotpostVu implements BaseVu{
    View view;
    Button button;
    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_topic_hot,container,false);
        button = (Button) view.findViewById(R.id.bt_hot_send);
    }

    @Override
    public View getView() {
        return view;
    }

    public Button getHotSend(){
        return button;
    }
}
