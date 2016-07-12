package com.scu.charles.xiaoyu.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.scu.charles.xiaoyu.R;

/**
 * Created by charles on 2016/7/12.
 */
public class TopicVu implements BaseVu{
    View view;
    Button hot;
    Button cream;
    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
            view = inflater.inflate(R.layout.fragment_topic,container,false);
            hot = (Button) view.findViewById(R.id.bt_hot_post);
            cream = (Button)view.findViewById(R.id.bt_cream_post);
    }

    @Override
    public View getView() {
        return view;
    }
    public Button getHot(){
        return hot;
    }

    public Button getCream(){
        return cream;
    }
}
