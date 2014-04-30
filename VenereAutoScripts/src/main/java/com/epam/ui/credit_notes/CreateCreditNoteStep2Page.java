package com.epam.ui.credit_notes;

import com.epam.main.Page;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteStep2Page extends Page implements ExpectedResultsInterface {

    String yearElement = "//select[@name='new_year']";

    @FindBy (xpath = "//input[@name='new_number']")
    WebElement invoiceNumberElement;

    @FindBy (xpath = "//input[@type='Submit']")
    WebElement continueButton;

    public void setYear(String year) {
        selectElementByTheText(yearElement,year);
    }

    public void setInvoiceNumber(String invoiceNumber) {
        invoiceNumberElement.sendKeys(invoiceNumber);
    }

    public CreateCreditNoteReservationPage clickContinue() {
        continueButton.click();
        return new CreateCreditNoteReservationPage();
    }

    @Override
    public void invoke() {
        final String VENERE_COMPANY = "Venere UK";
        String creditNoteType = "AD";
        CreateCreditNoteStep1Page createCreditNoteStep1Page = new CreateCreditNoteStep1Page();
        createCreditNoteStep1Page.selectVenereCompany(VENERE_COMPANY);
        createCreditNoteStep1Page.selectType(creditNoteType);
        createCreditNoteStep1Page.clickContinue();
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(invoiceNumberElement);
                add(continueButton);
            }
        };
        /*Assert.assertTrue("Textarea locator is broken", invoiceNumberElement.isDisplayed());
        Assert.assertTrue("Textarea locator is broken", continueButton.isDisplayed());*/
    }
}
