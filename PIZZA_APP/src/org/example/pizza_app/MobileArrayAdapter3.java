package org.example.pizza_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter3 extends ArrayAdapter<String> {
	 private final Context context;
	    private final String[] values;
		public MobileArrayAdapter3(Context context, String[] values) {
			super(context, R.layout.activity_main_activity2004,values);
			this.context= context;
			this.values= values;
			// TODO Auto-generated constructor stub
		}
		public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			View rowView= inflater.inflate(R.layout.activity_main_activity2004, parent, false);
			TextView textView= (TextView) rowView.findViewById(R.id.secondLine3);
			ImageView imageView=(ImageView) rowView.findViewById(R.id.logo2);
			textView.setText(values[position]);
			
			String s=values[position];
			System.out.println(s);
			if(s.equals("Garlic Breadsticks")){
				imageView.setImageResource(R.drawable.garlicbreadsticks);
			}else if(s.equals("Calzone Non Veg")){
				imageView.setImageResource(R.drawable.calzoneveg);
			}else if(s.equals("Calzone Veg")){
				imageView.setImageResource(R.drawable.calzoneveggie);
				
			}else if(s.equals("Taco Indiana")){
				imageView.setImageResource(R.drawable.tacoindiana);
					
			}else if(s.equals("Cheese Dip")){
				imageView.setImageResource(R.drawable.cheesedip);
				
			}
			return rowView;
		}
	   

}