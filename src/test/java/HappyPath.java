import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class HappyPath extends TestBase{
    @Test
    public void login() throws AWTException, IOException {
      DriverManager.getInstance().getDriver().get(propertyManager.getInstance().get_Baseurl()+Endpoints.getInstance().get_login_endpoint());
        System.out.println("happy path : "+Thread.currentThread().threadId());
        LoginPage.getInstance().login(propertyManager.getInstance().get_username(), propertyManager.getInstance().get_password());
      HomePage.getInstance().validate_profile();
        Actions actions=new Actions(null);
//        Robot robot=new Robot();
//     Dimension dimension=   Toolkit.getDefaultToolkit().getScreenSize();
//     Rectangle rectangle=new Rectangle(dimension);
//   BufferedImage image= robot.createScreenCapture(rectangle);
//        ImageIO.write(image,"png",new File(""));
    }
}
