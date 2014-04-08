package com.epam.ui.credit_notes;

import com.epam.main.BasicSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCreditNoteReservationPage {

    @FindBy (xpath = "//textarea[@name='cn_notes']")
    WebElement textarea;
    @FindBy (xpath = "//input[@name = 'cn_amount']")
    WebElement amountField;

    String amountTypeField ="//input[@name = 'amount_type']";

    public void fillIn(String testString) {
        textarea.sendKeys(testString);
    }


    public void setAmount(String amount) {
        amountField.sendKeys(amount);
    }

    public void setAmountType(String partialOrTotal){
        BasicSteps.selectElementByTheText(amountTypeField,partialOrTotal);
    }
}
