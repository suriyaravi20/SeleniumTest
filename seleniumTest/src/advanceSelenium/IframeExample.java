package advanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("suriya");

		WebElement lastname=driver.findElement(By.name("lname"));
		lastname.sendKeys("Ravichandran");

		driver.switchTo().frame(1);
		WebElement mail=driver.findElement(By.name("email"));
		mail.sendKeys("suriya@gmail.com");
		Thread.sleep(3000);

		List<WebElement> total=driver.findElements(By.tagName("iframe"));
		int size=total.size();
		System.out.println(size);



	}

}
