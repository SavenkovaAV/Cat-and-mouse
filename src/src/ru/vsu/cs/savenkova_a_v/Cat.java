package src.ru.vsu.cs.savenkova_a_v;

import java.awt.*;

public class Cat {
    private int x, y, r, width, height;
    private Color coatColor1, coatColor2, eyeColor;
    private boolean eyesClosed;

    public void setEyesClosed(boolean eyesClosed) {
        this.eyesClosed = eyesClosed;
    }

    public Cat(int x, int y, int r, int width, int height, Color coatColor1, Color coatColor2, Color eyeColor) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.width = width;
        this.height = height;
        this.coatColor1 = coatColor1;
        this.coatColor2 = coatColor2;
        this.eyeColor = eyeColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public void drawCat(Graphics2D g) {
        //Хвост
        g.setStroke(new BasicStroke(7));
        g.drawRect(x + 169, y + 130, r + 230, r - 35);
        g.drawOval(x + 451, y + 130, r - 35, r - 35);

        g.setColor(coatColor1);
        g.fillRect(x + 169, y + 130, r + 230, r - 35);
        g.fillOval(x + 451, y + 130, r - 35, r - 35);

        //Задние лапы
        drawPaw(g, x, y + height / 2, width / 7, height / 4, coatColor1);
        drawPaw(g, x + width / 3 * 2, y + height / 2, width / 7, height / 4, coatColor1);

        //Туловище
        g.setColor(coatColor1);
        g.fillOval(x + 20, y, width - 148, height - 5);
        g.setColor(Color.BLACK);
        g.drawOval(x + 20, y, width - 148, height - 5);

        g.setColor(coatColor2);
        g.fillOval(x + 169, y + 30, r + 50, r + 50);
        g.fillOval(x + 50, y + 30, r + 10, r + 10);

        //Передние лапы
        drawPaw(g, x + 60, y + 220,
                r, r - 15, coatColor2);
        drawPaw(g, x + 220, y + 220,
                r, r - 15, coatColor1);

        //Ушки
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[]{x + 105, x + 105, x + 175},
                new int[]{y + 210, y + 120, y + 150}, 3);
        g.drawPolygon(new int[]{x + 245, x + 245, x + 175},
                new int[]{y + 210, y + 120, y + 150}, 3);

        g.setColor(Color.PINK);
        g.fillPolygon(new int[]{x + 115, x + 115, x + 175},
                new int[]{y + 210, y + 130, y + 160}, 3);
        g.fillPolygon(new int[]{x + 235, x + 235, x + 175},
                new int[]{y + 210, y + 130, y + 160}, 3);

        //Голова
        g.setColor(coatColor1);
        g.fillOval(x + 105, y + height / 2, 2 * r, 2 * r);
        g.setColor(Color.BLACK);
        g.drawOval(x + 105, y + height / 2, 2 * r, 2 * r);

        //Глаза
        g.setColor(Color.BLACK);
        g.drawOval(x + 125, y + 195, width / 13, width / 45);
        g.drawOval(x + 185, y + 195, width / 13, width / 45);

        //Носик
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(3));
        g.drawOval((int) (x * 1.5), (int) (y * 2.375), width / 12, width / 13);
        g.drawOval((int) (x * 1.625), (int) (y * 2.375), width / 12, width / 13);
        g.drawPolygon(new int[]{x + 175, x + 165, x + 185}, new int[]{y + 227, y + 220, y + 220}, 3);
        g.setColor(Color.PINK);
        g.fillPolygon(new int[]{x + 175, x + 165, x + 185}, new int[]{y + 227, y + 220, y + 220}, 3);

        //Усики
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawLine(x + 140, y + 185, x + 90, y + 170);
        g.drawLine(x + 155, y + 185, x + 90, y + 150);
        g.drawLine(x + 200, y + 185, x + 250, y + 170);
        g.drawLine(x + 190, y + 185, x + 250, y + 150);

        g.drawLine(x + 165, y + 230, x + 90, y + 210);
        g.drawLine(x + 185, y + 230, x + 250, y + 210);
        g.drawLine(x + 165, y + 240, x + 90, y + 270);
        g.drawLine(x + 190, y + 240, x + 250, y + 270);
        g.drawLine(x + 170, y + 235, x + 80, y + 235);
        g.drawLine(x + 195, y + 235, x + 260, y + 235);

        if (eyesClosed) {
            openEyes(g);
        }
    }

    public void openEyes(Graphics2D g) {
        g.setColor(eyeColor);
        g.fillOval(x + 125, y + 195, width / 13, 10);
        g.fillOval(x + 185, y + 195, width / 13, 10);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(4));
        g.drawLine(x + 140, y + 195, x + 140, y + 205);
        g.drawLine(x + 200, y + 195, x + 200, y + 205);
    }

    private void drawPaw(Graphics2D g, int x, int y, int width, int height, Color color) {
        g.setStroke(new BasicStroke(3));
        g.setColor(color);
        g.fillOval(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, width, height);

        g.drawLine((width / 3) + x, y + height, (width / 3) + x, y + (height / 2));
        g.drawLine(2 * (width / 3) + x, y + height, 2 * (width / 3) + x, y + (height / 2));
    }
}
