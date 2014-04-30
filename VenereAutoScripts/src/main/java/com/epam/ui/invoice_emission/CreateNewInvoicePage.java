package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/7/14
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewInvoicePage extends Page {

    @FindBy (xpath = "//input[@class='submit'][@type='Submit']")
    WebElement createTheInvoiceButton;

    public void clickCreateInvoiceButton() {
        createTheInvoiceButton.click();
    }

    public void acceptConfirmation() {
        acceptConfirmationMessage();
    }
}
