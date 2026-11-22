
package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {

        // 1. Launch browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get("https://demo.opencart.com/");

        // 3. Get actual page title
        String title = driver.getTitle();

        System.out.println("Actual Title: " + title);

        // 4. Validate title
        if (title.equals("Your Store")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // 5. Close browser
        //driver.quit();
    }
}
