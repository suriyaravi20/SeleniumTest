package advanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompletionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement name=driver.findElement(By.name("username"));
		name.sendKeys("suriyaravi20");
		WebElement search=driver.findElement(By.id("search"));
		search.click();

		List<WebElement> gitlis= driver.findElements(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-gitrepos/div/div/ol/li"));

		int tot=gitlis.size();
		System.out.println(tot);

		for (WebElement webElement : gitlis) {
			if(webElement.getText().equals("https://github.com/suriyaravi20/SeleniumTest"))
			{webElement.click();
			System.out.println("selected"+webElement.getText());
			break;

			}

		}
		// This is another method	
		//		Actions act=new Actions(driver);
		//		act.keyDown(Keys.CONTROL).click(gitlis.get(3)).click().build().perform();
	}

}
