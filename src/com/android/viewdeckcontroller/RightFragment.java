package com.android.viewdeckcontroller;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class RightFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sample, container, false);
		ViewGroup.LayoutParams lp = view.getLayoutParams();
		lp.width -=45;
		view.setLayoutParams(lp);
		
	    ((TextView)view.findViewById(R.id.textview)).setText("Right Fragment");
	    view.setBackgroundColor(getResources().getColor(android.R.color.white));
	    
	    ImageView v = (ImageView)view.findViewById(R.id.imageView);
	    GradientDrawable gdLeft = new GradientDrawable(
                GradientDrawable.Orientation.RIGHT_LEFT,
                new int[] {0x00000000, 0xFF404040});
	    v.setBackgroundDrawable(gdLeft);
	    RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
	    p.width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 
				15, getResources().getDisplayMetrics());
	    p.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
	    v.setLayoutParams(p);
	    
	    return view;
	}
}
