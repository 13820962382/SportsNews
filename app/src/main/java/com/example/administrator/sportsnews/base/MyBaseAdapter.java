package com.example.administrator.sportsnews.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.jdsjlzx.recyclerview.LRecyclerView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */

public abstract class MyBaseAdapter<T> extends LRecyclerView.Adapter<BaseHolder> {
    private List<T> list;
    private Context context;
    private int[] layoutId;

    public MyBaseAdapter(List list, Context context,int[]layoutId) {
        this.list = list;
        this.context = context;
        this.layoutId =layoutId;
    }

    protected abstract int getLayoutId(@IdRes int viewType);

    protected abstract void setData(BaseHolder holder, T data,int viewType);

    public void addData(List<T> data) {
        list.addAll(data);
        notifyDataSetChanged();
    }

    public void updateData(List<T> data) {
        list.clear();
        list.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(getLayoutId(layoutId[viewType]), parent, false);
        BaseHolder holder = new BaseHolder(context, itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(BaseHolder holder, int position) {
        setData(holder, list.get(position),getItemViewType(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position % layoutId.length;
    }
}
