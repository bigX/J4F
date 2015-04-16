package com.bigd.j4f.activity;

import com.bigd.j4f.R;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {

		String url = "http://fs.android2.kugou.com/6598b094a69d87028a1a05f08f56fbc5/552f1c2a/G008/M03/1A/05/SA0DAFT-rI6AUB2eAEZSXj-6d_E207.mp3";

		final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,
				Uri.parse(url));
		mediaPlayer.setLooping(true);// 设置循环播放
		mediaPlayer.start();// 播放声音
		
		ImageButton btnPlay = (ImageButton) this.findViewById(R.id.btn_play);
		ImageButton btnPause = (ImageButton) this.findViewById(R.id.btn_pause);
		
		btnPlay.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (mediaPlayer.isPlaying()) {
					// return ;
				} else {
					mediaPlayer.start();
				}
			}
		});
		btnPause.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (mediaPlayer.isPlaying()) {
					mediaPlayer.pause();
				}
			}
		});

	}

}
