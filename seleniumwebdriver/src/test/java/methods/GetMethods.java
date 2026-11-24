
package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        // Get page title
        System.out.println("Title: " + driver.getTitle());

        // Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Get current window handle
        System.out.println("Current Window: " + driver.getWindowHandle());

        // Click footer link
        driver.findElement(
            By.partialLinkText("OrangeHRM, Inc")
        ).click();

        Thread.sleep(3000);

        // Get all window handles
        Set<String> handles = driver.getWindowHandles();

        System.out.println("All Windows: " + handles);

        // Count windows
        System.out.println("Total Windows: " + handles.size());

//        driver.close();
        driver.quit();
    }
}
