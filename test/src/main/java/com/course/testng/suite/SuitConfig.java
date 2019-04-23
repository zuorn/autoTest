package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {

    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("before suit运行了");
    }

    @AfterSuite
    public void AfterSuit(){
        System.out.println("after suit 运行了");
    }
}
