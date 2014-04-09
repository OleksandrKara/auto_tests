package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.epam.main.BasicSteps.acceptConfirmationMessage;
import static com.epam.main.BasicSteps.selectElementByTheText;

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

    @FindBy (id = "create_button")
    WebElement createButton;

    String amountTypeField ="//select[@name = 'amount_type']";
    String dayElement = "//select[@name = 'e_dd']";
    String monthElement = "//select[@name = 'e_mm']";
    String yearElement = "//select[@name = 'e_yy']";
    String bankElement = "//select[@name = 'venere_bank_id']";

    public CreateCreditNoteReservationPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void fillIn(String testString) {
        textarea.sendKeys(testString);
    }


    public void setAmount(String amount) {
        amountField.sendKeys(amount);
    }

    public void setAmountType(String partialOrTotal){
        selectElementByTheText(amountTypeField, partialOrTotal);
    }

    public void setTheDate(String[] date) {
        selectElementByTheText(dayElement, date[0]);
        selectElementByTheText(monthElement, date[1]);
        selectElementByTheText(yearElement, date[2]);
    }

    public void setBank(String bank) {
        selectElementByTheText(bankElement, bank);
    }

    public void clickCreateButton() {
        createButton.click();
    }

    public void confirmation() {
        acceptConfirmationMessage();
    }
}