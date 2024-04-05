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
        battling.setBounds(10,20,500,100);
        battling.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel currentHP = new JLabel("HP: " + character.getCurrentHp() + "/" + character.getMaxHp());
        currentHP.setForeground(Color.ORANGE);
        currentHP.setBounds(10,20,500,100);
        battling.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel enemyName = new JLabel(enemy.getName());
        enemyName.setForeground(Color.ORANGE);
        enemyName.setBounds(10,20,500,100);
        enemyName.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel enemyHP = new JLabel(enemy.getName());
        enemyHP.setForeground(Color.ORANGE);
        enemyHP.setBounds(10,20,500,100);
        enemyHP.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel physicalAttackText = new JLabel("Physical Attack");
        physicalAttackText.setForeground(Color.ORANGE);
        physicalAttackText.setBounds(10,20,500,100);
        physicalAttackText.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel sorceryAttackText = new JLabel("Sorcery Attack");
        sorceryAttackText.setForeground(Color.ORANGE);
        sorceryAttackText.setBounds(10,20,500,100);
        sorceryAttackText.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel incantationAttackText = new JLabel("Incantation Attack");
        incantationAttackText.setForeground(Color.ORANGE);
        incantationAttackText.setBounds(10,20,500,100);
        incantationAttackText.setFont(new Font("Garamond", Font.BOLD,30));

        JLabel dodgeText = new JLabel("Dodge");
        dodgeText.setForeground(Color.ORANGE);
        dodgeText.setBounds(10,20,500,100);
        dodgeText.setFont(new Font("Garamond", Font.BOLD,30));

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(530,225,300,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 15));

        physicalAttackButton = new JButton();
        physicalAttackButton.setFocusPainted(false);
        physicalAttackButton.setBounds(570,150,50,50);
        physicalAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        physicalAttackButton.setBorder(BorderFactory.createEtchedBorder());

        sorceryAttackButton = new JButton();
        sorceryAttackButton.setFocusPainted(false);
        sorceryAttackButton.setBounds(570,150,50,50);
        sorceryAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        sorceryAttackButton.setBorder(BorderFactory.createEtchedBorder());

        incantationAttackButton = new JButton();
        incantationAttackButton.setFocusPainted(false);
        incantationAttackButton.setBounds(570,150,50,50);
        incantationAttackButton.setFont(new Font("Garamond", Font.BOLD,20));
        incantationAttackButton.setBorder(BorderFactory.createEtchedBorder());


        dodgeButton = new JButton();
        dodgeButton.setFocusPainted(false);
        dodgeButton.setBounds(570,150,50,50);
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
    private void disposeFrame(){
        mainFrame.dispose();
    }
}
