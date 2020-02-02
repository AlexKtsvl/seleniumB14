package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetHerokuVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("anytext");
        driver.findElement(By.id("form_submit")).click();
        String ActualUrl = driver.getCurrentUrl();
        String expectedInUrl = "email_sent";

        if(ActualUrl.contains(expectedInUrl)){
            System.out.println("Url verification passed");
        }else{
            System.out.println("Url verification failed");
        }

        String actualTextBoxValue = driver.findElement(By.id("content")).getText();
        String expectedTextBoxValue = "Your e-mail's been sent!";

        if(actualTextBoxValue.contains(expectedTextBoxValue)){
            System.out.println("Text box value verification passed");
        }else{
            System.out.println("Text box value verification failed");
        }
    }
}
