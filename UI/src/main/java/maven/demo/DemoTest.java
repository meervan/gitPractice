package maven.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("This is our test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test is our test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test is our test 3");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This our after test");
    }

}
