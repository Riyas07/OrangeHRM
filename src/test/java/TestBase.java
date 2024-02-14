import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
