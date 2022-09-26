package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week1.day2.Chrome;

public class EditLeadHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup the path for ChromeDriver in WDM
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load Browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		//id username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//id password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//class decorativeSubmit
		driver.findElement(By.className("decorativeSubmit")).click();
		//a linktext CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.tagName("a").linkText("Create Lead")).click();
		//Enter CompanyName FIeld using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Praganya Tech");
		//Enter firstname using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeep");
		//Enter Lastname(Local) field using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		//Enter Department field using locator of your choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		//Enter Description field using locator of your choicecreate button
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Great Start with Selenium-Java");
		//enter your email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pravee.jk@hj.com");
		//click on create button
		driver.findElement(By.name("submitButton")).click();
		//click on edit button
		driver.findElement(By.linkText("Edit")).click();
		//clear the description field using the clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill the ImportantNote field with any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("New Update: This is a new start!");
		//click on update button
		driver.findElement(By.name("submitButton")).click();

		//Title
		String title = driver.getTitle();
		System.out.println(title);
	}

}
