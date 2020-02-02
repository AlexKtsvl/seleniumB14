package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();



    }
}
