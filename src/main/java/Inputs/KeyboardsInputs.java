package Inputs;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardsInputs implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("Its double You");
                break;
            case KeyEvent.VK_A:
                break;
            case KeyEvent.VK_S:
                break;
            case KeyEvent.VK_D:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: handle key release events
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Optional: handle key typed events

    }
}
