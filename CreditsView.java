import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class CreditsView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private final JButton returnToTitle;
    public CreditsView() {
        JLabel thankYou = new JLabel("Thank you for playing!");
        thankYou.setForeground(Color.WHITE);
        thankYou.setBounds(250,0,300,100);
        thankYou.setFont(new Font("Garamond", Font.BOLD, 30));

        JLabel eldenRouge = new JLabel("ELDEN ROUGE");
        eldenRouge.setForeground(Color.ORANGE);
        eldenRouge.setBounds(210,50,400,100);
        eldenRouge.setFont(new Font("Garamond", Font.BOLD, 50));

        JLabel developers = new JLabel("Developers");
        developers.setForeground(Color.ORANGE);
        developers.setBounds(340,100,200,100);
        developers.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel nio = new JLabel("TUJAN, Lucas Antonio V F.");
        nio.setForeground(Color.WHITE);
        nio.setBounds(250,200,400,100);
        nio.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel hannah = new JLabel("COSING, Ashley Hannah A.");
        hannah.setForeground(Color.WHITE);
        hannah.setBounds(250,250,400,100);
        hannah.setFont(new Font("Garamond", Font.BOLD, 25));

        returnToTitle = new JButton("Return to Title");
        returnToTitle.setFocusPainted(false);
        returnToTitle.setBounds(325,420,150,25);
        returnToTitle.setFont(new Font("Garamond", Font.BOLD,15));
        returnToTitle.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(thankYou);
        mainFrame.add(eldenRouge);
        mainFrame.add(developers);
        mainFrame.add(nio);
        mainFrame.add(hannah);
        mainFrame.add(returnToTitle);

        mainFrame.setVisible(true);
    }
    public void addReturnToTitleActionListener(ActionListener listener){
        returnToTitle.addActionListener(listener);
    }
    public void disposeFrame(){
        this.mainFrame.dispose();
    }
}
