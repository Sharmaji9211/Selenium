package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows :"+rows);
		
		int coloum = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of rows :"+coloum);

		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		System.out.println(data);
		
//		for(int i=2;i<=rows;i++) {
//			for(int j=1;j<=coloum;j++) {
//			System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText());
//			}
//		}
		
		for(int r=2;r<rows;r++) {
			
		String autorname=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
		if(autorname.equals("Mukesh")) {
			String  bookname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			System.out.println(bookname+"\t"+autorname);
		}
			
			
			
		}
		
		
	}

}
