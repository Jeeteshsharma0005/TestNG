package testng;

import org.testng.annotations.Test;

public class TestNgAttribute {

    @Test(invocationCount = 100, invocationTimeOut = 100000)
    public void attributeExample(){
        System.out.println("TestNG Attribute");
    }

}
