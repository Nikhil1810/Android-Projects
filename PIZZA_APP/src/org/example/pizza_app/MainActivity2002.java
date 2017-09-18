package org.example.pizza_app;


import android.os.Bundle;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity2002 extends ListActivity implements OnItemClickListener {

	static final String[] Veg_Pizza= new String[] {"Country Special", "Margherita", "Veg Extravaganza","Delux Veggie","Spicy Delight"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new MobileArrayAdapter(this, Veg_Pizza));
		ListView listView= getListView();
		listView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
		Toast.makeText(MainActivity2002.this,"You Clicked on "+ite, Toast.LENGTH_SHORT).show();
		if(ite=="Country Special"){
			
			Intent intent= new Intent(context, MainActivity2005.class);
			startActivity(intent);
			}
		else if(ite=="Margherita"){
			
			Intent intent= new Intent(context, MainActivity2006.class);
			startActivity(intent);
			}
        else if(ite=="Veg Extravaganza"){
			
			Intent intent= new Intent(context, MainActivity2007.class);
			startActivity(intent);
			}
        else if(ite=="Delux Veggie"){
			
			Intent intent= new Intent(context, MainActivity2008.class);
			startActivity(intent);
			}
        else if(ite=="Spicy Delight"){
			
			Intent intent= new Intent(context, MainActivity2009.class);
			startActivity(intent);
			}




	}
}
