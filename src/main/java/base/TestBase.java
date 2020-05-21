package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import utils.FileUtils;
import utils.SeleniumUtils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties properties;
    public static WebDriver driver;
    public static SeleniumUtils seleniumUtils;

    public static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite(alwaysRun = true)

    public void setUp(ITestContext context) throws IOException {

        FileUtils fileUtils = new FileUtils();

        properties = fileUtils.readPropsFile(Constants.PROPERTIES_DIR + "config.properties");

        context.getSuite().getName();
        initWebdriver();
        seleniumUtils = new SeleniumUtils();
        urlLaunch();
        }

    public WebDriver getWebDriver()
        {
        WebDriver driver = null;
        String browser =getBrowser();

        switch (browser){
            case Constants.CHROME:
            System.setProperty("webdriver.chrome.driver", Constants.DRIVER_DIR + Constants.CHROME_DRIVER_NAME);
            driver = new ChromeDriver();
            break;
            case Constants.FIREFOX:
                //logger.info("Launching firefox");
                System.setProperty("webdriver.gecko.driver",
                Constants.DRIVER_DIR + Constants.GECKO_DRIVER_NAME);
                driver = new FirefoxDriver();
                break;

            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
    }

    public String getBrowser(){

        String browser =System.getProperty(Constants.CHROME);
        if (null==browser){
            return Constants.CHROME;
        }
        return browser;
    }

    public void initWebdriver ()
    {

    driver = getWebDriver();
    }

    public void urlLaunch()

    {
        driver.get(properties.getProperty("url"));
    }

}
