package TestCase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1:
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Step 2:
		driver.get("https://testleaf30-dev-ed.develop.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Step 3:
		driver.findElement(By.id("username")).sendKeys("ranjini.r@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();	
		//Step 4:
		driver.findElement(By.className("slds-icon-waffle")).click();
		//Step 5:
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		//Step 6:
		WebElement search=driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps')]"));
		search.sendKeys("Marketing",Keys.ENTER);
		//Step 7:
		driver.findElement(By.xpath("//p[@title='Best-in-class on-demand marketing automation']")).click();
		WebElement lead=driver.findElement(By.xpath("//span[text()='Leads']"));
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", lead);
	   /* List<WebElement> existingLeads = driver.findElements(By.xpath("//table[contains(@class,'forceRecordLayout')]//tbody//tr"));
		if(existingLeads.size() > 0) {
		assertTrue(driver.findElement(By.cssSelector("[title='New']")).isDisplayed());
		}*/
		//driver.findElement(By.xpath("//a[@href='/lightning/o/Lead/home']//span[1]")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		driver.findElement(By.xpath("//span[text()='Mrs.']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shilviya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jayaraj");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	//	driver.findElement(By.xpath("//a[@title='shilviya jayaraj']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//span[text()='Convert']")).click();
		WebElement opportunity=driver.findElement(By.xpath("//button[@title='TestLeaf-']"));
		js.executeScript("arguments[0].scrollIntoView();",opportunity);
		driver.findElement(By.xpath("//span[text()='Opportunity']")).click();
		WebElement opportunityName=driver.findElement(By.xpath("//span[text()='Opportunity Name']/following::input"));
		opportunityName.click();
		opportunityName.clear();
		opportunityName.sendKeys("Shilviya");
		
		//Step 13:
		driver.findElement(By.xpath("//button[contains(text(),'Convert')]")).click();
		//Step 14:
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
       //Step 15:
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='slds-input']")))).sendKeys("shilviya",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("shilviya",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='No items to display.']"))))
				.isDisplayed();
		//Step 16:
		driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.xpath("//input[@class='slds-input']"))));
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Gartner-KP", Keys.ENTER);
		} catch (Exception e) {
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Gartner-KP", Keys.ENTER);
		}

		driver.findElement(By.xpath("//span[text()='Opportunity Name']/following::a[contains(text(),'shilviya')]"));
       //Step 17:
		driver.findElement(By.xpath("//span[text()='Opportunity Name']/following::a[contains(text(),'shilviya')]")).click();

		driver.findElement(By.xpath("//div[text()='Opportunity']/following::lightning-formatted-text[text()='shilviya']")).isDisplayed();

	}

}
