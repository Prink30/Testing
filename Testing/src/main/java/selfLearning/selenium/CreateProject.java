package selfLearning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateProject {

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
				.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[2]/div/div/div[3]/div[2]/a[4]/button/div/div[1]/img"));
		Jirasoftware.click();
        
		//Clicking on Projects
		WebElement Projects = driver.findElement(By.xpath("//span[text()='Projects']"));
		Projects.click();

		WebElement ViewAllProjects = driver.findElement(By.xpath("//span[text()='View all projects']"));
		ViewAllProjects.click();

		// Provding Invalid Project name

		WebElement IvalidPN = driver.findElement(By.xpath("//input[@name='search']"));
		IvalidPN.sendKeys("Test");

		// Validating the text
		String text = driver.findElement(By.tagName("h4")).getText();
		System.out.println(text);

		// Providing Valid Project name
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys(Keys.ESCAPE);

		WebElement validPN = driver.findElement(By.xpath("//input[@name='search']"));
		validPN.sendKeys("SDETSelenium");

		WebElement Project = driver.findElement(By.linkText("SDETSelenium"));
		Project.click();

		// List all the issues

		List<WebElement> listofissues = driver.findElements(By.xpath("//*[@alt='Task']"));
		int numberofissues = listofissues.size();
		System.out.println("Number of issues created" + " " + numberofissues);

		// current window

		String oldwindow = driver.getWindowHandle();

		// Opening a new tab

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://priyankaganesan.atlassian.net/jira/software/projects/SDET/boards/1");

		// providing control to new tab

		Set<String> newtab = driver.getWindowHandles();

		for (String openedwindow : newtab) {
			driver.switchTo().window(openedwindow);
		}

		// click on the create button for creating the issue
		driver.findElement(By.id("createGlobalItem")).click();

		WebElement summaryField = driver.findElement(By.id("summary-field"));
		summaryField.sendKeys("Critical Issue");

		WebElement createButton = driver.findElement(By.xpath("//*[@form='issue-create.ui.modal.create-form']"));
		createButton.click();

		// going back to old window
		driver.switchTo().window(oldwindow);
		driver.navigate().refresh();

		// checking the newly created issue is present

		WebElement newissue = driver.findElement(By.xpath("//span[text()='Critical Issue']"));
		Boolean issue = newissue.isDisplayed();
		System.out.println("the bug is created" + issue);

		// click on the create button to create bug
		driver.findElement(By.id("createGlobalItem")).click();

		driver.findElement(By.id("summary-field")).sendKeys("Bug");

		driver.findElement(By.xpath("//*[@id='issuelinks-field-label']//following::div[3]")).click();
		
		driver.findElement(By.xpath("//*[text()='blocks']")).click();
		
		driver.findElement(By.xpath("//*[@form='issue-create.ui.modal.create-form']")).click();
		
		driver.findElement(By.xpath("//span[text()='Critical Issue']")).click();
		
		driver.findElement(By.xpath("//span[text()='To Do']")).click();
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		
		
		
	}

}
