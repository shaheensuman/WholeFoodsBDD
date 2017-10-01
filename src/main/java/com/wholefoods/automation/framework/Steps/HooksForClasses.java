package com.wholefoods.automation.framework.Steps;

import com.wholefoods.automation.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.wholefoods.automation.framework.Steps.WebdriverProvider.driver;

/**
 * Created by jahangir shaheen on 10/1/2017.
 */
public class HooksForClasses extends WebdriverProvider {
    WebDriver  driver=getDriver();

    @Before
    public void setUp(){
        //ChromeDriverManager.getInstance().setup();
       // driver=new ChromeDriver();
       // driver= DriverFactory.getInstance().getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }
    @After
    public void tearDown(){
        driver.close();
         driver.quit();
        //DriverFactory.getInstance().removeDriver();
    }
}
