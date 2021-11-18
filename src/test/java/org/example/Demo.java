package org.example;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
    ExtentReports extentReports;

    @BeforeTest
    public void config() {
        //ExtentReports, ExtentSparkReporter
//        String path = System.getProperty("user.dir") + "\\report\\index.html";
        String path = "//Users//slobodanivanov//Documents//GitHubBitbar//MavenUdemy//reports//index.html";
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
        reporter.config().setReportName("Web automation results");
        reporter.config().setDocumentTitle("Test Results");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Tester", "Rahul Shetty");
    }

    @Test
    public void initialDemo() {
        ExtentTest test = extentReports.createTest("Initial Demo");

        System.setProperty("webdriver.chrome.driver", "//Users//slobodanivanov//Documents//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/#/index");
        System.out.println(driver.getTitle());
        driver.quit();

        extentReports.flush();

    }
}
