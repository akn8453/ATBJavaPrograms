package Nov.ex_11112024_Encapsulation_Part2.Real;

public class BaseClass {

    // instance variable should be private only.
    // Never ever share the instance variable

    private String browser;

    BaseClass (){
        System.out.println("DC-BaseClass");
    }

    BaseClass(String b){
        System.out.println("CC-BaseClass");
    }

    //getter setter
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth) {
            this.browser = browser;
        }else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser");
    }

    void openBrowser(String browserName){
        System.out.println("Opening Browser! ->" + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser");
    }


}

