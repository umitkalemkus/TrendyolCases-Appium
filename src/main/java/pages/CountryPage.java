package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CountryPage {

    ElementHelper elementHelper;

    By Countries = By.className("country");
    By CountriesDropdown = By.className("country");
    By buttons = By.className("android.widget.Button");

    public CountryPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void countryButton() {
        elementHelper.click(Countries);

    }

    public void countryDropDown() {
        elementHelper.pressEnter();


    }



    public void clickButton(String button) {
        elementHelper.clickElementWithText(buttons, button);
    }




}
