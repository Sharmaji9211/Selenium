package intractWithElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		
//		Thread.sleep(5000);
		
//		1) Normal Alert with Ok button 
		
//		driver.switchTo().alert().accept();
		
//		Alert myalert= driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
//		
		
//		2) Confirmation Alert -Ok @ cancel
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		
//		Thread.sleep(5000);
//		
//		Alert myalert= driver.switchTo().alert();
//		System.out.println(myalert.getText());
////		myalert.accept();
//		myalert.dismiss();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
		
	}

}
