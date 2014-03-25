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

    @FindBy (xpath = "//table[@class='formbox']//input[@name='id']") WebElement idHotel;

    @FindBy (xpath="//td/input[@class='submit'][@type='submit']") WebElement buttonSearch;

    @FindBy (xpath = "//table[@class='formbox']//input[@name='name']") WebElement hotelNameElement;
    @FindBy (xpath = "//table[@class='formbox']//input[@name='city']") WebElement hotelCityElement;

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

    public void enterHotelName(String hotelName) {
        this.hotelNameElement.sendKeys(hotelName);
    }

    public void enterHotelCity(String hotelCity) {
        this.hotelCityElement.sendKeys(hotelCity);
    }
}
