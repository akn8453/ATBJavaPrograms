package Nov.ex_17112024_Static_Wraper_Exceptions;

public enum APIConstantEndpoint {

BASE_URL("https://app.vwo.com"),
LOGIN_PAGE("https://app,vwo.com/login"),
DASHBOARD_PAGE("https://app.vwo.com/dashboar"),
CHATBOT_PAGE("https://app.vwo.com/chat");



    private String name;

    APIConstantEndpoint(String name)
    {
        this.name = name;
    }

    String getValue(){
        return name;
    }
}
