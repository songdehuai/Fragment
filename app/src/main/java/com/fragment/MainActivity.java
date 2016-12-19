package com.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fragment.adapter.ViewPagerAdapter;
import com.fragment.fragment.FragmentMain;

public class MainActivity extends AppCompatActivity {

    ViewPager mainViewPager;

    TabLayout mainTabLayout;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        initViews();
    }


    void findViewById() {
        mainViewPager = (ViewPager) findViewById(R.id.main_viewpager);
        mainTabLayout = (TabLayout) findViewById(R.id.main_tablayout);
    }

    void initViews() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFrag(new FragmentMain(), "第一页");
        viewPagerAdapter.addFrag(new FragmentMain(), "第二页");
        viewPagerAdapter.addFrag(new FragmentMain(), "第三页");
        viewPagerAdapter.addFrag(new FragmentMain(), "第四页");
        mainViewPager.setAdapter(viewPagerAdapter);
        mainTabLayout.setupWithViewPager(mainViewPager);

    }
}
