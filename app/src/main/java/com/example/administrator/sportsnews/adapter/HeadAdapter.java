package com.example.administrator.sportsnews.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.example.administrator.sportsnews.R;
import com.example.administrator.sportsnews.api.OkhttpUtil;
import com.example.administrator.sportsnews.base.BaseHolder;
import com.example.administrator.sportsnews.base.MyBaseAdapter;
import com.example.administrator.sportsnews.mode.Category;
import com.example.administrator.sportsnews.mode.ShowBean.ShowapiResBodyBean.PagebeanBean.ContentlistBean;

import java.util.List;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/2/26.
 */

public class HeadAdapter extends MyBaseAdapter<Category.DataBean> {


    public HeadAdapter(List list, Context context, int[] layoutId) {
        super(list, context, layoutId);
    }

    @Override
    public int getLayoutId(@IdRes int viewType) {
        return R.layout.lrecycler_view_head_item;
    }

    @Override
    protected void setData(BaseHolder holder, Category.DataBean data, int viewType) {
        holder.setTextView(R.id.head_item, data.getName());
    }


}
