package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class LoginPage {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LoginPage.class);

    private WebDriver driver;

    private WebElement element = null;
    private Properties properties;

    @FindBy(xpath="//input[@id='Email']")
    private WebElement email_txtbox;

    @FindBy(xpath="//input[@id='Password']")
    private WebElement pwd_txtbox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement loginLink;


    public LoginPage(WebDriver driver, Properties properties) {

        this.driver = driver;
        this.properties = properties;

        AjaxElementLocatorFactory ajaxFactory = new AjaxElementLocatorFactory(driver,
                10);
        PageFactory.initElements(ajaxFactory, this);
    }

    public void clickEmailTxtBox_loginPage()

    {
        email_txtbox.sendKeys(properties.getProperty("email"));
    }

    public void enterPwd(){

        pwd_txtbox.sendKeys(properties.getProperty("pwd"));
    }

    public void  clickLogin(){

        loginBtn.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }
}
