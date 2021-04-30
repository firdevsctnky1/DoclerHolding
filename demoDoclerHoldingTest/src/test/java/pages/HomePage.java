package pages;

import logger.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;
import java.util.List;
import java.util.logging.Logger;

public class HomePage extends BasePage {
    public static TestLogger logger = TestLogger.getInstance();
    //*********Constructor*********
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://uitest.duodecadits.com/";

    //*********Page Methods*********

    private  String UITestinID = "site";
    private  String HomeID = "home";
    private  String FormID = "form";
    private  String ErrorID = "error";
    private  String HelloInputID = "hello-input";
    private String HelloTextID="hello-text";
    private String BtnGoID="hello-submit";

    //Go to Homepage
    public void goToDocler() {
        driver.get(baseURL);
        logger.log("Welcome to Docler...");

        String docler = driver.findElement(By.className("ui-test")).getText();
        docler.equals("Welcome to the Docler Holding QA Department");

    }

    public void menuControl() {
        driver.get(baseURL);
        String text1 = driver.findElement(By.id(UITestinID)).getText();
        text1.equals("UI Testing");
        String text2 = driver.findElement(By.id(HomeID)).getText();
        text2.equals("Home");
        String text3 = driver.findElement(By.id(FormID)).getText();
        text3.equals("Form");
        String text4 = driver.findElement(By.id(ErrorID)).getText();
        text4.equals("Error");


    }

    //REQ-UI-03--- REQ-UI-04
    public void HomeControl() {
        driver.get(baseURL);
        driver.findElement(By.id(HomeID)).click();
        sleep(1000);
        String text2 = driver.findElement(By.id(HomeID)).getText();
        text2.equals("Home");
        String status =driver.findElement(By.className("active")).getText();
        status.equals("active");



    }



    //REQ-UI-08
    public void UITestingControl() {
        driver.get(baseURL);
        driver.findElement(By.id(HomeID)).click();
        sleep(1000);
        String text2 = driver.findElement(By.id(HomeID)).getText();
        text2.equals("Home");

        //REQ-UI-09
        String h1 = driver.findElement(By.className("ui-test")).getText();
        h1.equals("Welcome to the Docler Holding QA Department");

        //REQ-UI-10
        String p = driver.findElement(By.className("lead")).getText();
        p.equals("This site is dedicated to perform some exercises and demonstrate automated web testing.");


    }

    public void FormControl() {

        //REQ-UI-05--- REQ-UI-06
        driver.findElement(By.id(FormID)).click();
        sleep(1000);
        String status =driver.findElement(By.className("active")).getText();
        status.equals("active");

        //REQ-UI-11
        String textFormPage = driver.findElement(By.className("ui-test")).getText();
        textFormPage.equals("Simple Form Submission");
        String txtbox= driver.findElement(By.id(HelloInputID)).getText();
        txtbox.equals("You name here...");
        String btnGo= driver.findElement(By.id(BtnGoID)).getText();
        txtbox.equals("Go!");


    }


    //REQ-UI-07
    public void ErrorControl() {
        driver.get(baseURL);
        driver.findElement(By.id(ErrorID)).click();
        sleep(1000);
        String errorMessage =driver.findElement(By.xpath("/html/body/h1")).getText();
        errorMessage.contains("404 Error");


    }


}