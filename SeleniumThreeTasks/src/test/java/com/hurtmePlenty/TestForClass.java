package com.hurtmePlenty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestForClass {
    private ChromeDriver driver;
    private FirstPageGoogle firstPageGoogle;
    private SecondPage secondPage;
    private ThirdPageCalculator thirdPageCalculator;
    private CalculationResultPage calculationResultPage;
    static String vmClass = "regular";
    static String instanceType = "n1-standard-8";
    static String region = "Frankfurt";
    static String ssdSpace = "2x375 GB";
    static String comUsage = "1 Year";
    static String totalPrice = "USD 1,082.77";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        this.driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void testfirst() {
        firstPageGoogle = new FirstPageGoogle(driver);
        firstPageGoogle.clickSearchIcon();
        firstPageGoogle.enterAndSubmitDatatoSearchInput("Google Cloud Platform Pricing Calculator");
        secondPage = new SecondPage(driver);
        secondPage.clickFirstResultLink();
        thirdPageCalculator = new ThirdPageCalculator(driver);
        thirdPageCalculator.switchToFrame();
        thirdPageCalculator.sendAllInformation(4, "n1-standard-8 (vCPUs: 8, RAM: 30GB)",
                1, "NVIDIA Tesla V100", "2x375 GB", "Frankfurt (europe-west3)",
                "1 Year");
        calculationResultPage = new CalculationResultPage(driver);
        String resultStr = calculationResultPage.getResultText();
        String price = calculationResultPage.getPrice();
        System.out.println(price);
        System.out.println(resultStr);
        Assert.assertTrue(resultStr.contains(vmClass) && resultStr.contains(instanceType) && resultStr.contains(region) &&
                resultStr.contains(instanceType) && resultStr.contains(ssdSpace) && resultStr.contains(comUsage)
                && price.contains(totalPrice));

    }

    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

}
