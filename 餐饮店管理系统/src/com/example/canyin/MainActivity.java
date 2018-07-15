package com.example.canyin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public EditText yhm;
	public EditText mima;
	public Button qd;
	public Button qx,zhuce;
	public TextView xs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		yhm=(EditText)findViewById(R.id.editText1);
		mima=(EditText)findViewById(R.id.editText2);
		qd=(Button)findViewById(R.id.button1);
		qx=(Button)findViewById(R.id.button2);
		zhuce=(Button)findViewById(R.id.button3);
		xs=(TextView)findViewById(R.id.textView3);
		
		qd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				String name=yhm.getText().toString();
				String password=mima.getText().toString();
				Intent intent=new Intent();
				intent.setClass(MainActivity.this,second.class);
				startActivity(intent);
			}
			
		});
		qx.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				yhm.setText("");
				mima.setText("");
			}
		});
		zhuce.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1=new Intent();
				intent1.setClass(MainActivity.this,zhuceyemian.class);
				startActivity(intent1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
