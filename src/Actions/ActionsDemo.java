package Actions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeetesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[text()='Your Account']")).click();
		WebElement ele=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.contextClick(ele).build().perform();
		
		//remove later
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.contextClick(ele).build().perform();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//newly added
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
	    WebElement dateOfBirth=	driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
	    WebElement iceCreamLabel= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
	    WebElement radioButton =driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
	}

}
