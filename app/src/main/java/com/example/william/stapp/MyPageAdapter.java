package com.example.william.stapp;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by jason on 15/06/2017.
 */

public class MyPageAdapter extends PagerAdapter {
    public int getCount(){
        return 5; // change value depending on object within the slider.
    }
    public Object instantiateItem(View collection, int position) {

        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        int resId = 0;
        switch (position) {
            case 0:
                resId = R.layout.farleft;
                break;
            case 1:
                resId = R.layout.left;
                break;
            case 2:
                resId = R.layout.middle;
                break;
            case 3:
                resId = R.layout.right;
                break;
            case 4:
                resId = R.layout.farright;
                break;
        }

        View view = inflater.inflate(resId, null);

        ((ViewPager) collection).addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(View arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView((View) arg2);

    }


    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == ((View) arg1);

    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
}
