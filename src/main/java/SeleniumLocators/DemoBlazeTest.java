package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeTest {
    public static void main(String[] args) {
        // Set path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/gokulakkannanm/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.demoblaze.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Verify if the title of the page is "STORE"
        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close the browser
        driver.quit();
        
        
       
    }
}
