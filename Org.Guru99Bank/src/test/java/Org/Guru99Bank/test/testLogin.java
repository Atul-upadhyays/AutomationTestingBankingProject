package Org.Guru99Bank.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testLogin {
WebDriver driver;
Org.Guru99Bank.page.Login Login;
@BeforeClass
public void beforeClass() {
	driver = new FirefoxDriver();
	Login a = new Login(driver); 
}


@Test
public void Login() {
	
}

}
