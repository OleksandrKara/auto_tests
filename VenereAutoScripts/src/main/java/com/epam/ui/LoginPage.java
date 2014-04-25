package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage {

    @FindBy(id="flogin")
    WebElement login;

    @FindBy(css = "input[type=\"Password\"]")
    WebElement password;

    @FindBy(css = "input[type=\"submit\"]")
    WebElement button;

    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open() {
        Driver.getDriver().get(System.getProperty("test.baseURL"));
    }

    public void enterCredentials(String log, String pass) {
        this.login.sendKeys(log);
        this.password.sendKeys(pass);
    }

    public AdmPage clickEnterToAdm() {
        this.button.click();
        return new AdmPage();
    }

    public void invoke() {
        open();
    }


    /*public AdmPage loginIn() {
        open();
        enterCredentials(System.getProperty("login"),System.getProperty("password"));
        return clickEnterToAdm();
    }*/

}
