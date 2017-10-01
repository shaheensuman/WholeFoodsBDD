package com.wholefoods.automation.framework.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by jahangir shaheen on 9/30/2017.
 */
public class StorePageSteps extends StepBase{

    //  WebDriver driver=getDriver(); if StorePageSteps  extends WebdriverProvider

    @When("^click on \"([^\"]*)\" link$")
    public void click_on_link(String arg1) throws Throwable {
        WebElement couponLink=driver.findElement(By.xpath(".//*[@id='main-menu']//a[text()='Coupons']"));
        couponLink.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^Store page appear$")
    public void store_page_appear() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        System.out.println(driver.getCurrentUrl());
        String expectedtitle="Sales and Coupons | Whole Foods Market";
        // Assert.assertEquals(expectedtitle,actualtitle);

    }

    @When("^select store \"([^\"]*)\"$")
    public void select_store(String arg1) throws Throwable {
        WebElement stateBox=driver.findElement(By.xpath(".//*[@id='edit-state']"));
        Select state=new Select(stateBox);
        state.selectByVisibleText("New York");

    }

    @When("^select Lacation \"([^\"]*)\"$")
    public void select_Lacation(String arg1) throws Throwable {
        WebElement storeBox=driver.findElement(By.xpath(".//*[@id='edit-store']"));
        Select stores=new Select(storeBox);
        stores.selectByIndex(5);
    }

    @When("^click \"([^\"]*)\" link$")
    public void click_link(String arg1) throws Throwable {
        WebElement couponButton=driver.findElement(By.xpath(".//*[@id='store-select-submit']"));
        couponButton.click();
    }

    @Then("^\"([^\"]*)\" apprar at the top\\.$")
    public void apprar_at_the_top(String arg1) throws Throwable {
        WebElement storeMsg= driver.findElement(By.xpath(".//*[@id='breadcrumb']/div/a[2]"));
        String storeName=storeMsg.getText();
        String expectedStoreName="Jericho";
        Assert.assertEquals(storeName,expectedStoreName);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

}
