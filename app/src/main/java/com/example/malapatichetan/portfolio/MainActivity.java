package com.example.malapatichetan.portfolio;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.*;

import com.example.malapatichetan.portfolio.controller.PagetAdapter;


public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new PagetAdapter(getSupportFragmentManager()) {
        });
        TabLayout tabs = findViewById(R.id.tablelayout);
        tabs.setupWithViewPager(viewPager);

        tabs.setTabTextColors(Color.GRAY,Color.parseColor("yellow"));

    }
}
