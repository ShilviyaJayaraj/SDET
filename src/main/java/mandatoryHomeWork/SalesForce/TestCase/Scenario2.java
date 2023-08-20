package TestCase;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://google-bf-dev-ed.develop.my.salesforce.com/");

		driver.findElement(By.id("username")).sendKeys("ranjini.r@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
        driver.findElement(By.className("slds-r5")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//input[@part='input']")).sendKeys("Service");
        driver.findElement(By.xpath("//mark[text()='Service']")).click();
	}
}
