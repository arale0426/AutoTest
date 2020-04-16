package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("这是class1的方法stu1");
    }

    public void stu2(){
        System.out.println("这是class1的方法stu2");
    }
}
