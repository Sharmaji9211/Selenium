
package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BootstrapDropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://qapracticehub.com/#selection");

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(5)
        );

        // Open dropdown
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[@id='frameworks-multi-select-value']")
        )).click();

        // Select Playwright
        WebElement playwright = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//label[@id='framework-playwright']")
            )
        );
        playwright.click();

        // Select Selenium
        WebElement selenium = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("//label[@id='framework-selenium']")
            )
        );
        selenium.click();

        System.out.println("Options selected successfully!");

    }
}
