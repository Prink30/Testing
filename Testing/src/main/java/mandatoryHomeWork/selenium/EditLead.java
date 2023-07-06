package SDETSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
        
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username =  driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement password =  driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement login1 =  driver.findElement(By.className("decorativeSubmit"));
		login1.click();
		

		WebElement crmsfa =  driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		
		WebElement companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyname.sendKeys("cts");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Priyanka");
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Ganesan");
		
		WebElement fnlocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnlocal.sendKeys("Riya");
		
		WebElement Dept = driver.findElement(By.id("createLeadForm_departmentName"));
		Dept.sendKeys("Dev");
		
		WebElement Desc = driver.findElement(By.id("createLeadForm_description"));
		Desc.sendKeys("test");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("priyankabuvan3@gmail.com");
		
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		
		WebElement createleadbtn = driver.findElement(By.className("smallSubmit"));
		createleadbtn.click();
		
		WebElement edit =  driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement Desc2 = driver.findElement(By.id("updateLeadForm_description"));
		Desc2.clear();
		
		WebElement impnote = driver.findElement(By.id("updateLeadForm_importantNote"));
		impnote.sendKeys("abc");
		
		WebElement update = driver.findElement(By.className("smallSubmit"));
		update.click();
		
		System.out.println(driver.getTitle());
		

	}

}
