package utilities;

import org.openqa.selenium.WebDriver;
import pages.BoutiqueDetailPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;

public class BaseStep {
    // Initialization
    protected static WebDriver driver=null;
    protected static HomePage homePage=null;
    protected static LoginPage loginPage=null;
    protected static BoutiqueDetailPage boutiqueDetailPage=null;
    protected static ProductDetailPage productDetailPage=null;

    protected void setupCucumber () {
        driver= SettingBrowser.StartBrowser("chrome");
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        boutiqueDetailPage=new BoutiqueDetailPage(driver);
        productDetailPage=new ProductDetailPage(driver);
    }
    protected void teardown(){
        driver.quit();
    }
}
