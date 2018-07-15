package 数据库;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper1  extends SQLiteOpenHelper{

	private static int version=1;

	public MyOpenHelper1(Context context) {
		super(context, "yonghu.db",null, version);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自动生成的方法存根
		String student2="create table yonghu(_id integer primary key autoincrement," +
				"yonghuming," +
				"mima," +
				"xingming," +
				"xingbie," +
				"lianxifangshi)";
		
      db.execSQL(student2);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO 自动生成的方法存根
		
	}

}
