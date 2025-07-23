package orangeHRM_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM_Module {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement uname= driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("Admin");
		Thread.sleep(4000);
		WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		Thread.sleep(4000);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(4000);	
		// Pim click
		WebElement pim= driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
		pim.click();
		Thread.sleep(4000);
		//Employee Lists
		WebElement ename1= driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]"));
		ename1.sendKeys("Sa");
		Thread.sleep(4000);
		Actions ac1= new Actions(driver);
		ac1.moveToElement(ename1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);		
		WebElement supname= driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[2]"));
		supname.sendKeys("ss");
		Thread.sleep(4000);
		Actions ac2= new Actions(driver);
		ac2.moveToElement(supname).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		WebElement empid= driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
		empid.sendKeys("123");
		Thread.sleep(4000);
		WebElement jobtitle= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[3]"));
		jobtitle.click();
		Thread.sleep(4000);
		Actions ac3= new Actions(driver);
		ac3.moveToElement(jobtitle).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		WebElement empstatus= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		empstatus.click();
		Thread.sleep(4000);
		Actions ac4= new Actions(driver);
		ac4.moveToElement(empstatus).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
	
		WebElement subunit= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[4]"));
		subunit.click();
		Thread.sleep(4000);
		Actions ac5= new Actions(driver);
		ac5.moveToElement(subunit).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		WebElement include= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]"));
		include.click();
		Thread.sleep(4000);
		Actions ac6= new Actions(driver);
		ac6.moveToElement(include).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		
		WebElement search= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		search.click();
		Thread.sleep(5000);
	
		// Add Employee
		WebElement pim_addemp= driver.findElement(By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[2]"));
		pim_addemp.click();
		Thread.sleep(4000);
		
		WebElement pim_fname= driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		pim_fname.sendKeys("Sayantan");
		Thread.sleep(4000);
		
		WebElement pim_mname= driver.findElement(By.xpath("//input[@name=\"middleName\"]"));
		pim_mname.sendKeys("----");
		Thread.sleep(4000);
		
		WebElement pim_lname= driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		pim_lname.sendKeys("Das");
		Thread.sleep(4000);
		
		// Create login details
		WebElement toggle= driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"));
		toggle.click();
		Thread.sleep(4000);
		
		WebElement create_uname= driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]"));
		create_uname.sendKeys("singha");
		Thread.sleep(4000);
		
		WebElement create_pass=driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		create_pass.sendKeys("@Darkknight353");
		Thread.sleep(4000);
		
		WebElement create_cpass=driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		create_cpass.sendKeys("@Darkknight353");
		Thread.sleep(4000);
		
		WebElement saving= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		saving.click();
		Thread.sleep(4000);
		
		driver.quit();
	}
}
