import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TitleScreenView {
    private JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JButton startButton;
    private JButton exitButton;
    private JLabel titleHeader;

    public TitleScreenView () {
        titleHeader = new JLabel("Elden Rogue");
        titleHeader.setForeground(Color.ORANGE);
        titleHeader.setBounds(200,50,400,100);
        titleHeader.setFont(new Font("Garamond", Font.BOLD,70));

        startButton = new JButton("Start Game");
        startButton.setFocusPainted(false);
        startButton.setBounds(200,200,400,50);
        startButton.setFont(new Font("Garamond", Font.BOLD,50));
        startButton.setBorder(BorderFactory.createEtchedBorder());

        exitButton = new JButton("Exit Game");
        exitButton.setFocusPainted(false);
        exitButton.setBounds(200,300,400,50);
        exitButton.setFont(new Font("Garamond", Font.BOLD,50));
        exitButton.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(titleHeader);
        mainFrame.add(startButton);
        mainFrame.add(exitButton);

        mainFrame.setVisible(true);
    }

    public void addStartButtonListener(ActionListener listener) {
        startButton.addActionListener(listener);
    }
    public void addExitButtonListener(ActionListener listener) {
        exitButton.addActionListener(listener);
    }

    public void disposeFrame () {
        this.mainFrame.dispose();
    }

}
