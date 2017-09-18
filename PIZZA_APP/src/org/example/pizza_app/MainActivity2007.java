package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2007 extends Activity {
    Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2007);
		addButtonListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2007, menu);
		return true;
	}
	private void addButtonListener() {
		// TODO Auto-generated method stub
		bt=(Button) findViewById(R.id.button9);
		bt.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				 boolean did=true;
				 try{
				 A entry= new A(MainActivity2007.this);
				 entry.open();
				 entry.getEntry("Veg Extravaganza", 140);
				 entry.close();
				 }catch(Exception e){
					 did=false;
				 }finally{
					 if(did){
						 Dialog d= new Dialog(MainActivity2007.this);
						 d.setTitle("ORDER STATUS");
						 TextView tv= new TextView(MainActivity2007.this);
						 tv.setText("ADDED SUCCESSFULLY");
						 d.setContentView(tv);
						 d.show();
					 }
				 }
			}
		});
		
	}

}
