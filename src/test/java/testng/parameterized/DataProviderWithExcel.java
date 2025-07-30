package testng.parameterized;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

    private String filePath;

    @DataProvider(name = "test-data")
    public Object[][] dataFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\DataProvider.xlsx", "TestData");
        return arrObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) throws IOException {
        // file data one by one fatch karne ke liye...

        FileInputStream fs = new FileInputStream(filePath);  // Normal file accessed
        // XSSFWorkbook class provided by apache poi api
        XSSFWorkbook wk = new XSSFWorkbook(fs);  // excel file Accessed
        XSSFSheet sheet = wk.getSheet(sheetName);  // For sheet Accessing,

        XSSFRow row = sheet.getRow(0);
        int NoOfRows = sheet.getPhysicalNumberOfRows();
        int NoOfCol = row.getLastCellNum();

        Cell cell;

        String[][] data = new String[NoOfRows-1][NoOfCol];

        for (int i = 1; i < NoOfRows - 1; i++){
            for (int j = 0; j < NoOfCol; j++){
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;

    }

    @Test(dataProvider = "test-data")
    public void searchDataOnGoogle(String courseName, String cityName) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName+ " " +cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }

}
