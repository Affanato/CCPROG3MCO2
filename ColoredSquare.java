import javax.swing.*;
import java.awt.*;

class ColoredSquare extends JPanel {
    private int x, y, width, height;
    private Color color;
    private String text;

    public ColoredSquare(int x, int y, int width, int height, Color color, String text) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.text = text;
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw colored square
        g.setColor(color);
        g.fillRect(0, 0, width, height);
        // Draw text
        g.setColor(Color.BLACK); // Change the color of the text if needed
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();
        int startX = (width - textWidth) / 2;
        int startY = (height - textHeight) / 2 + fm.getAscent();
        g.drawString(text, startX, startY);
    }
}
