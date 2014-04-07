package com.epam.ui.invoice_emission;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/7/14
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNewInvoicePage {

    @FindBy (xpath = "//input[@class='submit'][@type='Submit']")
    WebElement createTheInvoiceButton;

    public CreateNewInvoicePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickCreateInvoiceButton() {
        createTheInvoiceButton.click();
    }
}
