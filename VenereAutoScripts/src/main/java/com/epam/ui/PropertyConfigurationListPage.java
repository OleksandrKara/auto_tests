package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyConfigurationListPage {

    @FindBy (xpath = "//tr/td/input[@class='submit'][@type='submit']")
    WebElement modifyButton;

    public PropertyConfigurationListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public PropertyConfigurationModifyPage clickToModifyButton() {
        modifyButton.click();
        return new PropertyConfigurationModifyPage();
    }
}
