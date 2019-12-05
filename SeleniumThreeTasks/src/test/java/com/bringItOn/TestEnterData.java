package com.bringItOn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEnterData {
    private ChromeDriver chromeDriver;
    CreatePagePastebin pagePastebin;
    CreatePageResult pageResult;
    String newPastetext = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";

    String pasteName = "how to gain dominance among developers";

    @BeforeClass
    public void setUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://pastebin.com/");

    }


    @Test(description = "Test for check input textField, syntaxType, timeOfExpiry and Name")
    public void enterDataToInputAndSubmit() {
        pagePastebin = new CreatePagePastebin(chromeDriver);

        pagePastebin.createMessage(newPastetext, "Bash", "10 Minutes", pasteName);
        pageResult = new CreatePageResult(chromeDriver);
        Assert.assertTrue((pageResult.getMessage().contains(newPastetext) && chromeDriver.getTitle().contains(pasteName)
                && chromeDriver.getTitle().contains("Bash")), "Information wasn't aded message");
    }


    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        chromeDriver.quit();

        chromeDriver = null;
    }

}
