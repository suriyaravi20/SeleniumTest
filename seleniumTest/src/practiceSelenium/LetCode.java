package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Edit")).click();

		WebElement firstName=driver.findElement(By.id("fullName"));
		firstName.sendKeys("Suriya");

//to append the value inside the textbox		
		WebElement append=driver.findElement(By.id("join"));
		append.sendKeys("how are you");

//to get the value in textbox		
		WebElement printText=driver.findElement(By.id("getMe"));
		String value=printText.getAttribute("value");
		System.out.println(value);

//to clear the value in textbox		
		WebElement clearBox=driver.findElement(By.id("clearMe"));
		clearBox.clear();

//to find the status of the disabled textbox
		WebElement disabledBox=driver.findElement(By.id("noEdit"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);



	}

}
