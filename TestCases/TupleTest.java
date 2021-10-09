import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {

    //Start up.
    private Tuple tupleObject;

    // This will show at the beginning of the testcase
    @BeforeAll
    public static void setupAll(){
        System.out.println("TupleTest is Starting");
    }

    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating the Tuple Test Scripts!");
        //Helps initialise the UserObject
        tupleObject = new Tuple(1, 1);
    }
    //Actual Test Cases
    @Test
    @DisplayName("Change x and y values")
    public void ChangeData(){
        System.out.println("I am Changing the value in Tuple Test Scripts!");
        //Helps initialise the UserObject
        tupleObject.ChangeData(1, 1);
    }

    @Test
    @DisplayName("Set value for x and return")
    public void TestDataX(){
        assertEquals(1, tupleObject.getX());
    }
    @Test
    @DisplayName("Set value for y and return")
    public void TestDataY(){
        assertEquals(1, tupleObject.getY());
    }
    @Test
    @DisplayName("Set value for XF and return")
    public void TestDataXf(){
        assertEquals(0, tupleObject.getXf());
    }

    @Test
    @DisplayName("Set value for YF and return")
    public void TestDataYf(){
        assertEquals(0, tupleObject.getYf());
    }

    //Cleaning up
    @AfterEach
    public void afterEachTest(){
        System.out.println("Just completed a test!");
    }

    @AfterAll
    public static void weAreDoneNow(){
        System.out.println("TupleTest Testing End");
    }
}