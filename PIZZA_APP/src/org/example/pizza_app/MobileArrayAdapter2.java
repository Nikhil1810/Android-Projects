package org.example.pizza_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter2 extends ArrayAdapter<String> {
	 private final Context context;
	    private final String[] values;
		public MobileArrayAdapter2(Context context, String[] values) {
			super(context, R.layout.activity_main_activity2003,values);
			this.context= context;
			this.values= values;
			// TODO Auto-generated constructor stub
		}
		public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			View rowView= inflater.inflate(R.layout.activity_main_activity2003, parent, false);
			TextView textView= (TextView) rowView.findViewById(R.id.secondLine2);
			ImageView imageView=(ImageView) rowView.findViewById(R.id.logo1);
			textView.setText(values[position]);
			
			String s=values[position];
			System.out.println(s);
			if(s.equals("Barbecue Chicken")){
				imageView.setImageResource(R.drawable.bbqchicken);
			}else if(s.equals("NonVeg Extra")){
				imageView.setImageResource(R.drawable.nvegextra);
			}else if(s.equals("Mexican Chicken")){
				imageView.setImageResource(R.drawable.mexicanchicken);
				
			}else if(s.equals("Cheese N Barbequee")){
				imageView.setImageResource(R.drawable.dishcheesenbbq);
					
			}else if(s.equals("Golden Delight")){
				imageView.setImageResource(R.drawable.chickengoldendelight);
				
			}
			return rowView;
		}
	   

}
