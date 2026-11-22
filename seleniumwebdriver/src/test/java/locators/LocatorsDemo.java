package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		//Name locator
//      	driver.findElement(By.name("search")).sendKeys("Mac");
//		 boolean logoDisplay =driver.findElement(By.id("contcar")).isDisplayed();
//		 System.out.println(logoDisplay);
		
//		driver.findElement(By.linkText("Laptops")).click();
//		List<WebElement> headerslinks = driver.findElements(By.className("nav-item"));
//		System.err.println("Total Elements : "+headerslinks.size());
//		List<WebElement> links= driver.findElements(By.tagName("a"));?
//		System.out.println("Total Links on werbpages "+links.size());
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Total imgaes on werbpages "+img.size());
		
	}

}
