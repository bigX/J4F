package com.bigd.j4f.activity;

import com.bigd.utl.WindowUtl;
import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WindowUtl.setTranslucentStatus(this);
	}

}
