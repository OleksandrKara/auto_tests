package com.epam.ui.invoice_emission;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/4/14
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualInvoicePage {

    @FindBy(id = "hotel_id")
    WebElement hotelIdElement;

    @FindBy(xpath = "//tr[3]/td/input[@type='Submit'][@class='submit']")
    WebElement continuePropertyIdButton;

    public ManualInvoicePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void setHotelId(String hotelId) {
        hotelIdElement.sendKeys(hotelId);
    }

    public ManualInvoiceEmissionPage clickToContinuePropertyIdButton(){
        continuePropertyIdButton.click();
        return new ManualInvoiceEmissionPage();
    }
}
