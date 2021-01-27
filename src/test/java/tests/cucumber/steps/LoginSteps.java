package tests.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import utilities.BaseStep;

public class LoginSteps extends BaseStep {
    @And("^I click Giris Yap user icon on Home Page$")
    public void iClickGirisYapUserIconOnHomePage() { homePage.clickToUserIcon();}

    @And("^I fill E-Posta field and Sifre field and click Giris Yap on LoginPage$")
    public void iFillEPostaFieldAndSifreFieldAndClickGirisYapOnLoginPage() throws Exception {loginPage.loginToTrendyol(); }

    @Then("^I verify user \"([^\"]*)\" login on Home Page$")
    public void iVerifyUserLoginOnHomePage(String arg0) throws Throwable { homePage.verifyUser(arg0);}

}
