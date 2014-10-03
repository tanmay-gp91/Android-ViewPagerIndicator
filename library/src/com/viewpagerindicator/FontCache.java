package com.viewpagerindicator;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Helper class which loads and returns typeface
 * **/
public class FontCache {
	private static Typeface semiBold;

	public static Typeface getBoldFont(Context context) {
		if (semiBold == null) {
			semiBold = Typeface.createFromAsset(context.getResources()
					.getAssets(), "fonts/font_bold.otf");
		}
		return semiBold;
	}
}
