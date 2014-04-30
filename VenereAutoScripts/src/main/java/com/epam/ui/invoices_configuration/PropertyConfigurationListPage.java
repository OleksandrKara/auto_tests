package com.epam.ui.invoices_configuration;

import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyConfigurationListPage extends Page {

    @FindBy (xpath = "//tr/td/input[@class='submit'][@type='submit']")
    WebElement modifyButton;

    public PropertyConfigurationModifyPage clickToModifyButton() {
        modifyButton.click();
        return new PropertyConfigurationModifyPage();
    }
}
