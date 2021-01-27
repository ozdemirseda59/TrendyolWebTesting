package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;
;

public class BoutiqueDetailPage extends BasePage {
    public BoutiqueDetailPage(WebDriver driver) { super(driver); }


    //*********Web Elements*********
    By productImag=By.xpath(".//div[@class='products']//img");
    By productImagHref=By.xpath(".//div[@class='products']//a");


    //*********Page Methods*********
    public  void checkProductImageLoaded() { checkImageLoaded(productImag,"Ürün Listesi Görseli Yüklenmemiştir"); }

    public void clickRandomProduct() throws Exception {
        clickRandomElement(productImagHref);
        checkForUrlContains("p-");
    }

}
