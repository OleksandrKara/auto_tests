package com.epam.ui.credit_notes;

import com.epam.main.BasicSteps;
import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteStep2Page {

    String yearElement = "//select[@name='new_year']";

    @FindBy (xpath = "//input[@name='new_number']")
    WebElement invoiceNumberElement;

    @FindBy (xpath = "//input[@type='Submit']")
    WebElement continueButton;

    public CreateCreditNoteStep2Page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void setYear(String year) {
        BasicSteps.selectElementByTheText(yearElement,year);
    }

    public void setInvoiceNumber(String invoiceNumber) {
        invoiceNumberElement.sendKeys(invoiceNumber);
    }

    public CreateCreditNoteReservationPage clickContinue() {
        continueButton.click();
        return new CreateCreditNoteReservationPage();
    }

}
