import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeetesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] productName=products.get(i).getText().split("-");
			String ActualProductName=productName[0].trim();
			//convert array into array list for easy search
			//check whether name you extracted is present in arraylist or not
			List<String> ItemNeededList= Arrays.asList(itemsNeeded);
			
			if(ItemNeededList.contains(ActualProductName))
			{
			 j++; 
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemsNeeded.length)
				break;
			}
			/*if(productName.contains("Cucumber"))
			{
			    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			    break;
			}*/
			
		}
	}

}
