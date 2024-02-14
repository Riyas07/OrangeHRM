public class Endpoints {
    private static Endpoints endpoints;
    private String login="/web/index.php/auth/login";
    private Endpoints()
    {
    }
    public static Endpoints getInstance()
    {
        if (endpoints==null)
        {
            endpoints=new Endpoints();
            return endpoints;
        }
        else
        {
            return endpoints;
        }
    }
    public String get_login_endpoint()
    {
        return login;
    }


}
