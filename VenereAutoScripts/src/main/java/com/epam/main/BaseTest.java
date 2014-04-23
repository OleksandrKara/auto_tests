package com.epam.main;

import com.epam.ui.AdmPage;
import com.epam.ui.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class BaseTest {

    @BeforeMethod
    public void initialization(){
        Driver.init();
    }

    @AfterMethod
    public void cleanup(){
        Driver.tearDown();
    }

    public static void clickToMenuPoint(String linkToMenuPoint){
        AdmPage page =  loginIn();
        page.clickToAdmLink(linkToMenuPoint);
    }

    public static AdmPage loginIn(){
        LoginPage page = LoginPage.open();
        page.enterCredentials(System.getProperty("login"),System.getProperty("password"));
        return page.clickEnterToAdm();
    }
}
