package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {
    public WebDriver driver;

    @Test
    public void automationMethod() throws InterruptedException {

        //deschidem un browser de Chrome

        driver = new ChromeDriver();

        //accesam o pagina web
        // driver.get("https://www.gsp.ro/");
        driver.get("https://demoqa.com/");
        Thread.sleep(2000);

        // facem browserul in modeul maximizegit
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,400)");
        Thread.sleep(2000);


        WebElement ElementsForm=driver.findElement(By.xpath("//h5[text()='Forms']"));
        ElementsForm.click();

        WebElement ElementPracticeForm= driver.findElement(By.xpath("//span[text()='Practice Form']"));
        ElementPracticeForm.click();


        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,400)");

        WebElement FirstNamePracticeForm= driver.findElement(By.id("firstName"));
        String firstNamevalue="Andrei";
        FirstNamePracticeForm.sendKeys(firstNamevalue);

        WebElement LastNamePracticeForm=driver.findElement(By.id("lastName"));
        String lastNamevalue="Popescu";
        LastNamePracticeForm.sendKeys(lastNamevalue);

        WebElement emailPracticeForm=driver.findElement(By.id("userEmail"));
        String emailvalue="andrei@gmail.com";
        emailPracticeForm.sendKeys(emailvalue);

        WebElement phoneNumberPracticeForm= driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String phonenNumbervalue="0742509972";
        phoneNumberPracticeForm.sendKeys(phonenNumbervalue);

        WebElement uploadPicturePracticeForm=driver.findElement(By.id("uploadPicture"));
       // uploadPicturePracticeForm.sendKeys("src/test/resources/1.PNG"); -inlocuita cu partea de jos
        File file = new File("src/test/resources/1.PNG");
        uploadPicturePracticeForm.sendKeys(file.getAbsolutePath());





    }
}
