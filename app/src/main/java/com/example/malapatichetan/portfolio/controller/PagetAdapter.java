package com.example.malapatichetan.portfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.malapatichetan.portfolio.views.AboutFragment;
import com.example.malapatichetan.portfolio.views.ContactFragment;
import com.example.malapatichetan.portfolio.views.SkillsFragment;
import com.example.malapatichetan.portfolio.views.WorkFragment;

public class PagetAdapter extends FragmentPagerAdapter {
    public PagetAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new SkillsFragment();
            case 2: return new WorkFragment();
            case 3: return new ContactFragment();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
           case 0:return "ABOUT";
            case 1:return "SKILLS";
            case 2:return "WORK";
            case 3:return "CONTACT";


        }

        return null;
    }
}
