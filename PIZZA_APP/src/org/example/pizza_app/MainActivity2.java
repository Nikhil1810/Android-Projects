package org.example.pizza_app;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity2 extends Activity {
    Button bt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		addButtonListener();
		addButtonListener2();
	}
	private void addButtonListener() {
		// TODO Auto-generated method stub
		  bt1=(Button) findViewById(R.id.button2);
    	  final Context context=this;
    	  bt1.setOnClickListener(new OnClickListener(){
    	    public void onClick(View v){
    	    	Intent intent= new Intent(context, MainActivity2001.class);
    	    	startActivity(intent);
    	    }	  
    	  });
	}
	
 	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	private void addButtonListener2() {
		// TODO Auto-generated method stub
		  bt1=(Button) findViewById(R.id.button1);
    	  final Context context=this;
    	  bt1.setOnClickListener(new OnClickListener(){
    	    public void onClick(View v){
    	    	Intent intent= new Intent(context, MainActivity7.class);
    	    	startActivity(intent);
    	    }	  
    	  });
	}
   
}
