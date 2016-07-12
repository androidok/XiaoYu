package com.scu.charles.xiaoyu.presenter.fragment;

import android.view.View;
import android.widget.Button;

import com.scu.charles.xiaoyu.model.event.BaseEvent;
import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.HotpostVu;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by charles on 2016/7/12.
 */
public class HotpostFragment extends BasePresenterFragment<HotpostVu>{
    private Button mSendmessage;
    @Override
    protected Class<HotpostVu> getVuClass() {
        return HotpostVu.class;
    }

    public static HotpostFragment newInstance(){
        return new HotpostFragment();
    }

    @Override
    protected void onBindVu() {
        initDatas();
        super.onBindVu();
    }

    private void initDatas() {
        final BaseEvent mEvent = new BaseEvent();
        mEvent.setMnotice(9999);
        mSendmessage = vu.getHotSend();
        mSendmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(mEvent);
            }
        });
    }
}
