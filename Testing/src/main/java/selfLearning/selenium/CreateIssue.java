package selfLearning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateIssue {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Launching the url

		driver.get("https://id.atlassian.com/login");

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("priyankabuvana3@gmail.com");

		WebElement continuebtn = driver.findElement(By.xpath("//span[text()='Continue']"));
		continuebtn.click();
        
		//Providing credenials
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Priya@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='login-submit']/span"));
		loginbtn.click();

	}

}
