package advanceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String oldWindow=driver.getWindowHandle();
		WebElement btn1=driver.findElement(By.id("home"));
		btn1.click();


		Set<String> handles=driver.getWindowHandles();

		for(String whandle:handles) {
			driver.switchTo().window(whandle);
		}

		WebElement lin=driver.findElement(By.linkText("Edit"));
		lin.click();

		driver.close();
		driver.switchTo().window(oldWindow);

		WebElement multi=driver.findElement(By.id("multi"));
		multi.click();

		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println(numberOfWindows);

		Set<String> newWindow=driver.getWindowHandles();
		for(String allwin:newWindow)
		{
			if(!allwin.equals(oldWindow)) {
				driver.switchTo().window(allwin);			
				driver.close();
			}
		driver.quit();
		}
	}

}
