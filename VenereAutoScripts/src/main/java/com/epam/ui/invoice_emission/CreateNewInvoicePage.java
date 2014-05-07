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
 * Date: 4/7/14
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewInvoicePage extends Page implements ExpectedResultsInterface {

    @FindBy (xpath = "//input[@class='submit'][@type='Submit']")
    WebElement createTheInvoiceButton;

    public void clickCreateInvoiceButton() {
        createTheInvoiceButton.click();
    }

    public void acceptConfirmation() {
        acceptConfirmationMessage();
    }

    @Override
    public void invoke() {

    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(createTheInvoiceButton);
            }
        };
    }
}
