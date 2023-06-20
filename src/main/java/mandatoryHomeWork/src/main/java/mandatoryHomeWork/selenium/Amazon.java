package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		
		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
		String amount=driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println(amount);
		
		WebElement rating=driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]/span[2]"));
		System.out.println(rating);
	}
}
