package com.epam.smoke_tests.interfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/24/14
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ExpectedResultsInterface extends Invokable {
    final static String key = "До мажор";
    List<WebElement> getExpectedControls();
    //boolean exist();
}
