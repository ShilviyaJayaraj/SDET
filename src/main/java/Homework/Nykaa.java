package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException{
		 
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://www.nykaa.com/");
		 

	}

}
