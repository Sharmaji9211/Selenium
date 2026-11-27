package dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlehiddenDropDown {

	public static void main(String[] args) {
		

		   WebDriver driver = new ChromeDriver();
		   
		   WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
	       
		   driver.manage().window().maximize();

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        System.out.println("Title: " + driver.getTitle());
	        
	        WebElement txtusername = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
	        txtusername.sendKeys("Admin");
	        
	        WebElement password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	        password.sendKeys("admin123");
	        
	        WebElement loginbtn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
	        loginbtn.click();
	        
	        
	        WebElement PIM = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")));
	        PIM.click();
	        

	     // Click Job Title dropdown
	     WebElement jobTitle = myWait.until(
	         ExpectedConditions.elementToBeClickable(
	             By.xpath("")
	         )
	     );
	     jobTitle.click();

	     // Find all dropdown options
	     List<WebElement> options = myWait.until(
	         ExpectedConditions.visibilityOfAllElementsLocatedBy(
	             By.xpath("//div[@role='listbox']//div[@role='option']")
	         )
	     );

	     // Print total elements
	     System.out.println("Total Job Titles: " + options.size());

	     // Print each option
	     System.out.println("----- Available Job Titles -----");

	     for (WebElement option : options) {
	         System.out.println(option.getText());
	     }


	}

}
