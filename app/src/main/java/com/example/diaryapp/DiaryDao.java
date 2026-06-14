
package com.example.diaryapp;
import androidx.room.*;import java.util.*;
@Dao
public interface DiaryDao{
 @Insert void insert(Diary d);
 @Query("SELECT * FROM Diary") List<Diary> getAll();
}
