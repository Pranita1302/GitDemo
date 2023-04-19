import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VegetableClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users/Ramesh Potekar/Downloads/chromedrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] itemsNeeded= {"Brocolli","Cucumber","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		addItems(driver,itemsNeeded);
		}

	public static  void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		List<WebElement>
		productsList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		for(int i=0;i<productsList.size();i++)
		{
			String[] name = productsList.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
	
			
		}
		
		
	}
	
}
