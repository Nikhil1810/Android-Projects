package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity2001 extends Activity {
	private ViewFlipper myViewFlipper;
	Button bt;
	int[] image={R.drawable.download, R.drawable.images,R.drawable.piz, R.drawable.pizza, R.drawable.pizz, R.drawable.cheese};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main_activity2001);
		addButtonListener();
		addButtonListener2();
		addButtonListener3();
		addButtonListener4();
		myViewFlipper = (ViewFlipper) findViewById(R.id.myFlipper);
        for (int i = 0; i < image.length; i++) {
            ImageView imageView = new ImageView(MainActivity2001.this);
            imageView.setImageResource(image[i]);
            
           myViewFlipper.addView(imageView);
        }

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2001, menu);
		return true;
	}
    public boolean onTouchEvent(MotionEvent event) {
    	
	    myViewFlipper.setAutoStart(true);
	    myViewFlipper.setFlipInterval(2000);
	    myViewFlipper.startFlipping();
	    return false;	
	    }
	private void addButtonListener() {
		// TODO Auto-generated method stub
		  bt=(Button) findViewById(R.id.button1);
    	  final Context context=this;
    	  bt.setOnClickListener(new OnClickListener(){
    	    public void onClick(View v){
    	    	Intent intent= new Intent(context, MainActivity2002.class);
    	    	startActivity(intent);
    	    }	  
    	  });
	}
	private void addButtonListener2() {
		// TODO Auto-generated method stub
		  bt=(Button) findViewById(R.id.button2);
    	  final Context context=this;
    	  bt.setOnClickListener(new OnClickListener(){
    	    public void onClick(View v){
    	    	Intent intent= new Intent(context, MainActivity2003.class);
    	    	startActivity(intent);
    	    }	  
    	  });
	}
	private void addButtonListener3() {
		// TODO Auto-generated method stub
		  bt=(Button) findViewById(R.id.button3);
		  
    	  final Context context=this;
    	  bt.setOnClickListener(new OnClickListener(){
    	    public void onClick(View v){
    	    	Intent intent= new Intent(context, MainActivity2004.class);
    	    	startActivity(intent);
    	    }	  
    	  });
	}
	private void addButtonListener4(){
		bt=(Button) findViewById(R.id.button4);
		final Context context=this;
  	  bt.setOnClickListener(new OnClickListener(){
  	    public void onClick(View v){
  	    	Intent intent= new Intent(context, MainActivity6.class);
  	    	startActivity(intent);
  	    }	  
  	  });
		
	}

}
