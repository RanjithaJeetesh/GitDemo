import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Invoking the Browser
		//chrome browser-->chromeDriver-->methods: close and get
		//firefox browser-->firefoxDriver-->methods: close and get
		//Safari-->saariDriver-->methods: close and get
		//WebDriver Interface-->Methods: close and get
		//chromedriver.exe-->to invoke chrome browser
		//steps to invoke the chrome driver
		//selenium Manager
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeetesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//firefox launch
		//geckodriver
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "/C:/Users/Jeetesh/Downloads/geckodriver-v0.33.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge browser launch
		System.setProperty("webdriver.edge.driver", "/C:/Users/Jeetesh/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}
