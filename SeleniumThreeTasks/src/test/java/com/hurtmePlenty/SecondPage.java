package com.hurtmePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPage {
    private WebDriver driver;

    @FindBy(linkText = "Google Cloud Platform Pricing Calculator")
    WebElement firstLink;

    public SecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstResultLink() {
        waitForElementLocatedBy(driver, firstLink).click();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

}
