package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement alertbox=driver.findElement(By.xpath("//*[@id='accept']"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		

		WebElement confirmbtn=driver.findElement(By.id("confirm"));
		confirmbtn.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		

		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("suriya");
		Thread.sleep(3000);
		alert2.accept();
	}

}
