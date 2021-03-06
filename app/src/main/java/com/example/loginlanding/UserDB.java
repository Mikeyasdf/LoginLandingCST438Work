package com.example.loginlanding;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1 )
public abstract class UserDB extends RoomDatabase {

    private static UserDB instance;
    public static final String USER_TABLE = "USERLOG_CLASS";

    public abstract UserDAO userDao();

    public static synchronized UserDB getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), UserDB.class, "user_db").
                    fallbackToDestructiveMigration().build();
        }
        return instance;
    }

}