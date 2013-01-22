package com.android.viewdeckcontroller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sample, container, false);
		ViewGroup.LayoutParams lp = view.getLayoutParams();
		lp.width -=45;
		view.setLayoutParams(lp);
		
	    ((TextView)view.findViewById(R.id.textview)).setText("Right Fragment");
	    view.setBackgroundColor(getResources().getColor(android.R.color.white));
	    return view;
	}
}
