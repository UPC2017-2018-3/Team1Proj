package ���ݿ�;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper extends SQLiteOpenHelper {

	
	private static int version=2;

	public MyOpenHelper(Context context) {
		super(context, "caidan.db", null, version);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO �Զ����ɵķ������
		String student1="create table caidan(_id integer primary key autoincrement," +
				"name ," +
		        
				"price)";
		db.execSQL(student1);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO �Զ����ɵķ������
		
	}

}