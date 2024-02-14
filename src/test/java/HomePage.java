import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage {
    HomePage()
    {

    }
    public static HomePage getInstance()
    {
        return new HomePage();
    }
    public void validate_profile()
    {
       String imgNW= Service.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='app']//img)[3]")))
                .getAttribute("naturalWidth");
        System.out.println("natiral width = "+imgNW);
        if (!imgNW.equalsIgnoreCase("0"))
        {
            System.out.println("image is not broken");
        }
        else {
            System.out.println("image is broken");
        }
       String username= DriverManager.getInstance().getDriver().findElement(By.className("oxd-userdropdown-name")).getText();
        System.out.println(username);
    }
}
