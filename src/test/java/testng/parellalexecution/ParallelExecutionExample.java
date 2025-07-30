package testng.parellalexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionExample {

    @Test
    public void openEdso(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void openTcs(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void openWipro(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wipro.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void openInfo(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        driver.close();
    }

}
