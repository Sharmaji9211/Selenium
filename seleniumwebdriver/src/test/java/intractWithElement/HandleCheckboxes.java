package intractWithElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 Thread.sleep(8000);
		  

	        driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("Title: " + driver.getTitle());
	        
//	        1) select specific checkbox
//	       driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).click();
	       
//	        2) select all the checkboxes
	        
	        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	       
//	        for(int i=0; i<checkboxes.size();i++) {
//	        	checkboxes.get(i).click();
//	        }
	        
//	        for(WebElement checkbox : checkboxes) {
//	        	checkbox.click();
//	        }
	        
//	        select first 3 check box
	        for(int i =0;i<3;i++) {
	        	checkboxes.get(i).click();
	        }
	        
	        
	        Thread.sleep(5000);
//	        select Last 3 checkboxes 
	        
	        for(int i =5; i<checkboxes.size();i++) {
	        	checkboxes.get(i).click();
	        }

	        Thread.sleep(5000);
	        for(int i =0; i<checkboxes.size();i++) {
	        	
	        	if(checkboxes.get(i).isSelected()) {
	        		checkboxes.get(i).click();
	        	}
	        }
	        
	        
	}

}
