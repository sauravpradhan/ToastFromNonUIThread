package com.example.toastfromnonui;


import java.util.Timer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	Timer toastIt= new Timer("SettingTimer",true);
	public static Context myappContext;
	timerImp myTimer = new timerImp();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		myappContext= getApplicationContext();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		toastIt.scheduleAtFixedRate(myTimer, 1000, 10000);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
