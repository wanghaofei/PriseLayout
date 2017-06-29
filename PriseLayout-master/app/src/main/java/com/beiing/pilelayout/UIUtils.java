package com.beiing.pilelayout;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by wuming on 16/10/14.
 */

public class UIUtils {
	private static long lastClickTime;

	public static boolean isDoubleClick(int interval) {
		long currentClickTime = System.currentTimeMillis();
		if ((currentClickTime - lastClickTime) > interval) {
			lastClickTime = currentClickTime;
			return false;
		}
		return true;
	}

	public static Float dp2px(float dipValue, Context context) {
		float value = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, context.getResources().getDisplayMetrics());
		return value;
	}
}
