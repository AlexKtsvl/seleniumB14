package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1SearchAmazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        amazonSearchBox.sendKeys("wooden spoon");
        Thread.sleep(2000);
        WebElement amazonSearchButton = driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearchButton.click();






    }
}
