package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("这是class3的方法teacher1");
    }

    public void teacher2(){
        System.out.println("这是class3的方法teacher2");
    }
}
