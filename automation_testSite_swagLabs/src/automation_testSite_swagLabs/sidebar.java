package automation_testSite_swagLabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sidebar {
	
	void sidebarfunc(WebDriver driver) throws Exception
	{
		WebElement sidebarElement = driver.findElement(By.id("react-burger-menu-btn"));
		//stored the list of items
		WebElement itemList = driver.findElement(By.className("bm-item-list"));
		
		sidebarElement.click();
		Thread.sleep(2000);
		//System.out.print(itemList.isDisplayed());
		
		if(itemList.isDisplayed() == true)
		{
			System.out.println("Side bar is displaied...");
		}
		else {
			System.out.println("Side bar is not displaied...");
		}
	}
	
}

