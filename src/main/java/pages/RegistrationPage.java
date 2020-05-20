package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class RegistrationPage {

    public static final Logger logger = LoggerFactory.getLogger(RegistrationPage.class);

    private WebDriver driver;

    private  Properties properties;

    private WebElement element = null;


    @FindBy(xpath = "//a[@class='ico-register']")
    private WebElement registrationLink;

    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement maleRadiobtn;

    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement femaleRadiobtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstName_textbox;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastName_textbox;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement email_textbox;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password_textbox;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement confirmPwd_Textbox;

    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement registerBtn;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement registrationSuccessMsg;

    @FindBy(xpath = "//a[@class='ico-logout']")
    private  WebElement logOutLink;

    public RegistrationPage(WebDriver driver, Properties properties) {

        this.driver = driver;
        this.properties = properties;

        AjaxElementLocatorFactory ajaxFactory = new AjaxElementLocatorFactory(driver,
                10);
        PageFactory.initElements(ajaxFactory, this);
    }


    public void clickRegistrationLink(){

        registrationLink.click();
    }

    public void selectGenderBtn(String value){

        if (value.equalsIgnoreCase("male")){
            maleRadiobtn.click();
        } else if (value.equalsIgnoreCase("female")){
            femaleRadiobtn.click();
        }

    }

    public void personalInfo(){
        firstName_textbox.sendKeys(properties.getProperty("firstName"));

        lastName_textbox.sendKeys(properties.getProperty("lastName"));
        email_textbox.sendKeys(properties.getProperty("email"));
    }

    public void createPassword(){
        password_textbox.sendKeys(properties.getProperty("pwd"));
        confirmPwd_Textbox.sendKeys(properties.getProperty("cfm_pwd"));
    }

    public void clickRegister_Btn(){

        registerBtn.click();
    }

    public String readSuccessMsg(){

        String msg= registrationSuccessMsg.getText();
        return msg;

    }

    public void clickLogoutLink(){
        logOutLink.click();
    }


}
