package com.iCanWin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreatePageResult {
    WebDriver driver;
    @FindBy(className = "paste_box_info")
    List<WebElement> submitResults;

    @FindBy(className = "de1")
    WebElement message;

    @FindBy(className = "paste_box_line2")
    WebElement timeExpiryUser;
    @FindBy(className = "paste_box_line1")
    WebElement userNameUser;

    public CreatePageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUserName() {
        return userNameUser.getText();
    }

    public String getTimeExpiryUser() {
        return timeExpiryUser.getText();
    }

    public String getMessage() {
        return message.getText();
    }

    public int isMessageWasAded() {
        return submitResults.size();
    }
}
