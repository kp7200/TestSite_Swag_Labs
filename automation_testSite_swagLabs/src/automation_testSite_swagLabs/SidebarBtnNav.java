package automation_testSite_swagLabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarBtnNav {

	void sidebarBtnNavFunc (WebDriver driver) throws Exception {
		
		WebElement about = driver.findElement(By.id("about_sidebar_link"));
		
		about.click();
		if(driver.getCurrentUrl().equals("https://saucelabs.com/")){
			System.out.println("About button is working...");
		}
		else {
			System.out.println("About button is not working...");
		}
		driver.navigate().back();
		
		//used sidebar class to open sidebar
		sidebar side = new sidebar();
		side.sidebarfunc(driver);
		
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/")){
			System.out.println("Logout Successful...");
		}
		else {
			System.out.println("Logout not working...");
		}
	}
}
