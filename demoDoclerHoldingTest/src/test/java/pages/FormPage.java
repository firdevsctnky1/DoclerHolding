package pages;

import logger.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage extends BasePage {
    public static TestLogger logger = TestLogger.getInstance();

    public FormPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private  String FormID = "form";
    private  String HelloInputID = "hello-input";
    private String HelloTextID="hello-text";
    private String BtnGoID="hello-submit";
    private String Name1= "John";
    private String Name2= "Sophia";
    private String Name3= "Charlie";

    //REQ-UI-12
    public void FormInputControl() {

        driver.findElement(By.id(FormID)).click();
        sleep(2000);
        driver.findElement(By.id(HelloInputID)).sendKeys(Name1);
        driver.findElement(By.id(BtnGoID)).click();
        String txtControl= driver.findElement(By.id(HelloTextID)).getText();
        txtControl.equals("Hello"+" "+ Name1+"!");




    }
}
