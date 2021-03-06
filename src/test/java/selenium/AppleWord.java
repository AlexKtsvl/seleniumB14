package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleWord {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        String expectedResult = "apple";
        String actualResult = driver.getTitle();


        if(actualResult.contains(expectedResult)){
            System.out.println("Apple title verification is PASSED");
        }else{
            System.out.println("Apple title verification is FAILED");
        }
    }
}
