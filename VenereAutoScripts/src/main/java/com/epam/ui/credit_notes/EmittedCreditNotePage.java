package com.epam.ui.credit_notes;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/9/14
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmittedCreditNotePage {

    @FindBy (xpath = "//input[@class='submit'][@type = 'Submit']")
    WebElement nextButton;

    public EmittedCreditNotePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickNext() {
        nextButton.click();
    }
}
