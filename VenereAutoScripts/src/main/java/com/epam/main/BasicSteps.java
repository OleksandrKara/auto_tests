package com.epam.main;

import com.epam.ui.AdmPage;
import com.epam.ui.LoginPage;
import org.openqa.selenium.Alert;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasicSteps {

    public static void clickToMenuPoint(String linkToMenuPoint){
        AdmPage page =  loginIn();
        page.clickToAdmLink(linkToMenuPoint);
    }

    public static AdmPage loginIn(){
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        return page.clickEnterToAdm();
    }

    public static void acceptConfirmationMessage() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
