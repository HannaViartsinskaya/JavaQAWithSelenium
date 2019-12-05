package com.hurtmePlenty;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ThirdPageCalculator {
    private WebDriver driver;

    @FindBy(id = "myFrame")
    WebElement frame;
    @FindBy(id = "input_53")
    WebElement quantityOfInstance;
    @FindBy(id = "select_76")
    WebElement machineType;
    @FindBy(tagName = "md-checkbox")
    WebElement checkbox;
    @FindBy(id = "select_348")
    WebElement numberOfGPUs;
    @FindBy(id = "select_350")
    WebElement GPUType;
    @FindBy(id = "select_78")
    WebElement localSSD;
    @FindBy(id = "select_80")
    WebElement dataCenterLocation;
    @FindBy(id = "select_85")
    WebElement comittedUsage;
    @FindBy(xpath = "//button[@ng-click='listingCtrl.addComputeServer(ComputeEngineForm);']")
    WebElement submit;
    @FindBy(id = "select_container_77")
    WebElement machineTypeContainer;
    @FindBy(id = "select_container_351")
    WebElement GPUTypeContainer;
    @FindBy(id = "select_container_79")
    WebElement localSSDContainer;
    @FindBy(id = "select_container_81")
    WebElement dataCenterContainer;
    @FindBy(id = "select_container_86")
    WebElement comittedUsageContainer;

    public ThirdPageCalculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void switchToFrame() {
        driver.switchTo().frame(frame);
    }

    public void setQuantity(int quantity) {
        quantityOfInstance.sendKeys(quantity + "");
    }

    public void setMachineType(String machineTypeRequired) {
        waitForElementLocatedBy(driver, machineType).click();

        webElementFromSelectEqualsToRequired(getElementsInMdSelect(machineTypeContainer), machineTypeRequired).click();
    }

    public void checkBoxTrue() {
        checkbox.click();
    }

    public void setNumberOfGPUs(int number) {
        waitForElementLocatedBy(driver, numberOfGPUs).sendKeys(number + "");
    }

    public void setGPUType(String gpuRequired) {
        waitForElementLocatedBy(driver, GPUType).click();

        waitForElementLocatedBy(driver, webElementFromSelectEqualsToRequired(getElementsInMdSelect(GPUTypeContainer), gpuRequired)).click();
    }

    public void setLocalSSD(String ssdRequired) {
        waitForElementLocatedBy(driver, localSSD).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(localSSDContainer));
        waitForElementLocatedBy(driver, webElementFromSelectEqualsToRequired(getElementsInMdSelect(localSSDContainer), ssdRequired)).click();
    }

    public void setDataCenterLocation(String locationRequired) {
        waitForElementLocatedBy(driver, dataCenterLocation).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(dataCenterContainer));
        waitForElementLocatedBy(driver, webElementFromSelectEqualsToRequired(getElementsInMdSelect(dataCenterContainer), locationRequired)).click();
        //waitForElementLocatedBy(driver, dataCenterLocationRequired).click();
    }

    public void setComittedUsage(String termRequired) {
        waitForElementLocatedBy(driver, comittedUsage).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(comittedUsageContainer));
        webElementFromSelectEqualsToRequired(getElementsInMdSelect(comittedUsageContainer), termRequired).click();
        //waitForElementLocatedBy(driver, comittedUsageRequired).click();
    }

    public void submitInformation() {
        waitForElementLocatedBy(driver, submit).click();
    }

    public void sendAllInformation(int quantity, String machineType, int numberGPU, String gpuType,
                                   String localSSD, String dataCenterLocation, String comittedUsage) {
        this.setQuantity(quantity);
        this.setMachineType(machineType);
        this.checkBoxTrue();
        this.setNumberOfGPUs(numberGPU);
        this.setGPUType(gpuType);
        this.setLocalSSD(localSSD);
        this.setDataCenterLocation(dataCenterLocation);
        this.setComittedUsage(comittedUsage);
        this.submitInformation();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }


    public static List<WebElement> getElementsInMdSelect(WebElement mdSelect) {
        List<String> selectionStrings = new ArrayList<>();
        WebElement contentElement = mdSelect.findElement(By.tagName("md-content"));
        List<WebElement> contentDivs = contentElement.findElements(By.tagName("div"));
        return contentDivs;
    }

    public static WebElement webElementFromSelectEqualsToRequired(List<WebElement> all, String whatYouNeed) {
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getText().equals(whatYouNeed)) {
                //return i;
                return all.get(i);
            }
        }
        return all.get(0);
    }
}
