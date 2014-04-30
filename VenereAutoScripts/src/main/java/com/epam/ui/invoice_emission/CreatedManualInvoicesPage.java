package com.epam.ui.invoice_emission;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/7/14
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreatedManualInvoicesPage extends Page {

    @FindBy(xpath = "//a[contains(@href,'show_form_invoice')]")
    WebElement linkInvoice;

    public void clickViewInvoice() {
        linkInvoice.click();
    }
}
