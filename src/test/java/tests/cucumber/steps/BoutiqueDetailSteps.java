package tests.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;
import utilities.BaseStep;

public class BoutiqueDetailSteps extends BaseStep {

    @And("^I click on a random boutique on Home Page$")
    public void iClickOnARandomBoutiqueOnHomePage() throws Exception {homePage.clickRandomBotique();}

    @Then("^I should see the product images are loaded on the boutique detail page$")
    public void iShouldSeeTheProductImagesAreLoadedOnTheBoutiqueDetailPage() { boutiqueDetailPage.checkProductImageLoaded();}
}
