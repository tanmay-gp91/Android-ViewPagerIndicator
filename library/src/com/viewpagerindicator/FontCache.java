package com.viewpagerindicator;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Helper class which loads and returns typeface
 * **/
public class FontCache {
	private static Typeface normal;

	public static Typeface getNormalFont(Context context) {
		if (normal == null) {
			normal = Typeface.createFromAsset(context.getResources()
					.getAssets(), "fonts/font_normal.otf");
		}
		return normal;
	}
}
