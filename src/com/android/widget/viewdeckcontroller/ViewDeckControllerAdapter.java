package com.android.widget.viewdeckcontroller;

import java.util.ArrayList;

import com.android.viewdeckcontroller.CenterFragment;
import com.android.viewdeckcontroller.LeftFragment;
import com.android.viewdeckcontroller.RightFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewDeckControllerAdapter extends FragmentPagerAdapter {

	private ArrayList<Fragment> fragments;
	private Context mContext;
	
	public ViewDeckControllerAdapter(FragmentManager fm, Context context) {
		super(fm);
		mContext = context;
	}

	public ViewDeckControllerAdapter(FragmentManager fm,
			ArrayList<Fragment> fragments, Context context) {
		super(fm);
		this.fragments = fragments;
		mContext = context;
	}

	public void setFragments(ArrayList<Fragment> fragments) {
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int index) {
		Fragment f = null;
		switch (index) {
		case 0:
			f = new LeftFragment();
//			ImageView lFV = new ImageView(mContext);
//			((ViewGroup)f.getView().getParent()).addView(lFV);
			
			break;
		case 1:
			f = new CenterFragment();
			break;
		case 2:
			f = new RightFragment();
//			ImageView rFV = new ImageView(mContext);
//			((ViewGroup)f.getView().getParent()).addView(rFV);
			break;
		}

		return f;
	}

	@Override
	public int getCount() {
		return fragments.size();
	}
}