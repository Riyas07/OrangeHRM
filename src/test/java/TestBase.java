import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class TestBase {

    @BeforeTest
    public void testbase()
    {

      DriverManager.getInstance().setDriver(BrowserManager.getInstance().createBrowserInstance(propertyManager.getInstance().get_browserName()));
    }
    @AfterTest
    public void close_brower()
    {
        DriverManager.getInstance().closeBrowser();
    }
}
