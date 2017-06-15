/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midistubdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;

/**
 *
 * @author sbt-yukhnovskiy-ia
 */
public class MidiStubDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            try {
                Robot robot = new Robot();

                robot.keyPress(KeyEvent.VK_LEFT);
                sleep(500);
                robot.keyRelease(KeyEvent.VK_LEFT);
                sleep(5000);
                robot.keyPress(KeyEvent.VK_RIGHT);
                sleep(500);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                sleep(5000);
            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

}
