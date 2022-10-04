package src.ru.vsu.cs.savenkova_a_v;

import java.awt.*;

public class Mouse {
    private int x, y, r, width, height;
    private Color colorMouse, colorCheese;

    public Mouse(int x, int y, int r, int width, int height, Color colorMouse, Color colorCheese) {
        this.x = x; //х левой задней лапки
        this.y = y; //у левого уха
        this.r = r; // радиус головы
        this.width = width; //ширина тела
        this.height = height; //высота тела
        this.colorMouse = colorMouse;
        this.colorCheese = colorCheese;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColorMouse(Color colorMouse) {
        this.colorMouse = colorMouse;
    }

    public void setColorCheese(Color colorCheese) {
        this.colorCheese = colorCheese;
    }

    public void drawMouse(Graphics2D g) {
        g.setStroke(new BasicStroke(3));

        //Хвост
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {x + 110, x + 110, x + 260}, new  int[] {y + 130, y + 125, y + 160}, 3);

        g.setColor(Color.PINK);
        g.fillPolygon(new int[] {x + 110, x + 110, x + 260}, new  int[] {y + 130, y + 125, y + 160}, 3);

        //Левое ухо
        g.setColor(colorMouse);
        g.rotate(120, x + 50, y + 40);
        g.fillOval(x, y, width - 80, height - 80);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, width - 80, height - 80);

        g.setColor(Color.PINK);
        g.fillOval(x + 5, y + 10, width - 90, height - 90);
        g.rotate(-120, x + 50, y + 40);

        //Левая нижняя лапка
        g.setColor(Color.BLACK);

        g.setStroke(new BasicStroke(6));
        g.drawOval(x, y + 160, width - 45, height - 110);

        g.setColor(Color.PINK);
        g.fillOval(x, y + 160, width - 45, height - 110);

        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawLine(x, y + 169, x + 30, y + 165);

        //Туловище и голова
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(6));
        g.drawOval(x + 20, y + 50, width, height);
        g.drawOval(x + 15, y + 10, 2 * r, 2 * r);
        g.setColor(colorMouse);
        g.fillOval(x + 20, y + 50, width, height);
        g.fillOval(x + 15, y + 10, 2 * r, 2 * r);

        //Мордочка
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(3));
        g.drawOval(x + 30, y + 40, width - 105, height - 105);
        g.drawOval(x + 45, y + 40, width - 105, height - 105);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5));
        g.drawOval(x + 35, y + 55, width - 108, height - 113);
        g.drawPolygon(new int[]{x + 40, x + 35, x + 47}, new int[]{y + 68, y + 73, y + 75}, 3);
        g.fillOval(x + 30, y + 40, width - 105, height - 105);
        g.fillOval(x + 45, y + 40, width - 105, height - 105);

        //Усики
        g.setStroke(new BasicStroke(2));
        g.drawLine(x + 35, y + 58, x + 20, y + 55);
        g.drawLine(x + 35, y + 58, x + 20, y + 60);

        g.drawLine(x + 42, y + 58, x + 62, y + 58);
        g.drawLine(x + 42, y + 58, x + 62, y + 63);

        g.setColor(Color.PINK);
        g.fillOval(x + 35, y + 55, width - 108, height - 113);
        g.fillPolygon(new int[]{x + 40, x + 35, x + 47}, new int[]{y + 68, y + 73, y + 75}, 3);

        //Правое ухо
        g.setColor(colorMouse);
        g.rotate(120, x + 105, y + 10);
        g.fillOval(x + 80, y, width - 80, height - 80);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(3));
        g.drawOval(x + 80, y, width - 80, height - 80);

        g.setColor(Color.PINK);
        g.fillOval(x + 85, y + 10, width - 90, height - 90);
        g.rotate(-120, x + 105, y + 10);

        //Сыр
        g.setColor(Color.BLACK);
        g.drawRect(x + 20, y + 100, width - 75, height - 70);

        g.setColor(colorCheese);
        g.fillRect(x + 20, y + 100, width - 75, height - 70);

        g.setColor(Color.ORANGE);
        g.fillOval(x + 23, y + 115, width - 105, height - 110);
        g.fillOval(x + 35, y + 110, width - 95, height - 100);
        g.fillOval(x + 25, y + 130, width - 100, height - 105);

        //Передние лапки
        g.setColor(colorMouse);
        g.fillOval(x + 10, y + 95, width - 100, height - 100);
        g.fillOval(x + 50, y + 95, width - 85, height - 100);

        g.setColor(Color.BLACK);
        g.drawOval(x + 10, y + 95, width - 100, height - 100);
        g.drawOval(x + 50, y + 95, width - 85, height - 100);

        //Правая задняя лапка
        g.setColor(Color.BLACK);
        g.rotate(-60, x + 100, y + 165);
        g.setStroke(new BasicStroke(6));
        g.drawOval(x + 75, y + 155, width - 45, height - 110);

        g.setColor(Color.PINK);
        g.fillOval(x + 75, y + 155, width - 45, height - 110);

        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.rotate(60, x + 100, y + 165);
        g.drawLine(x + 60, y + 183, x + 90, y + 173);

    }
}
