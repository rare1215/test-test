
package com.example.diaryapp;
import androidx.room.Entity;import androidx.room.PrimaryKey;
@Entity
public class Diary{
 @PrimaryKey(autoGenerate=true) public int id;
 public String content;
}
