package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ECommerceSignIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email_create")).sendKeys("qwelnfnmvg@gmail.com");
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Oleksandr");
        driver.findElement(By.id("customer_lastname")).sendKeys("Kutsevol");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[23]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("company")).sendKeys("Optimus Movers LLC");
        driver.findElement(By.id("address1")).sendKeys("113 N Jordan St");
        driver.findElement(By.id("address2")).sendKeys("Apt 402");
        driver.findElement(By.id("city")).sendKeys("Alexandria");
        WebElement statedropdown=driver.findElement(By.name("id_state"));
        Select oSelect=new Select(statedropdown);
        oSelect.selectByValue("4");
        driver.findElement(By.id("postcode")).sendKeys("22304");
        driver.findElement(By.id("other")).sendKeys("Hello World!");
        driver.findElement(By.id("phone")).sendKeys("42-70-20");
        driver.findElement(By.id("phone_mobile")).sendKeys("240-421-1785");
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
        driver.findElement(By.id("alias")).sendKeys("9815 Lawrence Ct");
        driver.findElement(By.id("submitAccount")).click();
        String userText = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();

        if(userText.contains("Oleksandr Kutsevol")) {
            System.out.println("Account Validation is Passed!");
        }else{
            System.out.println("Account Validation is Failed!");
        }
    }
}