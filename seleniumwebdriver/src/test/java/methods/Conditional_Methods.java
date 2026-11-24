
package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("Title: " + driver.getTitle());

		// 1. isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']"));
		System.out.println("Logo Displayed: " + logo.isDisplayed());

		// 2. isEnabled()
		WebElement username = driver.findElement(By.name("username"));
		System.out.println("Username Enabled: " + username.isEnabled());

		// 3. isEnabled() for Login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Login Button Enabled: " + loginButton.isEnabled());

		driver.quit();
	}
}
