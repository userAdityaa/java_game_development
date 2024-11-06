package Inputs;

import org.example.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
    // MouseListener methods
    private GamePanel gamePanel;
    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Code to handle mouse click event
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Code to handle mouse press event
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Code to handle mouse release event
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Code to handle mouse entering a component
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Code to handle mouse exiting a component
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        // Code to handle mouse drag event
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        // Code to handle mouse movement
        gamePanel.setRectPos(e.getX(), e.getY());
    }
}
