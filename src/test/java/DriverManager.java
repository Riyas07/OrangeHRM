import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static   DriverManager driverManager=new DriverManager();
    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    private DriverManager()
    {

    }

    public static DriverManager getInstance()
    {
        return driverManager;
    }
    public void setDriver(WebDriver driverParam)
    {
        driver.set(driverParam);
    }
    public WebDriver getDriver()
    {
        return driver.get();
    }
    public void closeBrowser()
    {
        driver.get().quit();
        driver.remove();
    }
}
