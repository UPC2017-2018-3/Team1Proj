package ���ݿ�;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper1  extends SQLiteOpenHelper{

	private static int version=1;

	public MyOpenHelper1(Context context) {
		super(context, "yonghu.db",null, version);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		
	}

}
