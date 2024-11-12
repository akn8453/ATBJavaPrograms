package Nov.ex_11112024_Encapsulation_Part2.Real;

public class TestCase1 extends  BaseClass{
    TestCase1(){
        super(); //parent constructor -super -means parents
        //this - current object
        System.out.println("DC TC1");
    }

    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }


    public void setBrowser(String browser, boolean isAuth){
        System.out.println("Own Logic");
        super.setBrowser(browser,isAuth);
    }
}
