package com.epam.ui.reconciliations;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyReconciliationPage {
    @FindBy(xpath = "//tbody/tr[3]/td/input")
    WebElement searchButton;

    public PropertyReconciliationPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickSearch() {
        searchButton.click();
    }
}
