package com.example.androidroom;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertAll(User... users);

    @Query("SELECT * FROM user")
    List<User> getAll();
}