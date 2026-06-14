
package com.example.diaryapp;
import androidx.room.*;import android.content.Context;
@Database(entities={Diary.class},version=1)
public abstract class AppDatabase extends RoomDatabase{
 public abstract DiaryDao diaryDao();
 public static AppDatabase get(Context c){
  return Room.databaseBuilder(c,AppDatabase.class,"db").allowMainThreadQueries().build();
 }
}
