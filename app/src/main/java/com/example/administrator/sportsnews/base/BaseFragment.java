package com.example.administrator.sportsnews.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.sportsnews.R;

/**
 * Created by Administrator on 2017/2/26.
 */

public abstract class BaseFragment extends Fragment {

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutId(), container, false);
        initView(view);
        initData();
        return view;
    }

    public abstract int getLayoutId();

    public abstract void initView(View view);

    public abstract void initData();
}
