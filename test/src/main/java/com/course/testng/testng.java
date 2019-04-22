package com.course.testng;

import org.testng.annotations.*;

public class testng {
    @Test
    public void BaseicAnnotation(){
        System.out.println("这是一个测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before这是在测试方法之前运行的");

    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("这是在类运行之前的方法");

    }

    @AfterClass
    public void AfterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }
}
