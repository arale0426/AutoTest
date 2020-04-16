package com.course.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name:"+name+",age:"+age);
    }

    @DataProvider(name="data")
    public Object[][] ProviderData(){
        Object[][] o=new Object[][]{{"XIXI",3},{"BEIBEI",4},{"NANNAN",5}};
        return o;
    }

    @Test(dataProvider = "samename")
    public void test1(String name,int age){
        System.out.println("test111方法的name:"+name+",age:"+age);
    }

    @Test(dataProvider = "samename")
    public void test2(String name,int age){
        System.out.println("test222方法的name:"+name+",age:"+age);
    }

    @DataProvider(name="samename")
    public Object[][] dataProvider(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{{"嘟嘟",1},{"西西",2}};
        }else if(method.getName().equals("test2")){
            result=new Object[][]{{"小丸子",1},{"浩浩",2}};
        }
        return result;
    }
}
