package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CountryPage {

    ElementHelper elementHelper;

    By Countries = By.className("country");
    By CountriesDropdown = By.className("//span[@class=\"selected-country-code\"]");
    By cookieButton = By.xpath("//button[text()='ACCEPT']");

    public CountryPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void countryButton() {
        elementHelper.click(Countries);

    }

    public void countryDropDown() {
        elementHelper.click(CountriesDropdown);


    }


    public void Cookies() {
        elementHelper.click(cookieButton);


    }








}
