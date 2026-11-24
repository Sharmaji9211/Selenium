
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

        System.out.println(driver.getTitle());

        // 1. Self Axis
        WebElement self = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/self::a")
        );
        System.out.println("Self: " + self.getText());

        // 2. Parent Axis
        WebElement parent = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/parent::td")
        );
        System.out.println("Parent: " + parent.getText());

        // 3. Child Axis
        WebElement child = driver.findElement(
            By.xpath("//table[@class='dataTable']/tbody/child::tr[1]")
        );
        System.out.println("Child: " + child.getText());

        // 4. Ancestor Axis
        WebElement ancestor = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/ancestor::tr")
        );
        System.out.println("Ancestor: " + ancestor.getText());

        // 5. Descendant Axis
        WebElement descendant = driver.findElement(
            By.xpath("//table[@class='dataTable']/descendant::a")
        );
        System.out.println("Descendant: " + descendant.getText());

        // 6. Following Axis
        WebElement following = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/following::td[1]")
        );
        System.out.println("Following: " + following.getText());

        // 7. Preceding Axis
        WebElement preceding = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/preceding::td[1]")
        );
        System.out.println("Preceding: " + preceding.getText());

        // 8. Following-sibling Axis
        WebElement followingSibling = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/ancestor::tr/following-sibling::tr[1]")
        );
        System.out.println("Following Sibling: " + followingSibling.getText());

        // 9. Preceding-sibling Axis
        WebElement precedingSibling = driver.findElement(
            By.xpath("//a[contains(text(),'PB Fintech')]/ancestor::tr/preceding-sibling::tr[1]")
        );
        System.out.println("Preceding Sibling: " + precedingSibling.getText());

        
    }
}
