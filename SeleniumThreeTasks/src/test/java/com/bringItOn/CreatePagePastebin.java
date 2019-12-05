package com.bringItOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatePagePastebin {
    private WebDriver driver;

    @FindBy(id = "paste_code")
    WebElement subjectInput;

    @FindBy(name = "paste_format")
    WebElement statusSyntaxSelect;

    @FindBy(name = "paste_expire_date")
    WebElement statusExpirationSelect;

    @FindBy(name = "paste_private")
    WebElement statusPasteExposureSelect;

    @FindBy(name = "paste_name")
    WebElement nameInput;

    @FindBy(xpath = "//*[@value='Create New Paste']")
    WebElement submitBtn;


    public CreatePagePastebin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSubject(String subject) {
        subjectInput.sendKeys(subject);
    }

    public void setExpiyDate(String status) {
        Select statusDropdown = new Select(statusExpirationSelect);
        statusDropdown.selectByVisibleText(status);
    }

    public void setLanguage(String language) {
        Select statusDropdown = new Select(statusSyntaxSelect);
        statusDropdown.selectByVisibleText(language);
    }

    public void setPrivacy(String privacy) {
        Select statusDropdown = new Select(statusPasteExposureSelect);
        statusDropdown.selectByVisibleText(privacy);
    }

    public void setName(String name) {
        nameInput.sendKeys(name);
    }

    public void submitClick() {
        submitBtn.click();
    }


    public void createMessage(String subj, String syntax, String date, String name) {
        this.setSubject(subj);
        this.setLanguage(syntax);
        this.setExpiyDate(date);
        this.setName(name);
        this.submitClick();
    }


}
