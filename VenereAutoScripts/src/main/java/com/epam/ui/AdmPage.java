package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 19.03.14
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
public class AdmPage {

    private WebElement link;

    @FindBy(xpath="//tbody//td//a[contains(@href,'/adm/login/?action=logout')]")
    WebElement logoutLink;

    public AdmPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getValue(){
        return logoutLink;
    }

    public void clickToAdmLink(String urlPart){
        link = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'" + urlPart + "')]"));
        link.click();
    }
}
