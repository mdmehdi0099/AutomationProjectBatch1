import org.testng.annotations.*;


public class TestngPractice1 {


    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @Test
    public void test1(){
        System.out.println("Test");
    }


}
