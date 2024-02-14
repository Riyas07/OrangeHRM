import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
   @FindBy(xpath = "(//input)[3]")
    private WebElement password_txtBox;
    @FindBy(xpath = "//button//parent::div")
    private WebElement button;
    LoginPage()
    {
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);System.out.println("Login page : "+Thread.currentThread().threadId());
    }
    public static LoginPage getInstance()
    {
        return new LoginPage();
    }

    public void login(String username,String password)
    {
        Service.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input)[2]")))
                .sendKeys(username);
        password_txtBox.sendKeys(password);
        button.click();
    }
}
