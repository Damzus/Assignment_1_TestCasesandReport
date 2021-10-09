import org.junit.jupiter.api.*;

import javax.swing.*;

public class MainTest {

    //Start up.
    Main mainObject;
    Window windowObject;

    // This will show at the beginning of the testcase
    @BeforeAll
    public static void setupAll(){
        System.out.println("I should be printed before all the tests commence!");
    }

    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating the Main Test Scripts!");
        //Helps initialise the UserObject
        mainObject = new Main();
        windowObject = new Window();

    }

    //Actual Test Cases
    @Test
    public void TestWindowSettings(){
        windowObject.setTitle("Snake");
        windowObject.setSize(500, 500);
        windowObject.setVisible(true);
        windowObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.main(null);
    }

    //Cleaning up
    @AfterEach
    public void afterEachTest(){
        System.out.println("Just completed a test!");
    }

    @AfterAll
    public static void weAreDoneNow(){
        System.out.println("MainTest Testing End");
    }


}