package com.epam.ui.invoice_emission;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/7/14
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreatedManualInvoicesPage {

    @FindBy(xpath = "//a[contains(@href,'show_form_invoice')]")
    WebElement linkInvoice;

    public CreatedManualInvoicesPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickViewInvoice() {
        linkInvoice.click();
    }
}
