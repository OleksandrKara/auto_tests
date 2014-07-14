package com.epam.ui;

import com.epam.main.Driver;
import com.epam.main.Page;
import com.epam.smoke_tests.interfaces.ExpectedResultsInterface;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends Page implements ExpectedResultsInterface {

    @FindBy(id="flogin")
    WebElement login;

    @FindBy(css = "input[type=\"Password\"]")
    WebElement password;

    @FindBy(css = "input[type=\"submit\"]")
    WebElement button;

    public void open() {
        Driver.getDriver().get(System.getProperty("test.baseURL"));
    }

    public void enterCredentials(String log, String pass) {
        type(login, log);
        type(password, pass);
    }

    public AdmPage clickEnterToAdm() {
        button.click();
        return new AdmPage();
    }

    public void invoke() {
        open();
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(login);
                add(password);
                add(button);
            }
        };
    }
}
