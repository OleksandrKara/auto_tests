package com.epam.ui.invoices_configuration;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchPropertyBillingConfigurationPage {

    @FindBy (xpath = "//tr/td/input[@name = 'property_id']")
    WebElement hotelIdElement;

    @FindBy (xpath = "//tr/td/input[@name = 'client_id']")
    WebElement clientIdElement;

    @FindBy (xpath="//td/input[@class='submit'][@type='submit']")
    WebElement searchButton;

    public SearchPropertyBillingConfigurationPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void enterHotelId(String hotelId) {
        hotelIdElement.sendKeys(hotelId);
    }

    public void enterClientId(String clientId) {
        clientIdElement.sendKeys(clientId);
    }

    public PropertyConfigurationListPage clickToSearchButton() {
        searchButton.click();
        return new PropertyConfigurationListPage();
    }
}
