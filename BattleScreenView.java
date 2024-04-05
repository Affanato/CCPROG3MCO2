import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class BattleScreenView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JButton physicalAttackButton;
    private JButton sorceryAttackButton;
    private JButton incantationAttackButton;
    private JButton dodgeButton;
    private JLabel feedbackLabel;
    public BattleScreenView(Character character, Enemy enemy){
        JLabel battling = new JLabel("Battle Screen");
        battling.setForeground(Color.ORANGE);
        battling.setBounds(10,-20,500,100);
        battling.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel currentHP = new JLabel("HP: " + character.getCurrentHp() + "/" + character.getMaxHp());
        currentHP.setForeground(Color.ORANGE);
        currentHP.setBounds(10,20,500,100);
        currentHP.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel enemyName = new JLabel(enemy.getName());
        enemyName.setForeground(Color.ORANGE);
        enemyName.setBounds(400,20,500,100);
        enemyName.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel enemyHP = new JLabel("HP: " + enemy.getEnemyActualHealth());
        enemyHP.setForeground(Color.ORANGE);
        enemyHP.setBounds(400,60,500,100);
        enemyHP.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel physicalAttackText = new JLabel("Physical Attack");
        physicalAttackText.setForeground(Color.WHITE);
        physicalAttackText.setBounds(90,255,500,20);
        physicalAttackText.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel sorceryAttackText = new JLabel("Sorcery Attack");
        sorceryAttackText.setForeground(Color.WHITE);
        sorceryAttackText.setBounds(90,295,500,20);
        sorceryAttackText.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel incantationAttackText = new JLabel("Incantation Attack");
        incantationAttackText.setForeground(Color.WHITE);
        incantationAttackText.setBounds(90,335,500,20);
        incantationAttackText.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel dodgeText = new JLabel("Dodge");
        dodgeText.setForeground(Color.WHITE);
        dodgeText.setBounds(90,375,500,20);
        dodgeText.setFont(new Font("Garamond", Font.BOLD,20));

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(400,225,400,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 15));

        physicalAttackButton = new JButton();
        physicalAttackButton.setFocusPainted(false);
        physicalAttackButton.setBounds(50,250,30,30);
        physicalAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        physicalAttackButton.setBorder(BorderFactory.createEtchedBorder());

        sorceryAttackButton = new JButton();
        sorceryAttackButton.setFocusPainted(false);
        sorceryAttackButton.setBounds(50,290,30,30);
        sorceryAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        sorceryAttackButton.setBorder(BorderFactory.createEtchedBorder());

        incantationAttackButton = new JButton();
        incantationAttackButton.setFocusPainted(false);
        incantationAttackButton.setBounds(50,330,30,30);
        incantationAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        incantationAttackButton.setBorder(BorderFactory.createEtchedBorder());

        dodgeButton = new JButton();
        dodgeButton.setFocusPainted(false);
        dodgeButton.setBounds(50,370,30,30);
        dodgeButton.setFont(new Font("Garamond", Font.BOLD,20));
        dodgeButton.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(battling);
        mainFrame.add(currentHP);
        mainFrame.add(enemyName);
        mainFrame.add(enemyHP);
        mainFrame.add(physicalAttackText);
        mainFrame.add(sorceryAttackText);
        mainFrame.add(incantationAttackText);
        mainFrame.add(dodgeText);
        mainFrame.add(feedbackLabel);
        mainFrame.add(physicalAttackButton);
        mainFrame.add(sorceryAttackButton);
        mainFrame.add(incantationAttackButton);
        mainFrame.add(dodgeButton);

        mainFrame.setVisible(true);
    }

    public void addPhysicalAttackButtonActionListener(ActionListener listener){
        physicalAttackButton.addActionListener(listener);
    }

    public void addSorceryAttackButtonActionListener(ActionListener listener){
        sorceryAttackButton.addActionListener(listener);
    }
    public void addIncantationAttackButtonActionListener(ActionListener listener){
        incantationAttackButton.addActionListener(listener);
    }
    public void addDodgeButtonActionListener(ActionListener listener){
        dodgeButton.addActionListener(listener);
    }
    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }
    public void disposeFrame(){
        mainFrame.dispose();
    }
}
