package com.setbackground.Controller;

import android.content.Context;
import android.util.TypedValue;
import android.widget.RelativeLayout;

//佔滿?�RelativeLayout
public abstract class MainParentLayout extends RelativeLayout {
	protected int MATCH_PARENT = LayoutParams.MATCH_PARENT,
			WRAP_CONTENT = LayoutParams.WRAP_CONTENT,
			PX = TypedValue.COMPLEX_UNIT_PX;
	protected Context context;
	protected WH WH;

	public MainParentLayout(Context context) {
		super(context);
		this.context = context;
		WH = new WH(context);
		setMath_Wrap();
		init();
	}

	// ?��??��??�象?��?
	protected abstract void init();

	// 設�?LayoutParams
	protected void setMath_Wrap() {
		LayoutParams LP = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		this.setLayoutParams(LP);
	}

	// ?��?亂數ID
	protected int getRandomId() {
		return (int) (Math.random() * 1000000);
	}

	// ?��?LayoutParams
	protected LayoutParams getLayoutParams(int Widht, int Height) {
		return new LayoutParams(Widht, Height);
	}

}
