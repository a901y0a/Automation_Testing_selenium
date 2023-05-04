package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/Airdopes-141-Bluetooth-Wireless-Playtime/dp/B09N3ZLB3T/ref=lp_80947931031_1_3?sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&th=1");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String webtitle = "boAt Airdopes 141 Bluetooth Truly Wireless in Ear Earbuds with 42H Playtime, Beast Mode(Low Latency Upto 80ms) for Gaming, ENx Tech, IWP, IPX4 Water Resistance, Smooth Touch Controls(Pure White)";
        System.out.println(title);
        if(title.equals(webtitle)) {
        	System.out.println("The title matches with the webTitle");
        }
        else {
        	System.out.println("The title matches with the WebTitle");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String remove = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String emptext = "Your Amazon Cart is empty.";
        if(remove.equals(emptext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/Airdopes-141-Bluetooth-Wireless-Playtime/dp/B09N3ZLB3T/ref=lp_80947931031_1_3?sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&th=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon.in";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failure");
        }
    }
}