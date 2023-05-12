package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement unchecked=driver.findElement(By.id("foo"));
		WebElement checked=driver.findElement(By.id("notfoo"));
		boolean unc=unchecked.isSelected();
		System.out.println(unc);
		boolean ch=checked.isSelected();
		System.out.println(ch);
		
		WebElement check=driver.findElement(By.id("maybe"));
		boolean cc=check.isEnabled();
		System.out.println(cc);

	}

}
