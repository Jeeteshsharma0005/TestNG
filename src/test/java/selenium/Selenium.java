package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }

}
