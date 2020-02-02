package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGClass {
   public static void main(String[] args) {
}
    @BeforeClass
    public void setUp(){
    System.out.println("Before class is running...");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running...");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("After method is running...");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running...");
    }

    @Test
    public void afirstTest(){
        System.out.println("1st test is running...");

        Assert.assertEquals("actualValue", "Value", "First test i failed.");
        Assert.assertEquals(1, 1, "First test is failed.");
    }

    @Test
    public void bsecondTest(){
        System.out.println("2nd test is running...");
    }
}