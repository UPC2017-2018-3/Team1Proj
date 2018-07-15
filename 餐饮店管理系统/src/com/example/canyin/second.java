package com.example.canyin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends MainActivity{
	
	public  Button caidan,yonghugl,diancai,jiezhang;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
        caidan=(Button)findViewById(R.id.button1);
        yonghugl=(Button)findViewById(R.id.button2);
        diancai=(Button)findViewById(R.id.button3);
        jiezhang=(Button)findViewById(R.id.button4);
        caidan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent1=new Intent();
				intent1.setClass(second.this,caidan.class);
				startActivity(intent1);
			}
		});
        yonghugl.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				Intent intent2=new Intent();
				intent2.setClass(second.this,yonghugl.class);
				startActivity(intent2);
			}
		});
        diancai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				
			}
		});
        jiezhang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO 自动生成的方法存根
				
			}
		});
}
}
