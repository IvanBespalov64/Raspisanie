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
	    	/*setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
	  
	
	    	setRasp("-","МХК","История","Обществознание","Алгебра","Алгебра","-");
	   
	
	    	setRasp("Англ. Яз","Англ. Яз","МХК","Русский яз.","Физика","Русский Яз.","Лит-ра");
	   
	
	    	setRasp("Англ. Яз","Англ. Яз.","Алгебра","Алгебра","История","Физика","Кружок по физике(2 корпус)");
	  
	    	setRasp("Геометрия","Геометрия","Биология","Технология","Физика","Доп. занятия по физике(2 корпус)","Кружок по робототехнике(1 корпус)");
	   
	    	setRasp("Лит-ра","География","Информатика","Информатика","Алгебра","Химия","Кружок по экономике(2 корпус)");*/
	
	
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
				b2.setText("МХК");
				b3.setText("История");
				b4.setText("Обществ.");
				b5.setText("Алгебра");
				b6.setText("Алгебра");
				tw.setText("-");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Физ-ра");
				b2.setText("Физ-ра");
				b3.setText("Физ-ра");
				b4.setText("Русский яз.");
				b5.setText("Лит-ра");
				b6.setText("География");
				tw.setText("Кружок по математике(1 корпус)");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
       b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Англ. Яз.");
				b2.setText("Англ. Яз.");
				b3.setText("МХК");
				b4.setText("Русский яз.");
				b5.setText("Физика");
				b6.setText("Русский Яз.");
				tw.setText("Лит-ра");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
       b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Англ. Яз.");
				b2.setText("Англ. Яз.");
				b3.setText("Алгебра");
				b4.setText("Алгебра");
				b5.setText("История");
				b6.setText("Физика");
				tw.setText("Кружок по физике(2 корпус)");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
       b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Геометрия");
				b2.setText("Геометрия");
				b3.setText("Биология");
				b4.setText("Технология");
				b5.setText("Физика");
				b6.setText("Доп. Занятия по Физике(2 корпус)");
				tw.setText("Кружок по робототехнике(1 корпус)");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
       b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Русский Яз.");
				b2.setText("География");
				b3.setText("Информатика");
				b4.setText("Информатика");
				b5.setText("Алгебра");
				b6.setText("Химия");
				tw.setText("Кружок по экономике(2 корпус)");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
			}
		});
       /*b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				b1.setText("Понедельник");
				b2.setText("Вторник");
				b3.setText("Среда");
				b4.setText("Четверг");
				b5.setText("Пятница");
				b6.setText("Суббота");
				b7.setText("Очистить всё");
				//setRasp("Физ-ра","Физ-Ра","Физ-ра","Русский яз.","Лит-ра","География","Кружок по математике(1 корпус)");
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
