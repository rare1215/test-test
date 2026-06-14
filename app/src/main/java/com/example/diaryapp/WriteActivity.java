
package com.example.diaryapp;
import android.app.Activity;import android.content.Intent;import android.net.Uri;import android.os.Bundle;import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import jp.wasabeef.richeditor.RichEditor;
public class WriteActivity extends AppCompatActivity{
 RichEditor editor; ImageView img;
 protected void onCreate(Bundle b){super.onCreate(b);
 LinearLayout l=new LinearLayout(this);l.setOrientation(1);
 editor=new RichEditor(this);
 Button bold=new Button(this);bold.setText("B");
 bold.setOnClickListener(v->editor.setBold());
 Button addImg=new Button(this);addImg.setText("IMG");
 img=new ImageView(this);
 addImg.setOnClickListener(v->{
  Intent i=new Intent(Intent.ACTION_PICK);
  i.setType("image/*");
  startActivityForResult(i,1);
 });
 l.addView(bold);l.addView(addImg);l.addView(editor);l.addView(img);
 setContentView(l);
 }
 protected void onActivityResult(int r,int c,Intent d){
  if(r==1 && d!=null){Uri u=d.getData(); img.setImageURI(u);} }
}
