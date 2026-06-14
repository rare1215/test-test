
package com.example.diaryapp;
import android.content.Intent;import android.os.Bundle;import android.widget.*;import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
 protected void onCreate(Bundle b){super.onCreate(b);
 LinearLayout l=new LinearLayout(this);l.setOrientation(1);
 Button btn=new Button(this);btn.setText("Write Diary");
 btn.setOnClickListener(v->startActivity(new Intent(this,WriteActivity.class)));
 l.addView(btn);
 setContentView(l);
 }}
