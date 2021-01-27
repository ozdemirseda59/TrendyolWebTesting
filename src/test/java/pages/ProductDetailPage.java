package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) { super(driver); }

    By addToCartButton= By.xpath(".//button[contains(@class,'add-to-bs')]");
    By basketItemCountBy=By.xpath("//span[@class='basket-item-count']");

    public void clickAddToCartButton(){waitAndClick(addToCartButton);}

    public void verifyBasketItemCount(){ assertEquals(basketItemCountBy,"1");}

}
