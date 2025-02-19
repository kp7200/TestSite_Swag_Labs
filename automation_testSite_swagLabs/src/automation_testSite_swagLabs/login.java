package automation_testSite_swagLabs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	Funcs funcs = new Funcs();	
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	funcs.setUname(driver);

	Thread.sleep(3000);
	driver.close();	
	}
}

class Funcs {
	
	void setUname(WebDriver driver) throws Exception
	{
		String[] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user", "visual_user"};
		
		
		for (int i = 0; i <= usernames.length-1; i++)
		{
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginBtn = driver.findElement(By.id("login-button"));
			
			Thread.sleep(2000);
			username.sendKeys(usernames[i]);
			password.sendKeys("secret_sauce");
			loginBtn.click();
			String currenturl = driver.getCurrentUrl();
			
			if(currenturl.equals("https://www.saucedemo.com/inventory.html"))
			{
				System.out.println("Login Success " + usernames[i]);
				driver.navigate().back();
			}
			else
			{
				System.out.println("Login Failed for " + usernames[i]);
				WebElement error = driver.findElement(By.className("error-message-container"));
				System.out.println("Error: " + error.getText());
				driver.navigate().refresh();
			}
			
		}
	}
}
