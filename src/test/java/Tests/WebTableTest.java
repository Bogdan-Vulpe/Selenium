package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTableTest {


    public WebDriver driver;

    @Test
    public void automationMethod() throws InterruptedException {

        //deschidem un browser de Chrome

        driver =new ChromeDriver();

        //accesam o pagina web
      // driver.get("https://www.gsp.ro/");
           driver.get("https://demoqa.com/");
        Thread.sleep(2000);

        // facem browserul in modeul maximizegit


       //test

        driver.manage().window().maximize();

//        site: gsp
//        WebElement CookiesOverlayPopup=driver.findElement(By.id("onetrust-accept-btn-handler"));
//        CookiesOverlayPopup.click();
//        Thread.sleep(2000);

        // facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,400)");
        Thread.sleep(2000);

        //declaram un element
        WebElement ElementsField=driver.findElement(By.xpath("//h5[text()='Elements']"));
        ElementsField.click();


        WebElement WebTablesField=driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebTablesField.click();

        WebElement AddButtonfield= driver.findElement(By.id("addNewRecordButton"));
        AddButtonfield.click();

        WebElement FirstNameinTable=driver.findElement(By.id("firstName"));
        String FirstNameValue="IonicaInstalatorul";
        FirstNameinTable.sendKeys(FirstNameValue);

//        FirstNameinTable.isSelected();
//        FirstNameinTable.sendKeys("Ionica Instalatorul");

        WebElement LastNameinTable=driver.findElement(By.id("lastName"));
        String lastNameValue="Smecherul";
        LastNameinTable.sendKeys(lastNameValue);

        WebElement EmailTable=driver.findElement(By.id("userEmail"));
        String EmailValue="gigi@gmail.com";
        EmailTable.sendKeys(EmailValue);

        WebElement AgeTable=driver.findElement(By.id("age"));
        String AgeValue="39";
        AgeTable.sendKeys(AgeValue);

        WebElement SalaryTable=driver.findElement(By.id("salary"));
        String SalaryValue="10000";
        SalaryTable.sendKeys(SalaryValue);

        WebElement DepartmentTable=driver.findElement(By.id("department"));
        String DepartmentValue="CIA";
        DepartmentTable.sendKeys(DepartmentValue);

        WebElement Submitelement=driver.findElement(By.id("submit"));
        Submitelement.click();
    }


}
