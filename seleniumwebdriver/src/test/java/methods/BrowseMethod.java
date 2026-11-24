package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(
                By.partialLinkText("OrangeHRM, Inc")
            ).click();
        Thread.sleep(3000);
        
        driver.close();
//        driver.quit();
	}

}
