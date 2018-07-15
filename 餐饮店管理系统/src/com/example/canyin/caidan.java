package com.example.canyin;

import 数据库.MyOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class caidan extends second{

	public EditText mc,jg;
	public Button tj,cx,frist,prev,next,last,shanchu;
	public 数据库.MyOpenHelper helper;
	public ListView ls;
	public TextView xian;
	private Cursor cursor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.caidan);
		helper=new MyOpenHelper(this);
		cursor=helper.getReadableDatabase().query("caidan", null, null, null, null, null, null);
		mc=(EditText)findViewById(R.id.edmc);
		jg=(EditText)findViewById(R.id.edjg);
		tj=(Button)findViewById(R.id.button1 );
		cx=(Button)findViewById(R.id.button2 );
		frist=(Button)findViewById(R.id.button3 );
		prev=(Button)findViewById(R.id.button4 );
		next=(Button)findViewById(R.id.button5 );
		last=(Button)findViewById(R.id.button6 );
		shanchu=(Button)findViewById(R.id.button7);
		ls=(ListView)findViewById(R.id.listView1);
		xian=(TextView)findViewById(R.id.textView3 );
		
}
	public void tianjia(View view){
		InsertData();
	}
	private void InsertData() {
		// TODO 自动生成的方法存根
		SQLiteDatabase db=helper.getWritableDatabase();
		
		
		String mingchen=mc.getText().toString().trim();
		String jiage=jg.getText().toString().trim();
		
		
		ContentValues value=new ContentValues();
		value.put("name",mingchen);
		value.put("price",jiage);
	
	    long rowid=db.insert("caidan", null, value);
	    if(rowid!=0){
	    	Toast.makeText(this, "菜品新增成功! ", Toast.LENGTH_LONG).show();
	    	
	    }
		db.close();
		
	}
    public void chaxun(View view){
 	   SelectData();
    }
	private void SelectData() {
		// TODO 自动生成的方法存根
		
		SQLiteDatabase db=helper.getWritableDatabase();
				Cursor cur=db.query("caidan",//表名
						null, //列明  string[]{}  ( shuzu)
						null, //where后面的语句（查询条件）
						null, //条件的参数
					    null, 
						null, 
						null);
				CursorAdapter adapter=new CursorAdapter(this,cur){

					@Override
					public void bindView(View arg0, Context arg1, Cursor arg2) {
						// TODO 自动生成的方法存根
						TextView tvname=(TextView) arg0.findViewById(R.id.textView1);
						TextView tvprice=(TextView)arg0.findViewById(R.id.textView2);
						
						
						int columnIndex=arg2.getColumnIndex("name");
						String name= arg2.getString(columnIndex);
						int columnIndex2=arg2.getColumnIndex("price");
						String price=  arg2.getString(columnIndex2);
						
						tvname.setText(name);
						tvprice.setText(price);
						
					}

					@Override
					public View newView(Context arg0, Cursor arg1,
							ViewGroup arg2) {
						// TODO 自动生成的方法存根
						View view=LayoutInflater.from(caidan.this).inflate(R.layout.cyxs, null);
						
						return view;
					} 
				};
				ls.setAdapter(adapter);
				db.close();
	}
	public void liulan(View view){
		switch(view.getId()){
		case R.id.button3:
			frist();
			break;
		case R.id.button4:
			prev();
			break;
		case R.id.button5:
			next();
			break;
		case R.id.button6:
			last();
			break;
		}
	}
	private void last() {
		// TODO 自动生成的方法存根
		if(cursor.moveToLast()){
			display();
		}
	}
	private void next() {
		// TODO 自动生成的方法存根
		if(cursor.moveToNext()){
			display();
		}
	}
	private void prev() {
		// TODO 自动生成的方法存根
		if(cursor.moveToPrevious()){
			display();
		}
	}
	private void frist() {
		// TODO 自动生成的方法存根
		if(cursor.moveToFirst()){
			display();
		}
	}
	private void display() {
		// TODO 自动生成的方法存根
		String name=cursor.getString(cursor.getColumnIndex("name"));
		String price=cursor.getString(cursor.getColumnIndex("price"));
		
		
		mc.setText(name);
		jg.setText(price);
		
	}
	public void shanchu(View view){
		deletedata();
	}
	private void deletedata() {
		// TODO 自动生成的方法存根
		String id=cursor.getString(cursor.getColumnIndex("_id"));
		SQLiteDatabase db=helper.getReadableDatabase();
		int line=db.delete("caidan", "_id=?", new String[]{id});
		if(line>0){
			Toast.makeText(this, "菜品信息删除成功！", Toast.LENGTH_LONG).show();
		}
		db.close();
		
	
	}
}
