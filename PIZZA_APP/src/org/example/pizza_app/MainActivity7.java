package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity7 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity7);
		A info= new A(MainActivity7.this);
		try{
		info.open();
		}catch(Exception e){}
	
	
	/*	try{
			setAutoCommit(false);
		}catch(Exception e){}*/
		info.close();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity7, menu);
		return true;
	}

}