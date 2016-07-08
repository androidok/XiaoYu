package com.scu.charles.xiaoyu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scu.charles.xiaoyu.R;

import java.util.List;

/**
 * Created by charles on 2016/7/8.
 */
public class SynthesisAdapter extends RecyclerView.Adapter<SynthesisAdapter.BaseViewHolder>{

    List<String> mData;

    public SynthesisAdapter(Context context, List<String> data){
        mData = data;
    }
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.synthesis_detials,parent,false);
        return new BaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.textView.setText(mData.get(position)+"箫"+position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class BaseViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public BaseViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.wenzi);
        }
    }
}
