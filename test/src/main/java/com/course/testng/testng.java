package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void aftermethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
}
