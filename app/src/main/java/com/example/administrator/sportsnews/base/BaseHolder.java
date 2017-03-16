package com.example.administrator.sportsnews.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.jdsjlzx.recyclerview.LRecyclerView;

/**
 * Created by Administrator on 2017/2/26.
 */

public class BaseHolder extends LRecyclerView.ViewHolder {
    private Context context;
    private View itemView;

    public BaseHolder(Context context,View itemView) {
        super(itemView);
        this.itemView = itemView;
        this.context = context;

    }


    public void setImageView(@IdRes int viewId,String url){
       ImageView imageView = (ImageView) itemView.findViewById(viewId);
        Glide.with(context).load(url).into(imageView);
    }

    public void setTextView(@IdRes int viewId, String url){
        TextView textView = (TextView) itemView.findViewById(viewId);
        textView.setText(url);
    }
}
