package orangeHRM_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leave_Module {
	
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
		// Go to Leave Module
		WebElement leave= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]"));
		leave.click();
		Thread.sleep(4000);
		WebElement from= driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[1]"));
		from.click();
		Thread.sleep(4000);
		WebElement from_date = driver.findElement(By.xpath("//div[contains(@class,'oxd-calendar-date') and text()='10']"));
		from_date.click();
		Thread.sleep(4000);
		WebElement to= driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[2]"));
		to.click();
		Thread.sleep(4000);
		WebElement to_date = driver.findElement(By.xpath("//div[contains(@class,'oxd-calendar-date') and text()='25']"));
		to_date.click();
		Thread.sleep(4000);
		WebElement show_leave= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		show_leave.click();
		Thread.sleep(4000);
		Actions ac1= new Actions(driver);
		ac1.moveToElement(show_leave)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		Thread.sleep(4000);
		
		WebElement leave_type= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]"));
		leave_type.click();
		Thread.sleep(4000);
		Actions ac2= new Actions(driver);
		ac2.moveToElement(leave_type)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		Thread.sleep(4000);
		
		WebElement sub_units= driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[3]"));
		sub_units.click();
		Thread.sleep(4000);
		Actions ac3= new Actions(driver);
		ac3.moveToElement(sub_units)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		Thread.sleep(4000);
		
		WebElement ename= driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		ename.sendKeys("s");
		Thread.sleep(4000);
		Actions ac4= new Actions(driver);
		ac4.moveToElement(ename)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(4000);
	driver.quit();
	
	}
}
