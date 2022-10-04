package src.ru.vsu.cs.savenkova_a_v;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private DrawPanel dp;
    public MainWindow() throws HeadlessException {
        dp = new DrawPanel(this.getWidth(), this.getHeight(), 50);
        add(dp);
    }
}
