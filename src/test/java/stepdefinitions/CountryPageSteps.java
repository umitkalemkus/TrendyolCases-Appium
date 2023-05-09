package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CountryPage;
import utils.DriverManager;

public class CountryPageSteps {

    CountryPage countryPage = new CountryPage(DriverManager.getDriver());




    @Given("user should see the Country Page")
    public void userShouldSeeTheGenderPage() {
        countryPage.countryButton();





    }

    @When("taps country {string} on Country Page")
    public void tapsGenderOnGenderPage(String arg0) {
    }
}
