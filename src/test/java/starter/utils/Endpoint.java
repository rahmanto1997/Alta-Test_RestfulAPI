package starter.utils;

public class Endpoint {
    public String BASE_URL = "https://demoqa.com";
    public String LOGIN = BASE_URL+"/Account/v1/Login";
    public String REGISTER = BASE_URL+"/Account/v1/User";
    public String GENERATE = BASE_URL+"/Account/v1/GenerateToken";
    public String AUTH = BASE_URL+"/Account/v1/Authorized";
    public String GETUSERID = BASE_URL+"/Account/v1/User/";
    public String DELETEUSER = BASE_URL+"/Account/v1/User/";
    public String GETALLBOOKS = BASE_URL+"/BookStore/v1/Books";
    public String POSTBOOKS = BASE_URL+"/BookStore/v1/Books";
    public String DELETEALLBOOK = BASE_URL+"/BookStore/v1/Books?UserId=";
    public String GETABOOKS = BASE_URL+"/BookStore/v1/Book?ISBN=";
    public String PUTBOOK = BASE_URL+"/BookStore/v1/Books/";
    public String DELETEABOOK = BASE_URL+"/BookStore/v1/Book";
}