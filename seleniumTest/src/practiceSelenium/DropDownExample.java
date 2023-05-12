package practiceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//select by value,index,text
		WebElement fruit=driver.findElement(By.id("fruits"));
		Select select=new Select(fruit);
		select.selectByValue("3");	
		select.selectByVisibleText("Orange");
		select.selectByIndex(1);

		//print all values in dropdown...........................	
		WebElement total=driver.findElement(By.id("lang"));
		Select select1=new Select(total);
		List<WebElement> li=select1.getOptions();
		int num=li.size();
		System.out.println(num);

		//select the dropdown using sendkeys and multi value....................
		WebElement hero=driver.findElement(By.id("superheros"));
		//		hero.sendKeys("Batwoman");
		Select multiselect=new Select(hero);
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);
		multiselect.selectByIndex(6);






	}

}
