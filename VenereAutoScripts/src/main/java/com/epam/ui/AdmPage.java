package com.epam.ui;

import com.epam.main.Driver;
import com.epam.main.Page;
import com.epam.smoke_tests.Roles.ExpectedResultsInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class AdmPage extends Page implements ExpectedResultsInterface {

    private WebElement link;

    @FindBy(xpath="//tbody//td//a[contains(@href,'/adm/login/?action=logout')]")
    WebElement logoutLink;

    public WebElement getValue(){
        return logoutLink;
    }

    public void clickToAdmLink(String urlPart){
        link = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'" + urlPart + "')]"));
        link.click();
    }

    public  void clickToMenuPoint(String linkToMenuPoint) {
        clickToAdmLink(linkToMenuPoint);
    }

    @Override
    public void invoke() {
        LoginPage loginPage = new LoginPage();
        //loginPage.invoke();
        loginPage.enterCredentials(System.getProperty("test.login"),System.getProperty("test.password"));
        loginPage.clickEnterToAdm();
    }

    @Override
    public List<WebElement> getExpectedControls() {
        return new ArrayList<WebElement>(){
            {
                add(logoutLink);
            }
        };
        //Assert.assertTrue("Comments", logoutLink.isDisplayed());
    }
}
