package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//Loading the Nykaa URL 
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Mouseover on Brands and Search L'Oreal Paris
		
		WebElement brands =driver.findElement(By.xpath("//a[text()='brands']"));
		
		
		 Actions action = new Actions(driver); 
		 action.moveToElement(brands).build().perform();
		 
		 WebElement searchbox =driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
		 searchbox.sendKeys("L'Oreal Paris");
		 
		// driver.findElement(By.xpath("(//div[@class='css-150nd8c']/a)[1]")).click();
		 
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Boolean ab = title.contains("L'Oreal Paris");
		
		Assert.assertTrue(ab);
		
		System.out.println("title contains loreal paris");
		 
		 WebElement sortby =driver.findElement(By.xpath("//span[@class='sort-name']"));
		 sortby.click();
		 
		 
		 driver.findElement(By.xpath("//ul[@class='css-z5o5ca']/div[4]")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Category']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//span[text()='Hair']")).click();
		 
		 driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		 
		 driver.findElement(By.xpath("//ul[@class='scroll css-1e7z8zv']/li/div[1]")).click();
		 
		 String filterapplied = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		 System.out.println(filterapplied);
		 Assert.assertEquals(filterapplied, "Shampoo");	
		 
		 driver.findElement(By.xpath("//div[contains(text(),'Colour Protect')]")).click();
		 
		 String oldwindow = driver.getWindowHandle();
			
			Set<String> newwindow = driver.getWindowHandles();
			
			for (String allwindows : newwindow) {
				driver.switchTo().window(allwindows);
			}
			
			driver.findElement(By.xpath("//span[text()='180ml']")).click();
		  
		 String MRP = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		 System.out.println(MRP);
		 
		 driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		 
		 driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		 
		//driver.switchTo().frame(1);
		 
		 driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		 
			
			


      
			
		

//			
			driver.quit();
		
	}

}
