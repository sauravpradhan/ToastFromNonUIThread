package com.example.toastfromnonui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;



public class uiHandler extends Handler{
	
public static uiHandler uiInstance=null;


private uiHandler(Looper loop)
{
	
	super(loop);
	
	Log.d("Saurav Log", "Creating uiHandler instance");
	
}

public static synchronized uiHandler getInstance (Looper loop)
{
	if(uiInstance == null)
	{
		uiInstance = new uiHandler(loop);
	}
	return uiInstance;
}

@Override
public void handleMessage(Message msg) {
	// TODO Auto-generated method stub
	super.handleMessage(msg);
	switch(msg.what)
	{
	case 1:
		Toast.makeText(MainActivity.myappContext, "Timer Expired", Toast.LENGTH_LONG).show();
		
	
	}
	 
		}


}
