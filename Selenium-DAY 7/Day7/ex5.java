package com.Day7;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex5 {
	static EdgeDriver driver;
  @Test
  public void Task1() {
	  WebDriverManager.chromedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		 driver = new EdgeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.godaddy.com/en-in");
		Assert.assertEquals(title,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		//driver.close();
  }
  @Test
  public void Task2() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
  }
}