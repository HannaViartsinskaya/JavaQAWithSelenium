package com.iCanWin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestEnterData {
    private ChromeDriver chromeDriver;
    CreatePagePastebin pagePastebin;
    CreatePageResult pageResult;

    @BeforeTest
    public void setUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://pastebin.com/");
    }

    @Test
    public void enterDataToInputAndSubmit() {
        pagePastebin = new CreatePagePastebin(chromeDriver);
        pagePastebin.createMessage("Hello from WebDriver", "10 Minutes", "helloweb");
        pageResult = new CreatePageResult(chromeDriver);

        Assert.assertTrue((pageResult.getMessage().contains("Hello from WebDriver") && pageResult.getTimeExpiryUser()
                .contains("10 MIN") && pageResult.getUserName().contains("helloweb")), "Information wasn't aded");

    }

    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        chromeDriver.quit();
        chromeDriver = null;
    }

}
