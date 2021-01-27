package tests.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseStep;

public class ProductDetailSteps extends BaseStep {
    @When("^I click any product on Boutique Detail Page$")
    public void iClickAnyProductOnBoutiqueDetailPage() throws Exception { boutiqueDetailPage.clickRandomProduct();}

    @And("^I click Sepete Ekle button$")
    public void iClickSepeteEkleButton() { productDetailPage.clickAddToCartButton();}

    @Then("^I should see Sepete Eklendi button$")
    public void iShouldSeeSepeteEklendiButton() { productDetailPage.verifyBasketItemCount();}
}
