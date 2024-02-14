import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserManager {
    private BrowserManager()
    {

    }
    private static BrowserManager manager=new BrowserManager();
    public static BrowserManager getInstance()
    {
        return manager;
    }
    public WebDriver createBrowserInstance(String browser)
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
            return new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            EdgeOptions options=new EdgeOptions();
            options.addArguments("start-maximized");
            // options.addArguments("--headless");
            options.addArguments("disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("--disable-extensions");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-infobars");
            return new EdgeDriver(options);
        }
        return null;
    }
}
