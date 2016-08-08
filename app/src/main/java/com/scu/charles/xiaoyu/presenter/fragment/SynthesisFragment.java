package com.scu.charles.xiaoyu.presenter.fragment;


import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scu.charles.xiaoyu.R;
import com.scu.charles.xiaoyu.adapter.SynthesisAdapter;
import com.scu.charles.xiaoyu.presenter.BasePresenterFragment;
import com.scu.charles.xiaoyu.ui.SynthesisVu;

import java.util.ArrayList;
import java.util.List;

/**
 *杂谈fragment，用于展示文字图片信息
 * create an instance of this fragment.
 */
public class SynthesisFragment extends BasePresenterFragment<SynthesisVu> implements SwipeRefreshLayout.OnRefreshListener{
    RecyclerView mListview;
    SynthesisAdapter mAdapter;
    SwipeRefreshLayout mSwipeRefreshLayout;
    List<String> mData;
    @Override
    protected Class<SynthesisVu> getVuClass() {
        return SynthesisVu.class;
    }

    public static SynthesisFragment newInstance(){
        return new SynthesisFragment();
    }

    @Override
    protected void onBindVu() {
        initDatas();
        mAdapter = new SynthesisAdapter(getActivity(),mData);
        mListview.setAdapter(mAdapter);

    }

    private void initDatas() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mData = new ArrayList<String>();
        for(int i=0;i<30;i++){
            mData.add("箫"+i);
        }
        mListview = vu.getmListview();
        mListview.setLayoutManager(linearLayoutManager);
        mSwipeRefreshLayout = vu.getmSwipeRefreshLayout();
        mSwipeRefreshLayout.setOnRefreshListener(SynthesisFragment.this);
    }

    @Override
    public void onRefresh() {
        mData.add("new 箫");
        mSwipeRefreshLayout.setRefreshing(false);
        mAdapter.notifyDataSetChanged();
    }
}
