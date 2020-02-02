package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CraigslistCellMobile {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chicago.craigslist.org");
        driver.findElement(By.linkText("cell/mobile")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("query")).sendKeys("iphone");
        Thread.sleep(1000);
        driver.findElement(By.name("query")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("srchType")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("hasPic")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("postedToday")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("bundleDuplicates")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("searchNearby")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("search_distance")).sendKeys("4");
        Thread.sleep(1000);
        driver.findElement(By.name("postal")).sendKeys("60018");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/div[4]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/div[4]/a")).click();




    }
}