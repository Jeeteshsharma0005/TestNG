package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failtestrun.FailExecution;

public class Priority {

    @Test(priority = 'A', enabled = true)
    public void testCaseZ(){
        System.out.println("Test Case 1");
    }

    @Test(priority = 2)
    public void testCaseH(){
        System.out.println("Test Case 2");
    }

    @Test(priority = 3, groups = "smoke")
    public void testCaseX(){
        System.out.println("Test Case 3X");
    }

    @Test(priority = 3)
    public void testCaseS(){
        System.out.println("Test Case 3S");
    }

    @Test(priority = 4)
    public void testCaseA(){
        System.out.println("Test Case 4");
    }

    @Test(priority = 5,  groups = "smoke")
    public void testCaseC(){
        System.out.println("Test Case 5");
    }

    @Test(priority = -5)
    public void testCaseE(){
        System.out.println("Test Case -5");
    }

    @Test(priority = 'a', groups = "smoke")
    public void testCasea(){
        Assert.assertTrue(false);
        System.out.println("Test Case a");
    }

}
