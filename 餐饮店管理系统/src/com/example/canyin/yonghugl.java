package com.example.canyin;

import Êý¾Ý¿â.MyOpenHelper1;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class yonghugl extends second {

	public Button ck;
	private MyOpenHelper1 helper;
	private Cursor cursor;
	public ListView ls;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yonghugl);
		helper=new MyOpenHelper1(this);
		cursor=helper.getReadableDatabase().query("yonghu", null, null, null, null, null, null);
		ck=(Button)findViewById(R.id .button1);
		ls=(ListView)findViewById(R.id .listView1);
}
	public void chakan(View view){
		displayAllstudent();
		
	}
	public void displayAllstudent(){
		cursor=helper.getReadableDatabase().query("yonghu", null, null, null, null, null, null);
		SimpleCursorAdapter adapter=new SimpleCursorAdapter(this,R.layout.huxs,cursor,
				new String[]{"xingming","xingbie","lianxifangshi"},
				new int[]{R.id.textView1,R.id.textView2,R.id.textView3});
		ls.setAdapter(adapter);
	}
}
