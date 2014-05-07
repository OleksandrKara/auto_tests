package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoices_configuration;

import com.epam.main.Driver;
import com.epam.main.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/24/14
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class EligibleCountriesSecondPage extends Page {

    /*@FindBy(xpath = "//select[@id = 'countries_to_add']/option[contains(text(),'Australia')]")
    WebElement selectedCountry;*/

    @FindBy(xpath = "//table//form[@class = 'add country form']/input[@class = 'add button']")
    WebElement addButton;

    @FindBy(xpath = "//form[@id='remove_form']/input[@class = 'delete button']")
    WebElement deleteButton;

    public void acceptConfirmation(){
        acceptConfirmationMessage();
    }

    public void selectTheCountry(String countryName) {
        checkThatCountryIsNotAddedToTheMainList(countryName);
        WebElement selectedCountry = Driver.getDriver().findElement(By.xpath("//select[@id = 'countries_to_add']/option[contains(text(),\'"+countryName+"\')]"));
        selectedCountry.click();
    }

    public void checkThatCountryIsNotAddedToTheMainList(String countryName) {
        if (listOfCountriesContainsCountry(countryName) == true){
            //steps to delete country from list
            WebElement removeCheckbox = Driver.getDriver().findElement(By.xpath("//li[div[text()=\'"+countryName+"\']]/div[@class = 'remove checkbox']"));
            removeCheckbox.click();
            deleteButton.click();
            acceptConfirmationMessage();
        }
    }

    public void clickAddTheCountry() {
        addButton.click();
    }

    public boolean listOfCountriesContainsCountry(String countryName) {
        return isElementPresent(By.xpath("//*[@id='added_country_list']/li/div[contains(text(), \'"+countryName+"\')]"));
    }
}
