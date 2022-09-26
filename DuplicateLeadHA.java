package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Launch url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter the username using id locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//eneter the password using id locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on the login button using the class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on the leads button
		driver.findElement(By.linkText("Leads")).click();
		//create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name field using the id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Archy Info");
		//enter firstname using id locator
		WebElement fnelement = driver.findElement(By.id("createLeadForm_firstName"));
		fnelement.sendKeys("Praneetha");
		//enter the lastname field using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sharath");
		//enter firstname(local) field using id locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pranee");
		//enter the department using the locator of your choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//enter the description using the locator of your choice id createLeadForm_description
		driver.findElement(By.tagName("textarea")).sendKeys("This is new..dupliate");
		//enter your email in email address field
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pranee@gg.com");
		//click on the create button
		driver.findElement(By.name("submitButton")).click();
		//click on duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//clear the companyname field using .clear() and enter the new companyname
		WebElement weCompanyname=driver.findElement(By.id("createLeadForm_companyName"));
		weCompanyname.clear();
		weCompanyname.sendKeys("Prakritha Info");
		//clear the first name field using the .clear() and enter the new firstname
		WebElement weFirstName=driver.findElement(By.id("createLeadForm_firstName"));
		weFirstName.clear();
		weFirstName.sendKeys("Prakritha");
		//click on the create lead button
		driver.findElement(By.name("submitButton")).click();
		//get the title of the resulting page
		System.out.println(driver.getTitle());
	}

}
