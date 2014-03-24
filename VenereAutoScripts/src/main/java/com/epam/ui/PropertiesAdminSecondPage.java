package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/21/14
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesAdminSecondPage {

    @FindBy (xpath = "//table[2]/tbody/tr[2]/td[2]/a[@title='Click to view property data']")
            WebElement hotelNameLink;


    public PropertiesAdminSecondPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickToHotelName(){
        this.hotelNameLink.click();
    }
}
