package framework.listeners;

import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
    public TestNGListener(){
        super();
    }
    @SneakyThrows
    @Override
    public void onTestStart(ITestResult iTestResult){

    }
    @SneakyThrows
    @Override
    public void onTestSuccess(ITestResult iTestResult){

    }
    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult result){

    }
    @SneakyThrows
    @Override
    public void onTestSkipped(ITestResult iTestResult){

    }
    @SneakyThrows
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }
    @SneakyThrows
    @Override
    public void onStart(ITestContext context){

    }
    @SneakyThrows
    @Override
    public void onFinish(ITestContext iTestContext){

    }
}
