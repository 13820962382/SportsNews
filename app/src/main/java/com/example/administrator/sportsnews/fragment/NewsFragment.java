package com.example.administrator.sportsnews.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.administrator.sportsnews.R;
import com.example.administrator.sportsnews.adapter.HeadAdapter;
import com.example.administrator.sportsnews.adapter.LRecyclerAdapter;
import com.example.administrator.sportsnews.api.OkhttpUtil;
import com.example.administrator.sportsnews.base.BaseFragment;
import com.example.administrator.sportsnews.mode.Category;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends BaseFragment {
    private LRecyclerView lRecyclerView;
    private RecyclerView recyclerView;
    private List headList = new ArrayList();
    private List lRecyclerList = new ArrayList();
    private int[] layoutId = new int[]{R.layout.lrecycler_view_item1, R.layout.lrecycler_view_item2};
    private static final String HEAD_URL = "https://route.showapi.com/255-1?page=&showapi_appid=32053&showapi_timestamp=20170226233241&title=&type=&showapi_sign=f506c6b1f8b749f950fcf0d59af53638";
    private static final String CONTENT_URL = "https://route.showapi.com/967-1?showapi_appid=32053&showapi_timestamp=20170226200252&showapi_sign=87bfa6c1aff5a1b6e88f55b4ae9af8e9";
    static final String TEST_URL = "http://106.14.32.204/eshop/emobile/?url=category";
    private HeadAdapter headAdapter;
    private LRecyclerAdapter lRecyclerAdapter;
    private LRecyclerViewAdapter lrAdapter;
    ;
    private Handler handle = new Handler(Looper.getMainLooper());


    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    public void initView(View view) {
        lRecyclerView = (LRecyclerView) view.findViewById(R.id.lRecyclerView);
        lRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        View headView = LayoutInflater.from(getContext()).inflate(R.layout.lrecycler_view_head, (ViewGroup) view.findViewById(android.R.id.content), false);
        recyclerView = (RecyclerView) headView.findViewById(R.id.recycler_view_head);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, LinearLayoutManager.HORIZONTAL, false));
        headAdapter = new HeadAdapter(headList, getContext(), layoutId);
        recyclerView.setAdapter(headAdapter);
        lRecyclerAdapter = new LRecyclerAdapter(lRecyclerList, getContext(), layoutId);
        lrAdapter = new LRecyclerViewAdapter(lRecyclerAdapter);
        lrAdapter.addHeaderView(headView);
        lRecyclerView.setAdapter(lrAdapter);


    }

    @Override
    public void initData() {
        Call call = OkhttpUtil.getInstance().getCall(TEST_URL);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("------------", "------------");
                Log.e("NEWS", "" + e.toString());
                Log.e("------------", "------------");

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                handle.post(new Runnable() {
                    @Override
                    public void run() {
                        Gson gson = new Gson();
                        Category category = null;
                        try {
                            category = gson.fromJson(response.body().string(), Category.class);
                            headAdapter.updateData(category.getData());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Log.e("------------", "------------");
                        Log.e("NEWS_RUN", "成功了");
                        Log.e("------------", "------------");
//                        for (int i = 0; i < 5; i++) {
//                            Category category1 = new Category();
//                            lRecyclerList.add(category1);
//                        }


                    }
                });
            }
        });
    }

}
