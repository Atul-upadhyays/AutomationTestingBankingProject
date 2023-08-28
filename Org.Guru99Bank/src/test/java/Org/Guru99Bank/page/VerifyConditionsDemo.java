package Org.Guru99Bank.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
 
public class VerifyConditionsDemo {
	WebDriver driver;
 @Test
    public void dds() {
 
        driver = new FirefoxDriver();
         driver.get("https://google.com/");
         WebElement a = driver.findElement(By.className("SDkEP"));
        
         System.out.println(a.isDisplayed());
         System.out.println(a.isEnabled());
         WebElement b = driver.findElement(By.className("gNO89b"));
         System.out.println(b.isSelected());
         driver.navigate().to("https://getbootstrap.com/docs/5.0/forms/checks-radios/");
         WebElement c = driver.findElement(By.className("form-check-input"));
         c.click();
         System.out.println(c.isSelected());
 }
 }
