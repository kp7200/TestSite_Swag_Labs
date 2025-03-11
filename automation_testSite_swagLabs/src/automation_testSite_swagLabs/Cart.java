package automation_testSite_swagLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

    //for 1 button [not called in main class]
    void CheckCart(WebDriver driver){

        WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addtocart.click();
        WebElement cartbadge = driver.findElement(By.className("shopping_cart_badge"));

        if(cartbadge.isDisplayed()){
            System.out.println("Cart is not empty");
        }
        else
        {
            System.out.println("Cart is empty");
        }
    }

    //to check multiple buttons having same class name
    void CheckCart2(WebDriver driver) throws Exception{

        //creating list of buttons
        List<WebElement> addtocart = driver.findElements(By.className("btn"));
        int lengthOfCart = addtocart.size(); //gets the length of list

        for(WebElement buttons : addtocart){
            buttons.click();
        }
        Thread.sleep(3000);

        WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
        String lengthInStr = Integer.toString(lengthOfCart); //converting interger value to the string to compare with another stirng

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("cart count " + badge.getText());
        System.out.println("no of button " + lengthInStr);

        if (lengthInStr.equals(badge.getText())) {
            System.out.println("Add to cart buttons are working and showing correct quantity in cart...");
        }
        else{
            System.out.println("Add to cart buttons are not working or showing incorrect quantity in cart...");
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();

        
    }    
}
