import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver","C:/Users/Ramesh Potekar/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Pranita");
		driver.findElement(By.id("alertbtn")).click();
		//getText alert
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		String[] listName = alertText.split(" ");
		System.out.println("Alert Text -"+ (listName[1].split(","))[0]);
		//accept alert
		driver.switchTo().alert().accept();
		//cancel alert
		driver.findElement(By.id("name")).sendKeys("Pranita");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}

}
