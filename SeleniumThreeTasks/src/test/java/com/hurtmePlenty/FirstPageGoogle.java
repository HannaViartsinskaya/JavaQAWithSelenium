package com.hurtmePlenty;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPageGoogle {
    private WebDriver driver;
    @FindBy(name = "q")
    WebElement searchIcon;

    @FindBy(xpath = "//*[@id='searchbox']/input")
    WebElement searchInput;

    public FirstPageGoogle(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void enterAndSubmitDatatoSearchInput(String data) {
        waitForElementLocatedBy(driver, searchInput).sendKeys(data);
        waitForElementLocatedBy(driver, searchInput).sendKeys(Keys.ENTER);
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }


}
