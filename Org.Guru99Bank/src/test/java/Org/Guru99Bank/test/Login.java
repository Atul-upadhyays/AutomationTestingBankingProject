package Org.Guru99Bank.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Login {
WebDriver driver;
@BeforeClass
public void beforeClass() {
	driver = new FirefoxDriver();}

}

