package com.example.administrator.sportsnews;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.administrator.sportsnews.fragment.NewsFragment;

public class MainActivity extends AppCompatActivity  {
    private FrameLayout layout_content;
    private RadioButton bottom_news;
    private NewsFragment newsFragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_news = (RadioButton) findViewById(R.id.bottom_news);
        bottom_news.setChecked(true);
        bottom_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "新闻", Toast.LENGTH_SHORT).show();
            }
        });
        transaction = getSupportFragmentManager().beginTransaction();
        newsFragment = new NewsFragment();
        transaction.add(R.id.layout_content,newsFragment);
        transaction.show(newsFragment);
        transaction.commit();


    }

}
