package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/9/14
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReconciliationListPage extends Page {

    @FindBy(xpath = "//table[@id='table_mr']/tbody/tr[3]/td[15]/input")
    WebElement selCheckBox;

    @FindBy (id = "create_button_mr")
    WebElement createButton;

    String dayElement = "//select[@name = 'e_dd']";
    String monthElement = "//select[@name = 'e_mm']";
    String yearElement = "//select[@name = 'e_yy']";
    String bankElement = "//select[@name = 'venere_bank_id']";

    public ReconciliationListPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickSelOptionCheckBox() {
        selCheckBox.click();
    }

    public void setTheDate(String[] date) {
        selectElementByTheText(dayElement, date[0]);
        selectElementByTheText(monthElement, date[1]);
        selectElementByTheText(yearElement, date[2]);
    }

    public void setBank(String bank) {
        selectElementByTheText(bankElement, bank);
    }

    public EmittedCreditNotePage clickCreateButton() {
        createButton.click();

        return new EmittedCreditNotePage();
    }
}
