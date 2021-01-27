package tests.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class HomePageSteps extends BaseStep {
    @Before
    public void setup(){
        setupCucumber();
        homePage.fileReader();
    }
    @Given("^I am on \"([^\"]*)\" Home Page$")
    public void iAmOnHomePage(String arg0) throws Throwable { homePage.goToTrendyol(arg0); }

    @When("^I close popup$")
    public void iClosePopup() { homePage.closePopup();}

    @And("^I should see the boutique images are loaded when I click all categories$")
    public void iShouldSeeTheBoutiqueImagesAreLoadedWhenIClickAllCategories() throws Exception {  homePage.clickToTabListAndCheckBoutiqueImageLoaded();}

    @After
    public void close(){ teardown(); }
}
