package Org.Guru99Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Org.Guru99Bank.object.Objectrepo;

public class Login {
	
		WebDriver driver;

		@BeforeClass
		public void ma() {
			driver = new FirefoxDriver();
			driver.get("https://www.demo.guru99.com/V4/");
			driver.findElement(By.xpath(USERID)).click();
			
			
		
		}
}
