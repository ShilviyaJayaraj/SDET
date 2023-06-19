package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateJira {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://sivasdetteam3.atlassian.net/jira/your-work");
        
        driver.findElement(By.id("username")).sendKeys("shilviyajayaraj86@gmail.com");
        driver.findElement(By.className("css-178ag6o")).click();
        driver.findElement(By.id("password")).sendKeys("Shilviya@123");
        driver.findElement(By.id("login-submit")).click();
	}

}
