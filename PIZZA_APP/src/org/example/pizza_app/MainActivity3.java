package org.example.pizza_app;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity3 extends Activity{
	final Context con=this;
    Integer[] imageIDs={R.drawable.magicpan,R.drawable.magicpanduos,R.drawable.pan4of,R.drawable.pan4offer,R.drawable.pizzahutmeal,R.drawable.pizzameal};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		Gallery gallery=(Gallery) findViewById(R.id.gallery1);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener(){
		
		@Override
		public void onItemClick(AdapterView<?> adapter, View c, int position,
				long id) {
			// TODO Auto-generated method stub
			
			Toast.makeText(getBaseContext(),"pic "+(position+1)+" selected ",Toast.LENGTH_SHORT).show();
			ImageView iv= (ImageView) findViewById(R.id.image1);
			iv.setImageResource(imageIDs[position]);
			if(position==0){
				Intent intent= new Intent(con, MainActivity2021.class);
				startActivity(intent);
			}
			if(position==1){
				Intent intent= new Intent(con, MainActivity2022.class);
				startActivity(intent);
			}
			if(position==2){
				Intent intent= new Intent(con, MainActivity2023.class);
				startActivity(intent);
			}
			if(position==3){
				Intent intent= new Intent(con, MainActivity2024.class);
				startActivity(intent);
			}
			if(position==4){
				Intent intent= new Intent(con, MainActivity2025.class);
				startActivity(intent);
			}
			if(position==5){
				Intent intent= new Intent(con, MainActivity2026.class);
				startActivity(intent);
			}
		}
		
		});
	}
	public class ImageAdapter extends BaseAdapter{
		Context context;
		int itemBackground;
		public ImageAdapter(Context c){
			context =c;
			TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
		}
		public int getCount(){
			return imageIDs.length;
		}
		public Object getItem(int position){
			return position;
		}
		public long getItemId(int position){
			return position;
		}
		public View getView(int position, View convertView, ViewGroup parent){
			ImageView iv;
			if(convertView==null){
				iv= new ImageView(context);
				iv.setImageResource(imageIDs[position]);
				iv.setScaleType(ImageView.ScaleType.FIT_XY);
				iv.setLayoutParams( new Gallery.LayoutParams(180,150));
			}else{
				iv=(ImageView) convertView;
			}
			iv.setBackgroundResource(itemBackground);
			return iv;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity3, menu);
		return true;
	}

}
