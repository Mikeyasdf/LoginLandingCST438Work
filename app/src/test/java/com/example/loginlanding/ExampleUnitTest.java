package com.example.loginlanding;

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

    @Before
    public void before(){
        mActivity = new MainActivity();
        sActivity = new MainActivity2();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_intent(){

    }


}
