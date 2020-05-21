import base.TestBase;
import org.testng.annotations.Test;
import pages.NavigateProduct;
import utils.SeleniumUtils;

public class Practice2_NavigateToProduct extends TestBase {


    @Test()

    public void navigateToCellphones(){



        NavigateProduct navigateCellPhone= new NavigateProduct(driver, properties, seleniumUtils);
        navigateCellPhone.hoverMouseToElectronicsLink();
        navigateCellPhone.clickCellphones();

    }


}
