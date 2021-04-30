package tests;

import org.testng.annotations.Test;
import pages.FormPage;
import pages.HomePage;


public class DoclerTest extends BaseTest {


    @Test
    public void DoclerTest() throws InterruptedException {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver, wait);
        FormPage formPage = new FormPage(driver, wait);

        //*************PAGE Methods********************
        //Open Docler HomePage
        homePage.goToDocler();
        homePage.menuControl();




    }

    @Test
    public void HomeTest() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        homePage.goToDocler();
        homePage.menuControl();

    }

    @Test
    public void MenuHomeTest() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        homePage.menuControl();
        homePage.HomeControl();
        homePage.UITestingControl();
        homePage.FormControl();
        homePage.ErrorControl();

    }

    @Test
    public void FormControl() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        FormPage formPage =  new FormPage(driver , wait);
        homePage.goToDocler();
        formPage.FormInputControl();


    }
}