package com.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.fragment.adapter.ViewPagerAdapter;
import com.fragment.fragment.FirstFragment;

/**
 * Created by songdehuai on 2016/12/19.
 */

public class FirstActivity extends AppCompatActivity {

    ViewPager firstViewPager;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_first);
        findViewById();
        initViews();
    }


    void findViewById() {
        firstViewPager = (ViewPager) findViewById(R.id.first_viewpager);
    }

    void initViews() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFrag(new FirstFragment(R.mipmap.ic_launcher));
        viewPagerAdapter.addFrag(new FirstFragment(R.mipmap.ic_launcher));
        viewPagerAdapter.addFrag(new FirstFragment(R.mipmap.ic_launcher));
        firstViewPager.setAdapter(viewPagerAdapter);
    }
}
