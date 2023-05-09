package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {

    HomePage buttonsPage = new HomePage(DriverManager.getDriver());

    @When("taps Popup Close Button on Home Page")
    public void tapsPopupCloseButtonOnHomePage() {



    }

    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {





    }
}
