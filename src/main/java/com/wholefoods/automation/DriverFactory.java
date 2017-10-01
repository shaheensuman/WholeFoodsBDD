package com.wholefoods.automation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jahangir shaheen on 9/28/2017.
 */
public class DriverFactory {
    private static DriverFactory instance=new DriverFactory();
    private DriverFactory(){}

    public static DriverFactory getInstance(){
        return instance;
    }
    ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>(){
         @Override
        protected WebDriver initialValue(){
            ChromeDriverManager.getInstance().setup();
            return new ChromeDriver();
        }
    };

    public WebDriver getDriver(){
        return driver.get();
    }
    public void  removeDriver(){
        driver.get().quit();
        driver.remove();
    }

}
