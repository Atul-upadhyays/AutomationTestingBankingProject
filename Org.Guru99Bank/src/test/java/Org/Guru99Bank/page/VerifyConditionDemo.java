import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
 
public class VerifyConditionsDemo {
 
    public static void main(String[] args) {
 
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vibha\\Software\\geckodriver-v0.31.0-win64\\geckodriver.exe");
 
        // Initiate Firefox browser
        WebDriver driver = new FirefoxDriver();
 
        // Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        // launch the firefox browser and open the application url
        driver.get("https://duckduckgo.com/");
 
        // compare the expected title of the page with the actual title of the page and
        String expectedTitle = "DuckDuckGo — Privacy, simplified.";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Verification Pass- The correct title is displayed on the web page.");
        } else {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }
 
        // Verify that the “Search" Box is displayed
        WebElement searchBox = driver.findElement(By.className("searchbox_input__bEGm3"));
        if (searchBox.isDisplayed()) {
            System.out.println("Search Box is visible. Return: " + searchBox.isDisplayed());
        } else {
            System.out.println("Search Box is not visible. Return: " + searchBox.isDisplayed());
        }
 
        // Verify that the “Search” Box is enabled
        if (searchBox.isEnabled()) {
            System.out.println("Search Box is enabled. Return: " + searchBox.isEnabled());
            searchBox.sendKeys("Selenium");
        } else {
            System.out.println("Search Box is not enabled. Return: " + searchBox.isEnabled());
        }
 
        System.out.println("Successful Execution of Test.");
 
        // close the web browser
        driver.close();
 
