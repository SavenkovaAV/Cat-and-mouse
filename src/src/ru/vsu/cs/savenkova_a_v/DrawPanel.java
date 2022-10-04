package src.ru.vsu.cs.savenkova_a_v;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private Timer timer;
    private int ticksFromStart = 600;

    private Cat cat;
    private Mouse mouse;
    private Background background;


    public DrawPanel(final int width, final int height, final int timerDelay) {
        timer = new Timer(timerDelay, this);
        timer.start();

        this.cat = new Cat(280, 160, 70, 445, 280, new Color(235, 160, 68),
                new Color(102, 62, 12), new Color(59, 204, 212));
        ;
        this.mouse = new Mouse(80, 320, 47, 115, 120,
                new Color(117, 117, 117), Color.YELLOW);
        this.background = new Background(new Color(81, 120, 71), new Color(89, 63, 63), 11, 25, 3);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D j2d = (Graphics2D) g;

        background.drawBackground(j2d);
        cat.drawCat(j2d);
        mouse.drawMouse(j2d);

        mouse.setX(ticksFromStart);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart--;
            cat.setEyesClosed(ticksFromStart < 290);
        }
    }
}

