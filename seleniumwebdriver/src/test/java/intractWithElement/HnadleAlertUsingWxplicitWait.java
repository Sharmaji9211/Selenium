package intractWithElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HnadleAlertUsingWxplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        // Click on JS Confirm button
        driver.findElement(
            By.xpath("//button[normalize-space()='Click for JS Confirm']")
        ).click();

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        // Wait until alert is present
        Alert myalert = wait.until(
            ExpectedConditions.alertIsPresent()
        );

        // Get alert text
        System.out.println(myalert.getText());

        // Click Cancel button
        myalert.dismiss();

        driver.quit();
    }
}

