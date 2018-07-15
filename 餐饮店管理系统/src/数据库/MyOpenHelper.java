package 数据库;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper extends SQLiteOpenHelper {

	
	private static int version=2;

	public MyOpenHelper(Context context) {
		super(context, "caidan.db", null, version);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自动生成的方法存根
		String student1="create table caidan(_id integer primary key autoincrement," +
				"name ," +
		        
				"price)";
		db.execSQL(student1);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO 自动生成的方法存根
		
	}

}