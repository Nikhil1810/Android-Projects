package org.example.pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity2004 extends ListActivity implements OnItemClickListener {

	static final String[] Side_Orders= new String[] {"Garlic Breadsticks", "Calzone Non Veg", "Calzone Veg","Taco Indiana","Cheese Dip"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new MobileArrayAdapter3(this, Side_Orders));
		ListView listView= getListView();
		listView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2004, menu);
		return true;
	}

	
	protected void onListItemClick(ListView lv, View v, int position, long id){
		String selectedValue= (String) getListAdapter().getItem(position);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
	}
	
	public void onItemClick(AdapterView<?> adapter, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		final Context context=this;
		String ite= adapter.getItemAtPosition(position).toString();
		Toast.makeText(MainActivity2004.this,"You Clicked on "+ite, Toast.LENGTH_SHORT).show();
		if(ite=="Garlic Breadsticks"){
			
			Intent intent= new Intent(context, MainActivity2016.class);
			startActivity(intent);
			}
		else if(ite=="Calzone Non Veg"){
			
			Intent intent= new Intent(context, MainActivity2017.class);
			startActivity(intent);
			}
        else if(ite=="Calzone Veg"){
			
			Intent intent= new Intent(context, MainActivity2018.class);
			startActivity(intent);
			}
        else if(ite=="Taco Indiana"){
			
			Intent intent= new Intent(context, MainActivity2019.class);
			startActivity(intent);
			}
        else if(ite=="Cheese Dip"){
			
			Intent intent= new Intent(context, MainActivity2020.class);
			startActivity(intent);
			}




	}
}
