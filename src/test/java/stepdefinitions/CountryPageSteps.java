package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CountryPage;
import utils.DriverManager;

public class CountryPageSteps {

    CountryPage countryPage = new CountryPage(DriverManager.getDriver());




    @Given("user should see the Country Page")
    public void userShouldSeeTheGenderPage() {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement()
        countryPage.countryDropDown();
        WebElement Cookies = DriverManager.getDriver().findElement(By.xpath("//button[text()='ACCEPT']"));
        Cookies.click();





    }

    @When("taps country {string} on Country Page")
    public void tapsGenderOnGenderPage(String arg0) {
    }
}
