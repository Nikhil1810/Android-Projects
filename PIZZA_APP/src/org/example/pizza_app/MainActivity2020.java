package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2020 extends Activity {
    Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2020);
		addButtonListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2020, menu);
		return true;
	}
	private void addButtonListener() {
		// TODO Auto-generated method stub
		bt=(Button) findViewById(R.id.button23);
		bt.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				 boolean did=true;
				 try{
				 A entry= new A(MainActivity2020.this);
				 entry.open();
				 entry.getEntry("Cheese Dip", 20);
				 entry.close();
				 }catch(Exception e){
					 did=false;
				 }finally{
					 if(did){
						 Dialog d= new Dialog(MainActivity2020.this);
						 d.setTitle("ORDER STATUS");
						 TextView tv= new TextView(MainActivity2020.this);
						 tv.setText("ADDED SUCCESSFULLY");
						 d.setContentView(tv);
						 d.show();
					 }
				 }
			}
		});
		
	}

}
