package com.scu.charles.xiaoyu.presenter.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.scu.charles.xiaoyu.R;
import com.scu.charles.xiaoyu.model.event.BaseEvent;
import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.TopicVu;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by charles on 2016/7/12.
 */
public class TopicFragment extends BasePresenterFragment<TopicVu>{
    private FragmentManager fm;
    Button mHot;
    Button mCream;
    @Override
    protected Class<TopicVu> getVuClass() {
        return TopicVu.class;
    }
    public static TopicFragment newInstance(){
        return new TopicFragment();
    }

    @Override
    protected void onBindVu() {
        initDatas();
        mHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(HotpostFragment.newInstance());
            }
        });

        mCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(CreampostFragment.newInstance());
            }
        });
        super.onBindVu();
    }

    private void initDatas() {
        fm = getFragmentManager();
        replaceFragment(HotpostFragment.newInstance());
        mHot = vu.getHot();
        mCream = vu.getCream();
    }

    private void replaceFragment(Fragment fragment){
        fm.beginTransaction()
                .replace(R.id.topic_fragment_content, fragment)
                .commit();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    @Override
    public void onGetEvent(BaseEvent event){
        if(event!=null){
            replaceFragment(AboutFragment.newInstance());
            Toast.makeText(getActivity(),event.getMnotice()+"收到消息",Toast.LENGTH_LONG).show();
        }
    }
}
