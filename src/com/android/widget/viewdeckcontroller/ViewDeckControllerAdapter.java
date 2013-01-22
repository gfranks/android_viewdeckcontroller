package com.android.widget.viewdeckcontroller;

import com.android.viewdeckcontroller.CenterFragment;
import com.android.viewdeckcontroller.LeftFragment;
import com.android.viewdeckcontroller.RightFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewDeckControllerAdapter extends FragmentPagerAdapter {
	
	public ViewDeckControllerAdapter(FragmentManager fm) {
		super(fm);
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
		return 3;
	}
}