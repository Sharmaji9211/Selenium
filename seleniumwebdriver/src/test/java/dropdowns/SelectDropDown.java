package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
	        driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("Title: " + driver.getTitle());
	        
	        
	       WebElement drpCountryEle =  driver.findElement(By.xpath("//select[@id='country']"));
	       Select drpCountry= new Select(drpCountryEle);
	       
	       //Select option from the select drop down
	       
//	       drpCountry.selectByVisibleText("India");
//	       drpCountry.selectByValue("india");
//	       drpCountry.selectByIndex(3);
	       
	       
//	       Capture the options from the dropdown
	       
	       List<WebElement> options =drpCountry.getOptions();
	       System.out.println("Total number of options "+options.size());
	       
	       for(int i=0;i<options.size();i++) {
	    	   System.out.println(options.get(i).getText());
	       }
	       
	  }

}
