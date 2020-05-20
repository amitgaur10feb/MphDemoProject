import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class Practice1_RegisterAndLogin extends TestBase {
    String male;
    String Test1;
    String Test2;



    @Test(priority=1)
    public void registrationTest() throws InterruptedException {

        RegistrationPage regPage = new RegistrationPage(driver, properties);
        regPage.clickRegistrationLink();
        logger.info("Register Page is opened");
        regPage.selectGenderBtn("male");
        regPage.personalInfo();
        logger.info("personal info filled");
        regPage.createPassword();
        regPage.clickRegister_Btn();
        logger.info("User register successfully");
        String actualmsg = regPage.readSuccessMsg();
        String expectedMsg = "Your registration completed";
        Assert.assertEquals(actualmsg, expectedMsg);
        Thread.sleep(5);
        regPage.clickLogoutLink();
    }

    @Test(priority=2)

    public void loginTest(){

        LoginPage loginPage = new LoginPage(driver, properties);
        loginPage.clickLoginLink();
        loginPage.clickEmailTxtBox_loginPage();
        loginPage.enterPwd();
        loginPage.clickLogin();

    }

    public void exit_browser()

    {
        driver.close();
    }
}
