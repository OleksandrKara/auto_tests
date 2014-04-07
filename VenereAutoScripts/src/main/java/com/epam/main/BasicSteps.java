package com.epam.main;

import com.epam.ui.AdmPage;
import com.epam.ui.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/27/14
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasicSteps extends BaseTest{

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

    public static void selectElementByTheText(String locator, String text){
        Select select = new Select(Driver.getDriver().findElement(By.xpath(locator)));
        select.selectByVisibleText(text);
        select.getFirstSelectedOption();
    }

    public static void deselectAllAndSelectElementByTheText(String locator, String text){
        Select select = new Select(Driver.getDriver().findElement(By.xpath(locator)));
        select.deselectAll();
        select.selectByVisibleText(text);
        select.getFirstSelectedOption();
    }

    public static void javaScriptExecutor(String locator){
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();", locator);
    }
}
