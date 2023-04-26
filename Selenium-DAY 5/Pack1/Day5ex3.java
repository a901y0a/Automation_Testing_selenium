package com.Pack1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		WebElement txt_box=driver.findElement(By.name("cusid"));
		WebElement submit_btn=driver.findElement(By.name("submit"));
	    txt_box.sendKeys("401");
	    submit_btn.click();
	    Alert alert1=driver.switchTo().alert();
	    alert1.dismiss();
	    txt_box.clear();
	    txt_box.sendKeys("402");
	    submit_btn.click();
	    Alert alert2=driver.switchTo().alert();
	    alert2.accept();
	    Alert alert3=driver.switchTo().alert();
	    String txt=alert3.getText();
	    alert2.accept();
	    
}
}
