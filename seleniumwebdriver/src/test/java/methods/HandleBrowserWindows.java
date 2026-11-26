package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		 Thread.sleep(5000);
	        driver.findElement(
	                By.partialLinkText("OrangeHRM, Inc")
	        		).click();
		
//	       Approach 1 
          Set<String> windowsId = driver.getWindowHandles();
//		
//		List<String> windowsList= new ArrayList(windowsId);
//		
//		String parentId = windowsList.get(0);
//		String childId = windowsList.get(1);
//		
//		driver.switchTo().window(childId);
//		System.out.println(driver.getTitle());
//		
//	        Approcah 2 
          
	     for(String winId: windowsId) {
	    	 String title = driver.switchTo().window(winId).getTitle();
	    	 if(title.equals("OrangeHRM")) {
	    		 System.out.println(driver.getCurrentUrl());
	    	 }
	    	 
	     }
	        
	}

}
