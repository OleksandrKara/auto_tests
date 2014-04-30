package com.epam.ui.invoices_configuration;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchPropertyBillingConfigurationPage extends Page {

    @FindBy (xpath = "//tr/td/input[@name = 'property_id']")
    WebElement hotelIdElement;

    @FindBy (xpath = "//tr/td/input[@name = 'client_id']")
    WebElement clientIdElement;

    @FindBy (xpath="//td/input[@class='submit'][@type='submit']")
    WebElement searchButton;

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
