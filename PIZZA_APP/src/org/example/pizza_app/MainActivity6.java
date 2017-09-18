package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity6);
		TextView tv=(TextView) findViewById(R.id.editText1);
		A info= new A(MainActivity6.this);
		try{
		info.open();
		}catch(Exception e){}
		String data= info.getData();
	/*	try{
			setAutoCommit(false);
		}catch(Exception e){}*/
		info.close();
		tv.setText(data);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity6, menu);
		return true;
	}

}
