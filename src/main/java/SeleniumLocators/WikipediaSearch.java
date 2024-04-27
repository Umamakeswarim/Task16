package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/gokulakkannanm/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Wikipedia
        driver.get("https://www.wikipedia.org/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Find the search input field and enter the search query
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Artificial Intelligence");

        // Find and click the search button
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        // Wait for the search results to load
        try {
            Thread.sleep(2000); // Wait for 2 seconds for demonstration purposes, you can use explicit waits for better handling
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find and click on the "History" section link in the search results
        WebElement historySectionLink = driver.findElement(By.xpath("//span[text()='History']"));
        historySectionLink.click();

        // Get the title of the history section
        String historySectionTitle = driver.getTitle();
        System.out.println("Title of the History Section: " + historySectionTitle);

        // Close the browser
        driver.quit();
    }
}

