package com.example.toastfromnonui;

import java.util.TimerTask;
import android.os.Looper;
import android.os.Message;

public class timerImp extends TimerTask{
	@Override
	public void run() {
		//Trying to show toast here will faill like below because we are calling a Toast From Non UI thread
		//Toast.makeText(MainActivity.myappContext, "Timer Expired", Toast.LENGTH_LONG).show();
		 uiHandler toastObj = null; 
		toastObj = uiHandler.getInstance(Looper.getMainLooper());
		 	 
		 	 Message msg = toastObj.obtainMessage(1);
		 	 toastObj.sendMessage(msg);
						
	}
}

