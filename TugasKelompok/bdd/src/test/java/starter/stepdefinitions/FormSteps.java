package starter.stepdefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.FormPage;
import starter.pages.HomePage;

public class FormSteps {

    @Steps
    FormPage formPage;

    @Steps
    HomePage homePage;

    @Given("I am on the-internet home page")
    public void onTheHomePage() {
        homePage.openPage();
        homePage.validateOnHomePage();
    }

    @When("I go to the form authentication page")
    public void goToFormAuthenticationPage() {
        homePage.clickFormAuth();
    }

    @And("I input valid username")
    public void inputValidUname() {
        formPage.inputUserName("tomsmith");
    }

    @And("I input valid password")
    public void inputValidPass() {
        formPage.inputPassword("SuperSecretPassword!");
    }

    @And("I click login button")
    public void clickLoginButton() {
        formPage.clickLoginButton();
    }

    @Then("I am on the secure area page")
    public void onSecureAreaPage() {
        formPage.validateOnSecureAreaPage();
    }
}   
