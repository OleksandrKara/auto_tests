package com.epam.ui.reconciliations;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/8/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyReconciliationPage extends Page {
    @FindBy(xpath = "//tbody/tr[3]/td/input")
    WebElement searchButton;

    public void clickSearch() {
        searchButton.click();
    }
}
