package Org.Guru99Bank.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v111.css.CSS.GetBackgroundColorsResponse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetCommands {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://onepagelove.com/tag/text-only");
//		String a=driver.getTitle(); //tabname
//		String a=driver.getCurrentUrl();
//		String b=driver.getPageSource(); 
//		System.out.println(a);
//		System.out.println(b);
	}
	@Test
	public void n() {
		SoftAssert s = new SoftAssert();
//		gettext%
//		gettagname%
//		getcssvalue%
//		getAttribute%
//		getsize%
//		
		//driver.
		//gettitle
//		getcurrenturl
//		getpagesource
		
//		String a = driver.findElement(By.className("header-title")).getTagName();
//		String a = driver.findElement(By.id("algoliaSearchModal")).getAttribute("style");
		//get size use for return width and height of webelement
//		Dimension a = driver.findElement(By.className("header-title")).getSize();
	
//		System.out.println(a);
//		s.assertEquals(a , "610");
		Boolean b  = 3>2;
		Boolean c  = true;
		s.assertTrue(b.equals(c),"true" );
		System.out.println("kashariya bilayati bad man");
		 //this method only exist in soft assertion
		;
		
	}
	
	@Test
	public void k() {
		System.out.println("ram is a ideal kid");
		driver.quit();}
//	TYPE OF  ASSERTion  (STATIC MATHOD)
//	Assert.assertEquals(false, null)%;
//	Boolean b  = 2>3;
//	Boolean c  = true;
//	Assert.assertEquals(b , c); //fail
	
	
//	Assert.assertNotEquals()%;
//	Boolean b  = 2>3;
//	Boolean c  = true;
//	Assert.assertNotEquals(b , c); //pass
	
	
//	Assert.assertTrue(false);
	//boolean methods
	//.equalsIgnoreCase
//	Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//	assertTrue(verifyTitle);
	//.isDisplayed() = isDisplayed() is capable to check for the presence of all kinds of web elements available. 
	//.isEnabled() =buttons, drop boxes,  
	//.isSelected()=checkboxes, radio buttons
	//.Equal
//	softAssert.assertTrue("BrowserStack".equals("Browserstack"),
//			"First soft assert failed");
	
//	Assert.assertFalse(false);
//	Assert.assertNull(MATHOD);
//	String z=null;
//	Assert.assertNull(z);  //pass
//	Assert.assertNotNull(MATHOD);
// AssertAll only use for soft assertion and show/invoke assert result in systematic way
}
