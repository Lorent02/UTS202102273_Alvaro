package com.alvaro202102273.uts_202102273;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private WebResmiFragment webResmiFragment = new WebResmiFragment();

    private Context _context;
    private webInternalFragment webInternalFragment = new webInternalFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return webResmiFragment;
            default:
            return webInternalFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}