import java.awt.*;

public class Bubble implements XmasShape {
    int x;
    int y;
    int width;
    int height;
    double scale;
    Color lineColor;
    Color fillColor;

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(fillColor);
        g2d.fillOval(0,0,this.width,this.height);
        g2d.setColor(lineColor);
        g2d.drawOval(0,0,this.width,this.height);
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(x,y);
        g2d.scale(scale,scale);
    }

    public Bubble(int x, int y, int width, int height, double scale, Color lineColor, Color fillColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }
}
