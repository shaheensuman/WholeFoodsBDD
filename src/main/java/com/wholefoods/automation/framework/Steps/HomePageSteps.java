package com.wholefoods.automation.framework.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by jahangir shaheen on 9/30/2017.
 */
public class HomePageSteps extends WebdriverProvider {
    WebDriver driver=getDriver();


    @Given("^as not valid user$")
    public void as_not_valid_user() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @When("^browse to URL \"([^\"]*)\"$")
    public void browse_to_URL(String arg1) throws Throwable {
        driver.navigate().to(arg1);
    }

    @Then("^wholefood page appear\\.$")
    public void wholefood_page_appear() throws Throwable {
        String actualTitle=driver.getTitle();
        String expectedTitle="Whole Foods Market | America’s Healthiest Grocery Store";
        Assert.assertEquals(actualTitle,expectedTitle);
    }


}
