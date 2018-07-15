package com.example.canyin;

import ���ݿ�.MyOpenHelper;
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
	public ���ݿ�.MyOpenHelper helper;
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
		// TODO �Զ����ɵķ������
		SQLiteDatabase db=helper.getWritableDatabase();
		
		
		String mingchen=mc.getText().toString().trim();
		String jiage=jg.getText().toString().trim();
		
		
		ContentValues value=new ContentValues();
		value.put("name",mingchen);
		value.put("price",jiage);
	
	    long rowid=db.insert("caidan", null, value);
	    if(rowid!=0){
	    	Toast.makeText(this, "��Ʒ�����ɹ�! ", Toast.LENGTH_LONG).show();
	    	
	    }
		db.close();
		
	}
    public void chaxun(View view){
 	   SelectData();
    }
	private void SelectData() {
		// TODO �Զ����ɵķ������
		
		SQLiteDatabase db=helper.getWritableDatabase();
				Cursor cur=db.query("caidan",//����
						null, //����  string[]{}  ( shuzu)
						null, //where�������䣨��ѯ������
						null, //�����Ĳ���
					    null, 
						null, 
						null);
				CursorAdapter adapter=new CursorAdapter(this,cur){

					@Override
					public void bindView(View arg0, Context arg1, Cursor arg2) {
						// TODO �Զ����ɵķ������
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
						// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		if(cursor.moveToLast()){
			display();
		}
	}
	private void next() {
		// TODO �Զ����ɵķ������
		if(cursor.moveToNext()){
			display();
		}
	}
	private void prev() {
		// TODO �Զ����ɵķ������
		if(cursor.moveToPrevious()){
			display();
		}
	}
	private void frist() {
		// TODO �Զ����ɵķ������
		if(cursor.moveToFirst()){
			display();
		}
	}
	private void display() {
		// TODO �Զ����ɵķ������
		String name=cursor.getString(cursor.getColumnIndex("name"));
		String price=cursor.getString(cursor.getColumnIndex("price"));
		
		
		mc.setText(name);
		jg.setText(price);
		
	}
	public void shanchu(View view){
		deletedata();
	}
	private void deletedata() {
		// TODO �Զ����ɵķ������
		String id=cursor.getString(cursor.getColumnIndex("_id"));
		SQLiteDatabase db=helper.getReadableDatabase();
		int line=db.delete("caidan", "_id=?", new String[]{id});
		if(line>0){
			Toast.makeText(this, "��Ʒ��Ϣɾ���ɹ���", Toast.LENGTH_LONG).show();
		}
		db.close();
		
	
	}
}
