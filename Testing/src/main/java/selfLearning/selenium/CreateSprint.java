package selfLearning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateSprint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		WebElement Jirasoftware = driver.findElement(By
				.xpath("(//div[text()='priyankaganesan'])[2]"));
		Jirasoftware.click();
		
		
		String text = driver.findElement(By.xpath("//h4[@class='css-9f2ouj']")).getText();
		System.out.println(text);
		
		Boolean Projectbtn =  driver.findElement(By.xpath("//span[text()='Create project']")).isEnabled();
		System.out.println("the button is enabled" + Projectbtn );
		
		driver.findElement(By.xpath("//span[text()='Create project']")).click();
		
		driver.findElement(By.xpath("(//button[@class='wnufxe-0 dZByDR'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Use template'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Select a company-managed project']")).click();
		
		driver.findElement(By.xpath("//input[@id='project-create.create-form.name-field.input']")).sendKeys("Sample");
		
		Thread.sleep(3000);
		
		String key = driver.findElement(By.xpath("//input[@id='project-create.create-form.advanced-dropdown.key-field.input']")).getText();
		
		System.out.println(key);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//span[text()='Go to project']")).click();
		
        String Todo = driver.findElement(By.xpath("//ul[@id='ghx-column-headers']/li[1]")).getText();
		
		System.out.println(Todo);
		
        String Inprogress = driver.findElement(By.xpath("//ul[@id='ghx-column-headers']/li[2]")).getText();
		
		System.out.println(Inprogress);
		
        String Done = driver.findElement(By.xpath("//ul[@id='ghx-column-headers']/li[3]")).getText();
		
		System.out.println(Done);
		
	   Boolean star	= driver.findElement(By.xpath("//div[@id='ghx-header-dynamic-append-zone']/button/span")).isSelected();
	
	   System.out.println("starred" + " " + star);
	   
	   driver.findElement(By.xpath("//span[text()='Backlog']")).click();
	   
	   driver.findElement(By.xpath("//span[text()='Add dates']")).click();
	   
	   Select custom = new Select(driver.findElement(By.xpath("//select[@id='ghx-sprint-duration']")));
	   
	   custom.selectByVisibleText("2 weeks");
	   
	   driver.findElement(By.xpath("//input[@id='ghx-sprint-start-date']")).sendKeys("7/Mar/23 12:00 AM");
	   
	   driver.findElement(By.xpath("//input[@id='ghx-sprint-end-date']")).sendKeys("8/Jul/23 12:00 AM");
	   
	   driver.findElement(By.xpath("//button[text()='Update']")).click();
	   
	  Boolean sprint = driver.findElement(By.xpath("//button[text()='Create sprint']")).isEnabled();
		System.out.println(sprint);
		
		
		
		
		
		
	}

}
