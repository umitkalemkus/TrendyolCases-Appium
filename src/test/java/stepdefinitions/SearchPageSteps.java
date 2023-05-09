package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchPage;
import utils.DriverManager;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(DriverManager.getDriver());


    @Then("should see Title {string} on Buttons Page")
    public void shouldSeeTitleOnButtonsPage(String title) {

    }


    @When("taps Search Area on Home Page")
    public void tapsSearchAreaOnHomePage() {
    }

    @Then("should see the Search Page")
    public void shouldSeeTheSearchPage() {

    }

    @When("sendkeys Search Area {string} on Search Page")
    public void sendkeysSearchAreaOnSearchPage(String arg0) {



    }
}
