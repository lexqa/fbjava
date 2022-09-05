package core;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Name1 {

	static WebDriver driver;

	public static void main(String[] cla) throws InterruptedException {
		
		Logger.getLogger("").setLevel(Level.OFF);
		
		System.out.println("Browser: Chrome");

		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/chromedriver");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // Chrome
		ChromeOptions option = new ChromeOptions();                  // Chrome
		option.addArguments("disable-infobars");                     // Chrome
		option.addArguments("--disable-notifications");              // Chrome

		driver = new ChromeDriver(option);

		driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		System.out.println("Title: " + driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("afc_max@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(System.getenv("pass")); 
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/a/div[1]/div[2]/span")).click();
		Thread.sleep(3000);
		String friends = driver.findElement(By.className("qi72231t")).getText();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
		driver.quit();
		System.out.println("You have " + friends + " friends");
	}
}
