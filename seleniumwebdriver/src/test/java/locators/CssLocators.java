
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        // Tag ID Selectors
//        driver.findElement(By.cssSelector("#login2")).click();
//        driver.findElement(By.cssSelector("#login2")).click();
//
//        // Tag Class
//        driver.findElement(By.cssSelector("a.nav-link")).click();
     
//        driver.findElement(By.cssSelector(".nav-link")).click();
//
//        // Tag Attribute
//        driver.findElement(By.cssSelector("a[data-target='#logInModal']")).click();
//        driver.findElement(By.cssSelector("[data-target='#logInModal']")).click();
//
//        // Tag Class Attribute
//        driver.findElement(By.cssSelector("a.nav-link[data-target='#logInModal']")).click();


    }
}
