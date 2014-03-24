package com.epam.ui;

import com.epam.main.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 3/21/14
 * Time: 12:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesAdminPage {

    /*@FindBy (xpath="//table//pre/input[@name='id']")
        WebElement hotelId;*/

    @FindBy (xpath = "//table[@class='formbox']//input[@name='id']") WebElement idHotel;

    @FindBy (xpath="//td/input[@class='submit'][@type='submit']") WebElement buttonSearch;



    public PropertiesAdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void enterHotelId(String hotelId){
        this.idHotel.sendKeys(hotelId);
    }


    public PropertiesAdminSecondPage clickSearch() {
        buttonSearch.click();
        return new PropertiesAdminSecondPage();
    }
}
