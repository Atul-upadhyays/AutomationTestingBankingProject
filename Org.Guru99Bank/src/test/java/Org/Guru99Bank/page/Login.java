package Org.Guru99Bank.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class Login implements Org.Guru99Bank.objects.Objectrepo{
	
		WebDriver driver;
		@BeforeClass
		public void beforeClass() {
			driver = new FirefoxDriver();
			driver.get("https://www.demo.guru99.com/V4/");
		}
		@Test
		public void login() {
			driver.findElement(By.xpath(USERID)).sendKeys("UserId");
			

			driver.findElement(By.xpath(PASSWORD)).sendKeys("Password");
			
		
			WebElement c =driver.findElement(By.xpath(LOGINBUTTON));
			c.click();
			
			String s = driver.switchTo().alert().getText();
			String t = "Login successful";
			
			
				try {
					 Assert.assertEquals(s , t);
				 } catch (Throwable e) {
				 System.out.println("Report Error =" + e);
				 }

			driver.quit();

		}
		
		
}
