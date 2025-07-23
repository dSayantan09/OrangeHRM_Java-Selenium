package orangeHRM_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Module {
	public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        // Login
        WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        uname.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(4000);

        // Navigate to User Management
        WebElement admin = driver.findElement(By.xpath("(//span[contains(text(),admin)])[1]"));
        admin.click();
        Thread.sleep(2000);

        WebElement searchUser = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        searchUser.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement urole = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
        urole.click();
        Actions a = new Actions(driver);
        a.moveToElement(urole).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        WebElement ename = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        ename.sendKeys("Firstname Test Lastname Test");
        Thread.sleep(3000);
        Actions b = new Actions(driver);
        b.moveToElement(ename).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        WebElement status = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
        status.click();
        Actions c = new Actions(driver);
        c.moveToElement(status).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
        search.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        // Add new user
        WebElement adminAgain = driver.findElement(By.xpath("(//span[contains(text(),admin)])[1]"));
        adminAgain.click();
        Thread.sleep(2000);

        WebElement add = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
        add.click();
        Thread.sleep(2000);

        WebElement u_Role = driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]"));
        u_Role.click();
        Actions d = new Actions(driver);
        d.moveToElement(u_Role).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);

        WebElement status2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        status2.click();
        Actions e = new Actions(driver);
        e.moveToElement(status2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        WebElement empName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        empName.sendKeys("S");
        Thread.sleep(3000);
        Actions f = new Actions(driver);
        f.moveToElement(empName).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        WebElement userNameField = driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
        userNameField.sendKeys("Sayantan");

        WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("SinghSinha123");
        Thread.sleep(2000);

        WebElement c_password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        c_password.sendKeys("SinghSinha123");
        Thread.sleep(2000);

        WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
        save.click();
        Thread.sleep(4000);
        driver.quit();
    }
}
