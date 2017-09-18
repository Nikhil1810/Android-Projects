package org.example.pizza_app;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Resources resource = getResources();
		TabHost tabhost = getTabHost();
		
		//student tab...
		
		Intent orderintent = new Intent().setClass(MainActivity.this, MainActivity2.class);
		TabSpec tabspecstudent = tabhost.newTabSpec("Order")
				.setIndicator("ORDER", resource.getDrawable(R.drawable.ic_launcher))
				.setContent(orderintent);
		
		//faculty tab...
		
		Intent offerintent = new Intent().setClass(this, MainActivity3.class);
		TabSpec tabspecfaculty = tabhost.newTabSpec("Offer")
				.setIndicator("OFFERS", resource.getDrawable(R.drawable.ic_launcher))
				.setContent(offerintent);
		
		//admin tab...
		Intent locationintent = new Intent().setClass(this, MainActivity4.class);
		TabSpec tabspecadmin = tabhost.newTabSpec("location")
				.setIndicator("LOCATION", resource.getDrawable(R.drawable.ic_launcher))
				.setContent(locationintent);
		
		// add all tabs...
		
		tabhost.addTab(tabspecstudent);
		tabhost.addTab(tabspecfaculty);
		tabhost.addTab(tabspecadmin);
		
		//set windows tab as default tab..
		
		tabhost.setCurrentTab(0);
	}

	
}
