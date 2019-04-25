package org.hdfcbank.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerIdTextBox {
	public static void main(String[] args) throws InterruptedException {
		//setProperty
		System.setProperty("webdriver.chrome.driver", "D:\\Madhavan\\LocationAndSendKeys\\driver\\chromedriver.exe");
		
		//launchBrowser
		WebDriver driver=new ChromeDriver();

		//openUrl
		driver.get("https://netbanking.hdfcbank.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//getTiltle
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentURL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		//find the location UserName
		WebElement txtCustId = driver.findElement(By.id("fldLoginUserId"));
		
		//insert
		//txtCustId.sendKeys("hdfcCustomer_id");
		txtCustId.sendKeys("hdfcCustomer_id");
		
		Thread.sleep(3000);
		
		//quitBrowser
		driver.quit();
	}
}
