package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set path to geckodriver if it's not in your system PATH
        System.setProperty("webdriver.gecko.driver", "/Users/gokulakkannanm/Downloads/geckodriver/geckodriver");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to "http://google.com"
        driver.get("http://google.com");

        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
