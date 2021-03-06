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
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManualInvoiceEmissionPage extends Page implements ExpectedResultsInterface {

    @FindBy(xpath = "//input[@type='Radio'][@value=1][@name='reservation']")
    WebElement radioButtonForReservation;

    @FindBy(xpath = "//input[@class='submit'][@type='Submit']")
    WebElement buttonShowPreview;

    @FindBy(xpath = "//td[@id='invoice_body']/textarea[@name='invoice_body']")
    WebElement textArea;

    @FindBy(xpath = "//td/input[@name='rateable_total']")
    WebElement invoiceTotalField;

    private String invoiceDateDayElement = "//select[@name='invoice_date_dd']";
    private String invoiceDateMonthElement = "//select[@name='invoice_date_mm']";
    private String invoiceDateYearElement = "//select[@name='invoice_date_yy']";
    private String reservationIncludedElement = "//select[@name='reserv_range_type']";
    private String firstCheckOutDayElement = "//select[@name = 'from_dd']";
    private String firstCheckOutMonthElement = "//select[@name = 'from_mm']";
    private String firstCheckOutYearElement = "//select[@name = 'from_yy']";

    public void setInvoiceDate(String[] invoiceDate) {
        selectElementByTheText(invoiceDateDayElement, invoiceDate[0]);
        selectElementByTheText(invoiceDateMonthElement, invoiceDate[1]);
        selectElementByTheText(invoiceDateYearElement, invoiceDate[2]);
    }

    public void setInvoiceForReservation() {
        radioButtonForReservation.click();
    }

    public void setReservationIncluded(String reservationIncludedText) {
        selectElementByTheText(reservationIncludedElement, reservationIncludedText);
    }

    public void setFirstCheckOut(String[] firstCheckOutDay) {
        selectElementByTheText(firstCheckOutDayElement, firstCheckOutDay[0]);
        selectElementByTheText(firstCheckOutMonthElement, firstCheckOutDay[1]);
        selectElementByTheText(firstCheckOutYearElement, firstCheckOutDay[2]);
    }

    public CreateNewInvoicePage clickToButton() {
        buttonShowPreview.click();
        return new CreateNewInvoicePage();
    }

    public void fillTextArea(String text) {
        textArea.sendKeys(text);
    }


    public void setAmountOfMoney(String amountOfMoney) {
        invoiceTotalField.sendKeys(amountOfMoney);
    }

    @Override
    public void invoke() {

    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(radioButtonForReservation);
                add(buttonShowPreview);
                add(textArea);
                add(invoiceTotalField);
            }
        };
    }
}
