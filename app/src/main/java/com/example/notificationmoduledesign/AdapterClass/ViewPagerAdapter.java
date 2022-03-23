package com.example.notificationmoduledesign.AdapterClass;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.notificationmoduledesign.Fragments.PendingFragmentP8;
import com.example.notificationmoduledesign.Fragments.RejectedFragmentP8;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new PendingFragmentP8("Page 1");
            case 1:
                return new RejectedFragmentP8("Page 2");
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}