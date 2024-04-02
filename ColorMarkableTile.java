import java.awt.Color;
import javax.swing.JButton;

public class ColorMarkableTile extends JButton implements Markable {

    private Color color = new Color (245, 24, 74);

    public ColorMarkableTile(JButton tile) {

    }

    public void mark() {
        this.setBackground(color);
    }

    public void unmark() {
        this.setBackground(new JButton().getBackground());
    }
}