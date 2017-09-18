package org.example.pizza_app;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String>{
	 private final Context context;
	    private final String[] values;
		public MobileArrayAdapter(Context context, String[] values) {
			super(context, R.layout.activity_main_activity2002,values);
			this.context= context;
			this.values= values;
			// TODO Auto-generated constructor stub
		}
		public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			View rowView= inflater.inflate(R.layout.activity_main_activity2002, parent, false);
			TextView textView= (TextView) rowView.findViewById(R.id.secondLine);
			ImageView imageView=(ImageView) rowView.findViewById(R.id.logo);
			textView.setText(values[position]);
			
			String s=values[position];
			System.out.println(s);
			if(s.equals("Country Special")){
				imageView.setImageResource(R.drawable.dishcountryspecial);
			}else if(s.equals("Margherita")){
				imageView.setImageResource(R.drawable.dishdoublecheesemargherita);
			}else if(s.equals("Veg Extravaganza")){
				imageView.setImageResource(R.drawable.dishvegextravaganza);
				
			}else if(s.equals("Delux Veggie")){
				imageView.setImageResource(R.drawable.deluxveggie);
					
			}else if(s.equals("Spicy Delight")){
				imageView.setImageResource(R.drawable.spicydelight);
				
			}
			return rowView;
		}
	   

}
