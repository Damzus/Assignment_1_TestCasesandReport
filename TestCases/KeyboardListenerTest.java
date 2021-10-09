import org.junit.jupiter.api.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardListenerTest extends Component {

    //Start up.
    private Window windowObject;
    private KeyboardListener KeyboardListenerObject;

    // This will show at the beginning of the testcase
    @BeforeEach
    public void setup(){
        System.out.println("I am Instantiating KeyboardListener Test Scripts!");
        //Helps initialise the UserObject
        windowObject = new Window();
        KeyboardListenerObject = new KeyboardListener();
    }

    //Actual Test Cases
    @Test
    @DisplayName("Test for Pressing Any key")
    public void KeyPressingForAnyKey() {
        KeyEvent key = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_1, '1');
        KeyboardListenerObject.keyPressed(key);
    }

    @Test
    @DisplayName("Test for Pressing Right")
    public void KeyPressingForRight(){
        KeyEvent key = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_R, 'R');
        KeyboardListenerObject.keyPressed(key);

        KeyEvent key_r = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'A');
        KeyboardListenerObject.keyPressed(key_r);

    }

    @Test
    @DisplayName("Test for Pressing Up")
    public void KeyPressingForUp(){
        KeyEvent key = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'U');
        KeyboardListenerObject.keyPressed(key);

    }
    @Test
    @DisplayName("Test for Pressing Down")
    public void KeyPressingForDown(){
        KeyEvent key = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'D');
        KeyboardListenerObject.keyPressed(key);

    }

    @Test
    @DisplayName("Test for Pressing Left")
    public void KeyPressingForLeft(){
        KeyEvent key_u = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'U');
        KeyboardListenerObject.keyPressed(key_u);

        KeyEvent key_l = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'L');
        KeyboardListenerObject.keyPressed(key_l);

        KeyEvent key_left = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'L');
        KeyboardListenerObject.keyPressed(key_left);

        KeyEvent key_end = new KeyEvent(windowObject, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_END, 'E');
        KeyboardListenerObject.keyPressed(key_end);


    }

    //Cleaning up
    @AfterEach
    public void afterEachTest(){
        System.out.println("Just completed a test!");
    }

    @AfterAll
    public static void weAreDoneNow(){
        System.out.println("KeyboardListenerTest Testing End");
    }

}