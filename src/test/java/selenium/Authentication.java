package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedResult = "Web Orders Login";
        //String actualResult = driver.getTitle();
        if (driver.getTitle().equals(expectedResult)) {
            System.out.println("Web Order Login title is PASSED");
        } else{
            System.out.println("Web Order Login title is FAILED");
        }
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String expectedResultWebOrder="Web Orders";
        String actualResultWebOrder=driver.getTitle();



        
        if(actualResultWebOrder.equals(expectedResultWebOrder)){
            System.out.println("Web Order Title is PASSED");
        }else{
            System.out.println("Web Order Title is FAILED");
        }
    }
}
