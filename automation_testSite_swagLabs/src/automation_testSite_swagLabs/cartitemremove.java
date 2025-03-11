package automation_testSite_swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartitemremove {

    void CartItemRemove (WebDriver driver) throws Exception{

        WebElement cartlink = driver.findElement(By.className("shopping_cart_link"));
        cartlink.click();

        //getting badge count before removing team from the cart...
        WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
        String itemCountInitial = badge.getText();
        int itemCountInitialInt = Integer.parseInt(itemCountInitial); //converting String into Int...
        
        //removing item from the cart
        WebElement removeBtn = driver.findElement(By.className("btn_secondary"));
        removeBtn.click();

        Thread.sleep(2000);

        //getting item count after removing the item from cart...
        String itemCountFinal = badge.getText();
        int itemCountIntFinalInt = Integer.parseInt(itemCountFinal);

        //decreasing item count by 1 as one item is removed from the cart...
        itemCountInitialInt--;

        //comparing both initial and final item counts...
        if(itemCountInitialInt == itemCountIntFinalInt){
            System.out.println("Item removed Successfully...");
        }
        else if(itemCountFinal == itemCountInitial){
            System.out.println("Item not removed...");
        }
        else{
            System.out.println("Mismatched");
        }

    }

}
