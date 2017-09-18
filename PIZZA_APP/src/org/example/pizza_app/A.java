package org.example.pizza_app;

import java.sql.SQLException;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class A{
	public static final String KEY_ROWID="_id";
	public static final String KEY_PIZZA="pizza_name";
	public static final String KEY_PRICE="pizza_price";
	
	public static final String DATABASE_NAME="NameDB";
	public static final String DATABASE_TABLE="Details";
	public static final int DATABASE_VERSION= 1;
	SQLiteDatabase db;
	private DbHelper ourDbHelper;
	private final Context ourContext;
	private SQLiteDatabase ourDatabase;
	
	private class DbHelper extends SQLiteOpenHelper{
        public DbHelper(Context context){
        	super(context,DATABASE_NAME, null,DATABASE_VERSION);
        }
		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("Create Table "+DATABASE_TABLE+"("+KEY_ROWID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+KEY_PIZZA+" TEXT NOT NULL, "+KEY_PRICE+" NUMBER NOT NULL );"
					);
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE);
			onCreate(db);
			
		}
		
		
	}
	public A(Context c){
		ourContext=c;
	}
	public A open()throws SQLException {
		ourDbHelper= new DbHelper(ourContext);
		ourDatabase= ourDbHelper.getWritableDatabase();
		return this;
	}
	public void close(){
		
		ourDbHelper.close();
	}
	public void getEntry(String name, int price) {
		// TODO Auto-generated method stub
		ContentValues cv= new ContentValues();
		cv.put(KEY_PIZZA, name);
		cv.put(KEY_PRICE, price);
		ourDatabase.insert(DATABASE_TABLE, null, cv);
		
	}
	public String getData() {
		// TODO Auto-generated method stub
		String [] columns={KEY_ROWID, KEY_PIZZA, KEY_PRICE};
		Cursor c= ourDatabase.query(DATABASE_TABLE, columns, null , null, null , null , null);
		String result="";
		int iRow= c.getColumnIndex(KEY_ROWID);
		int iName=c.getColumnIndex(KEY_PIZZA);
		int iPrice=c.getColumnIndex(KEY_PRICE);
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result= result+c.getString(iRow)+" "+c.getString(iName)+" "+c.getString(iPrice)+"\n";
		}
		return result;
	}

}