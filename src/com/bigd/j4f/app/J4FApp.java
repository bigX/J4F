package com.bigd.j4f.app;

import android.app.Application;
import android.graphics.Typeface;
import android.view.View;

import com.way.util.CrashHandler;
import com.way.util.L;
import com.way.util.PreferenceConstants;
import com.way.util.PreferenceUtils;

public class J4FApp extends Application {

	private static J4FApp mApplication;

	private Typeface typeFace;
	private View targetView;

	public synchronized static J4FApp getInstance() {
		return mApplication;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mApplication = this;
		typeFace = Typeface.createFromAsset(this.getAssets(), "fonts/xht.ttc");
		L.isDebug = PreferenceUtils.getPrefBoolean(this,
				PreferenceConstants.ISNEEDLOG, true);
		if (PreferenceUtils.getPrefBoolean(this,
				PreferenceConstants.REPORT_CRASH, true))
			CrashHandler.getInstance().init(this);

	}

	public View getTargetView() {
		return targetView;
	}

	public void setTargetView(View targetView) {
		this.targetView = targetView;
	}

	public Typeface getTypeFace() {
		return typeFace;
	}

}
