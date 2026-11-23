package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // XPath with single attribute
        driver.findElement(By.xpath("//*[@id='login2']")).click();

        // Wait for login popup to load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // XPath with multiple attributes
        driver.findElement(
            By.xpath("//*[@id='loginusername'][@type='text']")
        ).sendKeys("Shivam");

        // Enter password
        driver.findElement(By.xpath("//*[@id='loginpassword']")).sendKeys("12345");

        // Click login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        
    }
}
