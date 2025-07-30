package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

    @Test
    public void verifySauceDemoApplication() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        WebElement swagLabs = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assert.assertFalse(swagLabs.isDisplayed(), "Swag Lab Element Should Be Displayed");

        WebElement productsElement = driver.findElement(By.xpath("//span[text()='Products']"));
        Assert.assertTrue(productsElement.isDisplayed(), "Product Element Should Be Displayed");
        //Assert.assertEquals(productsElement.isDisplayed(), "Product Element Should Be Displayed");

        driver.close();

    }

}
