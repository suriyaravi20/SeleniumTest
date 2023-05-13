package testSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLetCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement edit=driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement firstN=driver.findElement(By.xpath("//input[@id=\"fullName\"]"));
		firstN.sendKeys("Suriya");
		
		WebElement appe=driver.findElement(By.id("join"));
		appe.sendKeys("All okay!");
		
		WebElement insideBox=driver.findElement(By.id("getMe"));
		String boxinside=insideBox.getAttribute("value");
		System.out.println(boxinside);
		
		
		
		
		WebElement Textclear=driver.findElement(By.id("clearMe"));
		String read=Textclear.getAttribute("value");
		System.out.println(read);
		
		Textclear.clear();
		
		WebElement btndis=driver.findElement(By.id("noEdit"));
		boolean checkbtn=btndis.isEnabled();
		System.out.println(checkbtn);
		
		WebElement dnt=driver.findElement(By.id("dontwrite"));
		String readonly=dnt.getAttribute("readonly");
		System.out.println(readonly);
		
		//--------------------------------------------------------------//
		
		driver.navigate().to("https://letcode.in/buttons");
		
		WebElement posi=driver.findElement(By.id("position"));
		Point location=posi.getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println("the position of the x" +x +" and y" +y);
		
		WebElement colour=driver.findElement(By.id("color"));
		String color=colour.getCssValue("background-color");
		System.out.println(color);
		
		WebElement h=driver.findElement(By.id("property"));
		int height=h.getSize().getHeight();
		System.out.println(height);
		int Width=h.getSize().getWidth();
		System.out.println(Width);
		
		WebElement btndis1=driver.findElement(By.id("isDisabled"));
		boolean disabled=btndis1.isEnabled();
		System.out.println(disabled);
		
		WebElement candh=driver.findElement(By.id("isDisabled"));
		candh.click();
		
		Thread.sleep(3000);
		
		//--------------------------------------------------------------//
		
		driver.navigate().to("https://letcode.in/dropdowns");
		
	
		WebElement fruits=driver.findElement(By.id("fruits"));
		Select sel= new Select(fruits);
		sel.selectByVisibleText("Orange");
		
		sel.selectByIndex(1);
		
		sel.selectByValue("4");
		
		WebElement heros=driver.findElement(By.id("superheros"));
		Select sel1=new Select(heros);
		sel1.selectByIndex(0);
		sel1.selectByIndex(1);
		sel1.selectByIndex(4);
		
		WebElement sall=driver.findElement(By.id("lang"));
		//sall.sendKeys("Python");
		Select sel2=new Select(sall);
		List<WebElement> suball=sel2.getOptions();
		for(WebElement alll:suball) {
			System.out.println(alll.getText());
		}
		int tot=suball.size();
		System.out.println(tot);
		Thread.sleep(3000);

		
		//----------------------------------------------------
		driver.navigate().to("https://letcode.in/alert");
		
		WebElement aclick=driver.findElement(By.id("accept"));
		aclick.click();
		Alert alr=driver.switchTo().alert();
		alr.accept();
		
		Thread.sleep(3000);

		WebElement confirm=driver.findElement(By.id("confirm"));
		confirm.click();
		Alert alr1=driver.switchTo().alert();
		alr1.accept();
		Thread.sleep(3000);
		
		WebElement prm=driver.findElement(By.id("prompt"));
		prm.click();
		
		Alert alr2=driver.switchTo().alert();
		alr2.sendKeys("Suriya");
		alr2.accept();
		
		
		
		
		
		
		
	}

}
