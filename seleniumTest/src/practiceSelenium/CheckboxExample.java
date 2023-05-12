package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement remember=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		if(remember.isSelected()) {
			System.out.println("already selected");
		}

		WebElement agree=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
		agree.click();

	}}
