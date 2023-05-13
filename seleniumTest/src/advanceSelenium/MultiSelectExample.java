package advanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> lis=driver.findElements(By.xpath("//*[@id=\'selectable\']/h3"));
		int sze=lis.size();	
		System.out.println(sze);
		
		Actions aact=new Actions(driver);
		aact.keyDown(Keys.CONTROL).click(lis.get(0)).click(lis.get(1)).click(lis.get(2)).click(lis.get(7)).build().perform();
		
		
	}

}
