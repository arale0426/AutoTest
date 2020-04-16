package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组方法1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组方法2");
    }

    @BeforeGroups("server")
    public void beforServerGroup(){
        System.out.println("这是服务端方法之前执行的");
    }

    @AfterGroups("server")
    public void afterServerGroup(){
        System.out.println("这是服务端方法之后执行的");
    }

    @BeforeGroups("client")
    public void beforClientGroup(){
        System.out.println("这是客户端方法之前执行的");
    }

    @AfterGroups("client")
    public void afterClientGroup(){
        System.out.println("这是客户端方法之后执行的");
    }
}

