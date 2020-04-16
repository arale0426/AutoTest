package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("ignoreTest1执行");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignoreTest2执行");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignoreTest3执行");
    }
}
