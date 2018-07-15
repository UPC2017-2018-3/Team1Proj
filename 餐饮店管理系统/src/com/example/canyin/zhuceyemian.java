package com.example.canyin;

import 数据库.MyOpenHelper1;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class zhuceyemian extends MainActivity{
	public EditText yhm,mn,xm,xb,lxfs;
	public 数据库.MyOpenHelper1 helper;
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhuceyemian);
		yhm=(EditText)findViewById(R.id.editText1);
		mn=(EditText)findViewById(R.id.editText2);
		xm=(EditText)findViewById(R.id.editText3);
		xb=(EditText)findViewById(R.id.editText4);
		lxfs=(EditText)findViewById(R.id.editText5);
	     helper=new MyOpenHelper1(this);

}
	public void zhuce(View view){
		InsertData();
	}
	private void InsertData() {
		// TODO 自动生成的方法存根
		SQLiteDatabase db=helper.getWritableDatabase();
		
		
		String yonghuming=yhm.getText().toString().trim();
		String mima=mn.getText().toString().trim();
		String xingming=xm.getText().toString().trim();
		String xingbie=xb.getText().toString().trim();
		String lianxifangshi=lxfs.getText().toString().trim();	
		
		
		
		ContentValues value=new ContentValues();
		value.put("yonghuming",yonghuming);
		value.put("mima",mima);
		value.put("xingming",xingming);
		value.put("xingbie",xingbie);
		value.put("lianxifangshi",lianxifangshi);
	
	    long rowid=db.insert("yonghu", null, value);
	    if(rowid!=0){
	    	Toast.makeText(this, "注册成功! ", Toast.LENGTH_LONG).show();
	    	
	    }
		db.close();
		
	}
}
