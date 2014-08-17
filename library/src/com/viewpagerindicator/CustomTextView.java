package com.viewpagerindicator;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {

	private static String DEBUG_TAG = "CustomTextView";
	private int mTextCase = 0;

	public CustomTextView(Context context) {
		super(context);
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setTextStyle(context, attrs);
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setTextStyle(context, attrs);
	}

	public void setDefaultFont() {
		setTypeface(getNormalFont());
	}

	private void setTextStyle(Context context, AttributeSet attrs) {
		setTypeface(getNormalFont());
	}

	private Typeface getNormalFont() {
		return FontCache.getNormalFont(getContext());
	}
}
