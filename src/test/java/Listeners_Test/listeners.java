package Listeners_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Baseclass.BaseClass;
import Utils.extentReportManager;

public class listeners extends BaseClass implements ITestListener {

    private ExtentReports extent = extentReportManager.getReporter();
    private ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("TEST STARTED: " + result.getName());
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, "Test Passed Successfully");
        System.out.println("TEST PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());

        BaseClass base = (BaseClass) result.getInstance();
        WebDriver driver = base.driver;

        try {
            String path = base.getScreenshort(result.getMethod().getMethodName(), driver);
            extentTest.get().addScreenCaptureFromPath(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("TEST FAILED: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.get().log(Status.SKIP, "Test Skipped");
        System.out.println("⚠ TEST SKIPPED → " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("====== SUITE STARTED ======");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println("====== SUITE FINISHED ======");
    }
}
