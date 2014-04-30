package com.epam.ui.invoice_emission;

import com.epam.main.Driver;
import com.epam.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/2/14
 * Time: 12:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class BackgroundTasksPage extends Page {

    @FindBy (xpath = "//tr[3]/td/input[@value='Show form']")
    WebElement showFormButton;

    @FindBy (xpath = "//input[@name='submit'][@type='submit']")
    WebElement startButton;

    public void getStartBgTask() {
        Driver.getDriver().get(System.getProperty("test.startBackgroundTask"));

        startButton.click();
    }

    public void getToBgTasks() {
        Driver.getDriver().get(System.getProperty("test.backgroundTasks"));
    }

    public void clickToShowForm() {
        showFormButton.click();
    }
}
