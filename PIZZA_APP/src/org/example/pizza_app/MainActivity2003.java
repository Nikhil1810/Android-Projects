package org.example.pizza_app;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2003 extends ListActivity implements OnItemClickListener{
	static final String[] NonVeg_Pizza= new String[] {"Barbecue Chicken", "NonVeg Extra", "Mexican Chicken","Cheese N Barbequee","Golden Delight"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new MobileArrayAdapter2(this, NonVeg_Pizza));
		ListView listView= getListView();
		listView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2003, menu);
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
		Toast.makeText(MainActivity2003.this,"You Clicked on "+ite, Toast.LENGTH_SHORT).show();
		if(ite=="Golden Delight"){
			
			Intent intent= new Intent(context, MainActivity2010.class);
			startActivity(intent);
			}
		else if(ite=="Barbecue Chicken"){
			
			Intent intent= new Intent(context, MainActivity2011.class);
			startActivity(intent);
			}
        else if(ite=="NonVeg Extra"){
			
			Intent intent= new Intent(context, MainActivity2012.class);
			startActivity(intent);
			}
        else if(ite=="Mexican Chicken"){
			
			Intent intent= new Intent(context, MainActivity2013.class);
			startActivity(intent);
			}
        else if(ite=="Cheese N Barbequee"){
			
			Intent intent= new Intent(context, MainActivity2014.class);
			startActivity(intent);
			}

	}

	
}
