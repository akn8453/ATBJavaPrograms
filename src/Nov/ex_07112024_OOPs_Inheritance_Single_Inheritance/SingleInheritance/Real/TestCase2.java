package Nov.ex_07112024_OOPs_Inheritance_Single_Inheritance.SingleInheritance.Real;

public class TestCase2 extends  Common_BaseTest {
    TestCase2 () {
        System.out.println("DC-CHILD");
    }

        void testcase2(){

           startBrowser();
            System.out.println("TC2 start browser");
            closeBrowser();
            readExcelFile();

        }
    }

