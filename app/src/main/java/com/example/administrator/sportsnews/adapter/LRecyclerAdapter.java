package com.example.administrator.sportsnews.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.widget.BaseAdapter;

import com.example.administrator.sportsnews.R;
import com.example.administrator.sportsnews.base.BaseHolder;
import com.example.administrator.sportsnews.base.MyBaseAdapter;
import com.example.administrator.sportsnews.mode.Category;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */

public class LRecyclerAdapter extends MyBaseAdapter<Category.DataBean> {

    public LRecyclerAdapter(List list, Context context, int[] layoutId) {
        super(list, context, layoutId);
    }

    @Override
    protected int getLayoutId(@IdRes int viewType) {
        return R.layout.lrecycler_view_item1;
    }

    @Override
    protected void setData(BaseHolder holder, Category.DataBean data, int viewType) {
        holder.setTextView(R.id.text_title,"hahah");

    }


}
