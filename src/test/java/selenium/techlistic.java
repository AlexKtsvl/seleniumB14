package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");
        //Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Oleksandr");
        //Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Kutsevol");
        //Thread.sleep(1000);
        driver.findElement(By.id("sex-0")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("exp-4")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("08/15/1096");
        //Thread.sleep(1000);
        driver.findElement(By.className("checkbox")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("tool-2")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("continents")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"continents\"]/option[2]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");

        //driver.findElement(By.className("#photo")).click();

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
}
