package com.example.fastcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {
	
	
	TextView tw;
	Button b1;
	Button b2;	
	Button b3; 
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	    	/*setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
	  
	
	    	setRasp("-","���","�������","��������������","�������","�������","-");
	   
	
	    	setRasp("����. ��","����. ��","���","������� ��.","������","������� ��.","���-��");
	   
	
	    	setRasp("����. ��","����. ��.","�������","�������","�������","������","������ �� ������(2 ������)");
	  
	    	setRasp("���������","���������","��������","����������","������","���. ������� �� ������(2 ������)","������ �� �������������(1 ������)");
	   
	    	setRasp("���-��","���������","�����������","�����������","�������","�����","������ �� ���������(2 ������)");*/
	
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		 //super.onBackPressed();
			//setContentView(R.layout.activity_main);
			
			 Intent i = getBaseContext().getPackageManager().getLaunchIntentForPackage( getBaseContext().getPackageName() );
			 i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			 startActivity(i);
			 
			 
			
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tw = (TextView) findViewById(R.id.tw);
		b1 = (Button) findViewById(R.id.button11);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button10);
		
		
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.din);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("-");
				b2.setText("���");
				b3.setText("�������");
				b4.setText("�������.");
				b5.setText("�������");
				b6.setText("�������");
				tw.setText("-");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("���-��");
				b2.setText("���-��");
				b3.setText("���-��");
				b4.setText("������� ��.");
				b5.setText("���-��");
				b6.setText("���������");
				tw.setText("������ �� ����������(1 ������)");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
       b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("����. ��.");
				b2.setText("����. ��.");
				b3.setText("���");
				b4.setText("������� ��.");
				b5.setText("������");
				b6.setText("������� ��.");
				tw.setText("���-��");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
       b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("����. ��.");
				b2.setText("����. ��.");
				b3.setText("�������");
				b4.setText("�������");
				b5.setText("�������");
				b6.setText("������");
				tw.setText("������ �� ������(2 ������)");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
       b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("���������");
				b2.setText("���������");
				b3.setText("��������");
				b4.setText("����������");
				b5.setText("������");
				b6.setText("���. ������� �� ������(2 ������)");
				tw.setText("������ �� �������������(1 ������)");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
       b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("������� ��.");
				b2.setText("���������");
				b3.setText("�����������");
				b4.setText("�����������");
				b5.setText("�������");
				b6.setText("�����");
				tw.setText("������ �� ���������(2 ������)");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});
       /*b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("�����������");
				b2.setText("�������");
				b3.setText("�����");
				b4.setText("�������");
				b5.setText("�������");
				b6.setText("�������");
				b7.setText("�������� ��");
				//setRasp("���-��","���-��","���-��","������� ��.","���-��","���������","������ �� ����������(1 ������)");
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
public String timeLost(){
	
	
	return null;
}
	
}
