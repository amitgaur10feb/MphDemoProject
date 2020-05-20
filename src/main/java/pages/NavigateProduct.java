package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class NavigateProduct {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(NavigateProduct.class);

    private WebDriver driver;

    private WebElement element = null;
    private Properties properties;


    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    private WebElement electronicsTab;

    @FindBy(xpath= "//a[@class='hover'][contains(text(),'Cell phones')]")
    private WebElement cellphonesLink;

    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    private WebElement cellphoneText;

    public NavigateProduct(WebDriver driver, Properties properties) {

        this.driver = driver;
        this.properties = properties;

        AjaxElementLocatorFactory ajaxFactory = new AjaxElementLocatorFactory(driver,
                10);
        PageFactory.initElements(ajaxFactory, this);
    }


    
}
