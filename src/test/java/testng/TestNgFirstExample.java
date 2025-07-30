package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgFirstExample {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp (){
         driver = new ChromeDriver();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void verifyEdsoServices() throws InterruptedException{
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test (groups = "smoke")
    public void verifyTcs() throws InterruptedException{
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void verifyInfosys() throws InterruptedException{
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

}
