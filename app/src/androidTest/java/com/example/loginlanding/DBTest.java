/*package com.example.loginlanding;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(AndroidJUnit4.class)
public class DBTest {
    private UserDAO userDao;
    private UserDB db;

    @Before
    public void createDB(){
        Context context = ApplicationProvider.getApplicationContext();
        db = Room.inMemoryDatabaseBuilder(context, UserDB.class).build();
        userDao = db.getInstance();
    }

    @After
    public void closeDB() throws IOException {
        db.close();
    }

    @Test
    public void tryInsert() throws Exception{
        Boolean pass = false;
        User testUser = new User("din_djarin", "baby_yoda_ftw");

        userDao.insert(testUser);

        if(userDao.)
    }
}*/
