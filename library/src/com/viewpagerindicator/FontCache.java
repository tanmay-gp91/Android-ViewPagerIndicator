package com.viewpagerindicator;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Helper class which loads and returns typeface
 * **/
public class FontCache {
	private static Typeface normal, semiBold;

	public static Typeface getNormalFont(Context context) {
		if (normal == null) {
			normal = Typeface.createFromAsset(context.getResources()
					.getAssets(), "fonts/questrial-regular.otf");
		}
		return normal;
	}

	public static Typeface getSemiBoldFont(Context context) {
		if (semiBold == null) {
			semiBold = Typeface.createFromAsset(context.getResources()
					.getAssets(), "fonts/questrial-regular.otf");
		}
		return semiBold;
	}

}
