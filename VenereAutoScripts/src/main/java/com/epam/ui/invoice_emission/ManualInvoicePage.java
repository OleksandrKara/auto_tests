package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/4/14
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualInvoicePage extends Page implements ExpectedResultsInterface {

    @FindBy(id = "hotel_id")
    WebElement hotelIdElement;

    @FindBy(xpath = "//tr[3]/td/input[@type='Submit'][@class='submit']")
    WebElement continuePropertyIdButton;

    public void setHotelId(String hotelId) {
        hotelIdElement.sendKeys(hotelId);
    }

    public ManualInvoiceEmissionPage clickToContinuePropertyIdButton(){
        continuePropertyIdButton.click();
        return new ManualInvoiceEmissionPage();
    }

    @Override
    public void invoke() {

    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>() {
            {
                add(hotelIdElement);
                add(continuePropertyIdButton);
            }
        };
    }
}
