import org.junit.jupiter.api.*;

public class ThreadControllerTest {

    //Start up.
    Tuple position = new Tuple(10,10);
    ThreadsController threadsController = new ThreadsController(position);
    @BeforeAll
    public static void setupAll(){
        System.out.println("ThreadControllerTest is Starting");
    }

    // This will show at the beginning of the testcase
    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating the ThreadControllerTest Test Scripts!");
        //Helps initialise the UserObject
        //Start up.
        new Window();
        new KeyboardListener();
    }
    //Actual Test Cases
    @Test
    @DisplayName("Test Pause")
    public void TestPause() {
        threadsController.start();
        threadsController.interrupt();
    }

    @Test
        @DisplayName("Test value all not in snake")
    public void TestedValAllaNotInSnake() {
        threadsController.start();
        threadsController.headSnakePos.ChangeData(threadsController.foodPosition.getX()-1, threadsController.foodPosition.getY());
    }

    //Cleaning up
    @AfterEach
    public void afterEachTest(){
        System.out.println("Just completed a test!");
    }

    @AfterAll
    public static void weAreDoneNow(){
        System.out.println("ThreadControllerTest Testing End");
    }

}
