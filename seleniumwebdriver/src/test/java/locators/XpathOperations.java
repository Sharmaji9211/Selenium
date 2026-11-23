
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOperations  {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        // Click Phones category using XPath
        driver.findElement(
            By.xpath("//a[text()='Phones']")
        ).click();

        Thread.sleep(2000);

        System.out.println("Phones category clicked successfully");
        System.out.println(driver.getTitle());

    }
}
