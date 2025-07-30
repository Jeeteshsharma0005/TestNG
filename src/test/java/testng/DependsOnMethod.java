package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(description = "Verify login with a valid username & password")
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login Page");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnBoarding(){
        System.out.println("Verify Onboarding");
    }

}
