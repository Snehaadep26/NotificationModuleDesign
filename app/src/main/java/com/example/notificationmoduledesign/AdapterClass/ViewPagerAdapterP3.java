package com.example.notificationmoduledesign.AdapterClass;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.notificationmoduledesign.Fragments.PendingFragmentP3;

import com.example.notificationmoduledesign.Fragments.RejectedFragmentP3;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterP3  extends FragmentPagerAdapter {


    private final List<Fragment> isFragment=new ArrayList<>();
    private final List<String> isTitles=new ArrayList<>();


    public ViewPagerAdapterP3( FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return isFragment.get(position);
    }


    @Override
    public int getCount() {
        return isTitles.size();
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        return isTitles.get(position);
    }


    public void AddFragment(Fragment fragment,String title)
    {
        isFragment.add(fragment);
        isTitles.add(title);
    }
}
