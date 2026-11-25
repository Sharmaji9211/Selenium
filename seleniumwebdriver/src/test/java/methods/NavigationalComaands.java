package methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalComaands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		driver.navigate().to(myurl);
		
		driver.navigate().to("https://www.demoblaze.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		 
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
	}

}
