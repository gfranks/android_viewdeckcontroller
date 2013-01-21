package com.android.viewdeckcontroller;

import java.util.ArrayList;

import com.android.widget.viewdeckcontroller.ViewDeckController;
import com.android.widget.viewdeckcontroller.ViewDeckControllerPagerAdapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

public class MainFragmentActivity extends FragmentActivity {
	
	private ViewDeckController mViewDeck;
	private ViewDeckAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setUpView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private void setUpView() {
		mViewDeck = (ViewDeckController) findViewById(R.id.viewdeck);
		ArrayList<Fragment> fragments = new ArrayList<Fragment>();
		fragments.add(new LeftFragment());
		fragments.add(new CenterFragment());
		fragments.add(new RightFragment());
		mAdapter = new ViewDeckAdapter(fragments);
		mViewDeck.setAdapter(mAdapter);
	}
	
	private class ViewDeckAdapter extends ViewDeckControllerPagerAdapter {
		private ArrayList<Fragment> fragments;
		
		public ViewDeckAdapter(ArrayList<Fragment> fragments) {
			this.fragments = fragments;
		}
		
	    @Override
	    public int getCount() {
	    	return fragments.size();
	    }
		@Override
		public void startUpdate(View container) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Object instantiateItem(View container, int position) {
			((ViewDeckController)container).addView(fragments.get(position).getView());
			return fragments.get(position).getView();
		}
		
		@Override
		public void destroyItem(View container, int position, Object object) {
			((ViewDeckController) container).removeView((View)object);
		}
		
		@Override
		public void finishUpdate(View container) {}
		
		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == object;
		}
		
		@Override
		public Parcelable saveState() {
			return null;
		}
		
		@Override
		public void restoreState(Parcelable state, ClassLoader loader) {}
	}
}
