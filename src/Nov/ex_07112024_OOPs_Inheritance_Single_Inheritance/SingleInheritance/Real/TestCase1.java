package Nov.ex_07112024_OOPs_Inheritance_Single_Inheritance.SingleInheritance.Real;

public class TestCase1 extends Common_BaseTest {

    TestCase1(){
        System.out.println("DC-CHILD");
    }
    void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }

}
