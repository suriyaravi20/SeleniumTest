package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement position=driver.findElement(By.id("position"));

//to find the location of the x and y of button using POINT Class
		Point xypoint=position.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("x value "+xvalue +" and "+" y value " +yvalue);

//to get button Background color
		WebElement btnColour=driver.findElement(By.id("color"));
		String colour=btnColour.getCssValue("background-color");
		System.out.println(colour);

//to get height and width		
		WebElement size=driver.findElement(By.id("property"));
		int h=size.getSize().getHeight();
		int w=size.getSize().getWidth();
		System.out.println("height "+h +" width " +w);

		WebElement home=driver.findElement(By.id("home"));
		home.click();
	}

}
