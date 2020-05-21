package utils;

import org.intellij.lang.annotations.Identifier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class SeleniumUtils {

    private static final Logger logger = LoggerFactory.getLogger(SeleniumUtils.class);

    public SeleniumUtils() {

    }

    public void moveToElementClick (WebDriver driver, WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    public void moveToElement (WebDriver driver, WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }
}
