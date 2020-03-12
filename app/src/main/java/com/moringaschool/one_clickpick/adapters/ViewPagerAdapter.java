package com.moringaschool.one_clickpick.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> listOfAllFragemnts = new ArrayList<>();
    private final List<String> titlesOfAllFragemnts = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return listOfAllFragemnts.get(position);
    }

    @Override
    public int getCount(){
        return listOfAllFragemnts.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titlesOfAllFragemnts.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        listOfAllFragemnts.add(fragment);
        titlesOfAllFragemnts.add(title);
    }
}
