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
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreatedManualInvoicesPage extends Page implements ExpectedResultsInterface {

    @FindBy(xpath = "//a[contains(@href,'show_form_invoice')]")
    WebElement linkInvoice;

    public void clickViewInvoice() {
        linkInvoice.click();
    }

    @Override
    public void invoke() {

    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(linkInvoice);
            }
        };
    }
}
