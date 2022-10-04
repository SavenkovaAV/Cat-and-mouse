package src.ru.vsu.cs.savenkova_a_v;

import java.awt.*;

public class Background {
    private Color colorOfWall, colorOfFloor;
    private int numOfLines, disBetweenLines, lineThickness;

    public Background(Color colorOfWall, Color colorOfFloor, int numOfLines, int disBetweenLines, int lineThickness) {
        this.colorOfWall = colorOfWall;
        this.colorOfFloor = colorOfFloor;
        this.numOfLines = numOfLines;
        this.disBetweenLines = disBetweenLines;
        this.lineThickness = lineThickness;
    }

    public void drawBackground(Graphics2D g) {
        fillColoredRect(g, colorOfFloor, colorOfFloor, 0, 300, 800, 400);
        fillColoredRect(g, colorOfWall, colorOfWall, 0, 0, 800, 300);

        drawFloorBoards(g, new Color(69, 36, 36), numOfLines, disBetweenLines,
                lineThickness, 0, 300, 800);

        fillColoredRect(g, new Color(199, 187, 187), new Color(61, 60, 60),
                0, 270, 800, 35);

        g.setColor(new Color(28, 20, 20));
        g.fillArc(160, 215, 120, 185, 360, 180);

        fillColoredRect(g, new Color(201, 180, 153), new Color(56, 37, 14),
                10, 30, 760, 50);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 37));
        g.setColor(Color.BLACK);
        g.drawString("Бесплатный сыр бывает только в мышеловке.", 35, 70);
    }

    private static void fillColoredRect(Graphics2D g, Color colorOfFigure, Color borderColor, int x, int y, int width, int height) {
        g.setColor(borderColor);
        g.drawRect(x, y, width, height);
        g.setColor(colorOfFigure);
        g.fillRect(x, y, width, height);
    }

    private static void drawFloorBoards (Graphics2D g, Color c, int numOfLines, int disBetweenLines, int lineThickness, int x1, int y, int x2) {
        g.setColor(c);
        g.setStroke(new BasicStroke(lineThickness));
        for(int i = 0; i< numOfLines; i++) {
            g.drawLine(x1, y, x2, y);
            y +=disBetweenLines;

        }
    }

}
