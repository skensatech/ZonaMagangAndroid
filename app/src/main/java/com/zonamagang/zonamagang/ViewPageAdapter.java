package com.zonamagang.zonamagang;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Denandra on 16/08/2016.
 */
public class ViewPageAdapter extends FragmentStatePagerAdapter{
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return baruFragment.newInstance(0, "Sudah");
            case 1:
                return sudahFragment.newInstance(1, "Belum");
            default:
                return semuaFragment.newInstance(0,"Sudah");
        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        if(position==0){
            return "Sudah";
        }
        if(position==1){
            return "Belum";
        }
        else{
            return "";
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
