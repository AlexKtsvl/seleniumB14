package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        if(driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("Username verification PASSED!");
            System.out.println("Username is displayed on page");
        }else{
            System.out.println("Username verification FAILED!");
            System.out.println("Username is not displayed on page");

        }


        String ActualTitle = driver.getTitle();

    }
}
