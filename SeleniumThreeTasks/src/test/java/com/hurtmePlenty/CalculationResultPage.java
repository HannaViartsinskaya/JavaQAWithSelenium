package com.hurtmePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationResultPage {
    private WebDriver driver;

    @FindBy(id = "compute")
    WebElement result;
    @FindBy(xpath = "//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b")
    WebElement totalPrice;

    public CalculationResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getResultText() {
        return result.getText();
    }

    public String getPrice() {
        return totalPrice.getText();
    }
}
