import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class UnhappyPath extends TestBase{
    @Test
    public void login()
    {
       WebDriver driver= DriverManager.getInstance().getDriver();
       driver.get(propertyManager.getInstance().get_Baseurl()+Endpoints.getInstance().get_login_endpoint());
        System.out.println("unhappy path : "+Thread.currentThread().threadId());
        LoginPage.getInstance().login("riyas","riyas");
//        TakesScreenshot takeScreenShot =(TakesScreenshot) driver;
//        File from= takeScreenShot.getScreenshotAs(OutputType.FILE);
//        File to=new File("src/main/resources/screenShot/loginerror.png");
//        try {
//            FileHandler.copy(from,to);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
      String errortxt=  Service.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Invalid credentials']")))
                .getText();
       if (errortxt.equalsIgnoreCase("Invalid credentials"))
       {
           try {
               Robot robot=new Robot();
               Dimension dimension= Toolkit.getDefaultToolkit().getScreenSize();
               Rectangle rectangle=new Rectangle(dimension);
               BufferedImage img= robot.createScreenCapture(rectangle);
               File f=new File("src/main/resources/screenShot/loginerror.png");
               ImageIO.write(img,"png", f);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
       }
    }
}
