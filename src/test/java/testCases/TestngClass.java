package testCases;

import org.testng.annotations.*;

public class TestngClass {

    //class
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    //method
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    //set of actions
    @Test
    public void executeTest(){
        //go to the linkedin
        //clik on signin
        System.out.println("inside execute test");
    }

    @Test
    public void executeTest1(){
        System.out.println("executeTest1");
    }



}
