import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jeetesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/form/div[4]/div/label[2]/span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement dropDownValue=driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(dropDownValue);
		s.selectByIndex(0);
		driver.findElement(By.id("signInBtn")).click();
		List<WebElement> Items=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<Items.size();i++)
		{
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
	}

}
