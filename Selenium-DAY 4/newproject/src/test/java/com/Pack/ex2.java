package com.Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ex2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Agalya");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("T");
		WebElement mail=driver.findElement(By.id("input-email"));
		mail.sendKeys("727721eucs007@skcet.ac.in");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("Agalya@2004");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		WebElement yesbutton=driver.findElement(By.id("input-newsletter-yes"));
		yesbutton.click();
	}

}