import org.testng.annotations.Test;


public class HappyPath extends TestBase{
    @Test
    public void login()
    {
      DriverManager.getInstance().getDriver().get(propertyManager.getInstance().get_Baseurl()+Endpoints.getInstance().get_login_endpoint());
        System.out.println("happy path : "+Thread.currentThread().threadId());
        LoginPage.getInstance().login(propertyManager.getInstance().get_username(), propertyManager.getInstance().get_password());
      HomePage.getInstance().validate_profile();
    }
}
