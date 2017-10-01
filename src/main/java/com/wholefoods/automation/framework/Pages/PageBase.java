package com.wholefoods.automation.framework.Pages;

import com.wholefoods.automation.DriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by jahangir shaheen on 9/28/2017.
 */
public class PageBase {
    protected WebDriver driver =DriverFactory.getInstance().getDriver();
}
