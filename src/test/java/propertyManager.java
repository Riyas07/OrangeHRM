import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertyManager {
    private static propertyManager manager;
    private static Properties properties;
    private propertyManager()
    {
        try {
         InputStream   inputStream=new FileInputStream("src/main/resources/config.properties");
         properties=new Properties();
         properties.load(inputStream);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static propertyManager getInstance()
    {
        if (manager==null)
        {
            manager=new propertyManager();
            return manager;
        }
        else {
            return manager;
        }
    }
    public String get_Baseurl()
    {
        return properties.getProperty("base_url");
    }
    public String get_browserName()
    {
        return properties.getProperty("browser");
    }
    public String get_username()
    {
        return properties.getProperty("username");
    }
    public String get_password()
    {
        return properties.getProperty("password");
    }
}
