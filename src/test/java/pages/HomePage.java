package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BasePage;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) { super(driver); }

    //*********Web Elements*********
    By tabListBy = By.className("category-header");
    By closeBy=By.xpath(".//a[@title='Close']");
    By bigBoutiqueImagBy=By.xpath("//div[contains(@class,'big-list') or contains(@class,'small-list')]//img");
    By userIconBy=By.xpath("//div[@class='link account-user']");
    By verifyUserBy=By.xpath("//div[@class='link account-user']/p");
    By boutiqueImagHref=By.xpath("//div[contains(@class,'big-list') or contains(@class,'small-list')]//a");

    public void fileReader(){jsonFileReader();}

    public void goToTrendyol(String url) throws Exception {
        if(url.equals("")){
            driver.get(baseURL);
        }
        else {
            driver.get(url);
        }
        pageOnLoad();
    }

    //Close if popup exists
    public void closePopup(){
        if(waitVisibilityAndFindElements(closeBy).size()>0) {
            waitAndClick(closeBy);
        }
    }

    public void clickToUserIcon(){
        waitAndClick(userIconBy);
    }

    public void clickToTabListAndCheckBoutiqueImageLoaded() throws Exception {
        List<WebElement> tabList = waitVisibilityAndFindElements(tabListBy);
        for (int i=0;i <tabList.size();i++){
            tabList.get(i).click();
            pageOnLoad();
            checkForUrlContains("butik");
            checkImageLoaded(bigBoutiqueImagBy,"Ana sayfa butik görselleri yüklenmemiştir");
            tabList = waitVisibilityAndFindElements(tabListBy);
        }
    }
    //Verify Username Condition
    public void verifyUser(String expectedText) throws Exception {
        assertEquals(verifyUserBy,expectedText);
    }

    public void clickRandomBotique() throws Exception {
        clickRandomElement(boutiqueImagHref);
    }

}
