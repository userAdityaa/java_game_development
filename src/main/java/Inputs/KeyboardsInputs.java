package Inputs;

import com.sun.security.jgss.GSSUtil;
import org.example.Game;
import org.example.GamePanel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardsInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyboardsInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeYDelta(+5);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(+5);
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
