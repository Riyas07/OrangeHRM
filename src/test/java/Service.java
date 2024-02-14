import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

public class Service {
    public static void loginpage()
    {
        LoginPage.getInstance().login(propertyManager.getInstance().get_username(), propertyManager.getInstance().get_password());
    }
    public static Wait<WebDriver> getWait()
    {
        return  new FluentWait<>(DriverManager.getInstance().getDriver())
              .withTimeout(Duration.ofSeconds(30))
              .pollingEvery(Duration.ofSeconds(5))
              .ignoring(NoSuchElementException.class);

    }
    public static void takeScreenShot()
    {
      TakesScreenshot takeScreenShot =(TakesScreenshot) DriverManager.getInstance().getDriver();
     File from= takeScreenShot.getScreenshotAs(OutputType.FILE);
     File to=new File("src/main/resources/ErrorScreenshot/login.png");
        try {
            FileHandler.copy(from,to);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
