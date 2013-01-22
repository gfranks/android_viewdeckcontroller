package com.android.viewdeckcontroller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CenterFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sample, container, false);

	    ((TextView)view.findViewById(R.id.textview)).setText("Center Fragment");
	    ((TextView)view.findViewById(R.id.textview)).setTextColor(getResources().getColor(android.R.color.white));
	    view.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
	    return view;
	}
}
