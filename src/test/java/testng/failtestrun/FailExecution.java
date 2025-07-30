package testng.failtestrun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailExecution implements IRetryAnalyzer {

    int reRun = 0;
    int maxRun = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (reRun < maxRun){
            reRun++;
            return true;
        }
        return false;
    }

}
