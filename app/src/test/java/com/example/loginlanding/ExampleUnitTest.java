package com.example.loginlanding;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    public MainActivity mActivity;
    public MainActivity2 sActivity;
    Context context;
    UserDAO  userDAO;

    @Before
    public void before(){
        mActivity = new MainActivity();
        sActivity = new MainActivity2();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //intent test
    @Test
    public void verifyIntent() {
        Intent intent = MainActivity.intentFactory(context, 1);
        assertNotNull(intent);
    }

    //login test
    @Test
    public void testLogin() {
        User user = new User();

        User tUser = new User("din_djarin", "baby_yoda_ftw");

        Intent intent = MainActivity.intentFactory(context, 1);
        assertNotNull(intent);
//        assertEquals("din_djarin", tUser);

    }
//    @Test
//    public void testPasswordLogin() {
//        User user = new User();
//
//        User tUser = new User("din_djarin", "baby_yoda_ftw");
//
//        Intent intent = MainActivity.intentFactory(context, 1);
//        assertNotNull(intent);
////        assertEquals("din_djarin", tUser);
//
//    }

//    @Test
//    public void verifyUsername() {
//        boolean pass = false;
//
//        User user = new User("din_djarin", "baby_yoda_ftw");
//        User mUser = new User("din_djarin", "baby_yoda_ftw");
//
//        userDAO.insert(mUser);
//
//        User dummyUser = userDAO.getUsername(user.getUsername());
//
//        if (dummyUser != null) {
//            pass = true;
//        }
//        assertTrue(pass);
//    }


}
