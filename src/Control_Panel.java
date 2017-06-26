import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

/**
 * Created by m on 24.06.2017.
 */
public class Control_Panel extends JFrame{


    public static int direction=5;
    Control_Panel cp;

    Control_Panel() {

        super("ESP8266");
        //System.out.println("iiii");

        cp = this;




        setSize(300, 200);
        this.setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

/*
    keys servo 1  -  37 39
    keys servo 2  -  87  83
    keys servo 3  -  65  68
    keys servo 4   - 38  40
*/

        this.addKeyListener(new KeyListener() {


            public void keyTyped(KeyEvent keyEvent) {


            }


            @Override
            public void keyPressed(KeyEvent keyEvent) {

                direction = keyEvent.getKeyCode();
              //  System.out.println(direction*10);

            }


            @Override
            public void keyReleased(KeyEvent keyEvent) {
            }
        });
    }
}