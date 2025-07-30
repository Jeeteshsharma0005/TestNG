package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"Smoke"})
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login Page");
    }

    @Test(dependsOnGroups = {"Smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify Onboarding");
    }

}
