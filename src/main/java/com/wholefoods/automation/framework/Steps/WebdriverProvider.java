package com.wholefoods.automation.framework.Steps;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jahangir shaheen on 10/1/2017.
 */
public class WebdriverProvider {
    protected  static WebDriver driver=null;
    public WebDriver getDriver(){
        if (driver==null){
            ChromeDriverManager.getInstance().setup();
            driver=new ChromeDriver();
        }return driver;
    }
}
