package automation_testSite_swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartnav {

    void CartNav (WebDriver driver){

        WebElement cartlink = driver.findElement(By.className("shopping_cart_link"));
        cartlink.click();

        String carturl = driver.getCurrentUrl();

        if(carturl.equals("https://www.saucedemo.com/cart.html")){
            System.out.println("Cart opened Successfully...");
        }
        else{
            System.out.println("Cart is not opening...");
        }
    }
}
