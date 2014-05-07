package com.epam.smoke_tests.smoke_test_pages.ui_tests.invoices_configuration;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvoicesConfigurationPage extends Page {

    @FindBy (xpath = "//ul[contains(text(),'Property invoice configuration')]/li[2]/a[contains(@href,'search')]")
    WebElement searchButton;

    public SearchPropertyBillingConfigurationPage clickSearchLink() {
        searchButton.click();
        return new SearchPropertyBillingConfigurationPage();  //To change body of created methods use File | Settings | File Templates.
    }
}
