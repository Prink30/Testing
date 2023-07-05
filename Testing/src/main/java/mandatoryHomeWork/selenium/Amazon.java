package mandatoryHomeWork.selenium;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.io.FileHandler;



public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//Loading the Amazon URL 
		
		driver.get("https://www.amazon.in/");
        
		driver.manage().window().maximize();
		
		

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//searching as oneplus 9 pro
		
		WebElement c = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		c.click();
		c.sendKeys("oneplus 9 pro" + Keys.ENTER);
		
		//Getting the price of the first product
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String product = price.getText();
		System.out.println("Price of the first product is" + " " + product);
		
		//Print the number of customer ratings for the first displayed product
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[2]/div/span[1]/span/a/i[2]")).click();
		
		WebElement rating = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']"));
        String customerrating = rating.getText();
		System.out.println("Customer review is" + " " + customerrating);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		String oldwindow = driver.getWindowHandle();
		
		Set<String> newwindow = driver.getWindowHandles();
		
		for (String allwindows : newwindow) {
			driver.switchTo().window(allwindows);
		}
		
		//Taking screenshot
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination  = new File ("D://sample.png");
		
		FileHandler.copy(source, destination);
		
		//Add to cart button
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//Get the cart subtotal and verifying if it is correct
		
		Thread.sleep(3000);
		
		String cartsubtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		
		System.out.println(cartsubtotal);
		
		Assert.assertEquals(price, cartsubtotal);
		
		
		
		
	     
		
		}
	}


