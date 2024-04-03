import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LevelUpView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private final JLabel feedbackLabel;
    private final JButton levelUpHP;
    private final JButton levelUpDEX;
    private final JButton levelUpINT;
    private final JButton levelUpEND;
    private final JButton levelUpSTR;
    private final JButton levelUpFTH;
    private final JButton backToGameLobby;
    public LevelUpView(Character character) {
        JLabel levelUpTitle = new JLabel("Level Up");
        levelUpTitle.setForeground(Color.ORANGE);
        levelUpTitle.setBounds(30,0,500,100);
        levelUpTitle.setFont(new Font("Garamond", Font.BOLD,40));

        JLabel currentLevel = new JLabel("Level: " + character.getLevel());
        currentLevel.setForeground(Color.WHITE);
        currentLevel.setBounds(230,60,500,25);
        currentLevel.setFont(new Font("Garamond", Font.BOLD,25));

        JLabel currentRunes = new JLabel("Current Runes: " + character.getRunes());
        currentRunes.setForeground(Color.WHITE);
        currentRunes.setBounds(230,90,500,25);
        currentRunes.setFont(new Font("Garamond", Font.BOLD,25));

        JLabel requiredRunes = new JLabel("Required Runes: " + character.getLevelReq());
        requiredRunes.setForeground(Color.WHITE);
        requiredRunes.setBounds(230,120,500,25);
        requiredRunes.setFont(new Font("Garamond", Font.BOLD,25));

        JLabel HP = new JLabel("HP: " + character.getHp());
        HP.setForeground(Color.WHITE);
        HP.setBounds(375,170,100,20);
        HP.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel DEX = new JLabel("DEX: " + character.getDex());
        DEX.setForeground(Color.WHITE);
        DEX.setBounds(375,200,100,20);
        DEX.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel INT = new JLabel("INT: " + character.getInte());
        INT.setForeground(Color.WHITE);
        INT.setBounds(375,230,100,20);
        INT.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel END = new JLabel("END: " + character.getEnd());
        END.setForeground(Color.WHITE);
        END.setBounds(375,260,100,20);
        END.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel STR = new JLabel("STR: " + character.getStr());
        STR.setForeground(Color.WHITE);
        STR.setBounds(375,290,100,20);
        STR.setFont(new Font("Garamond", Font.BOLD,20));

        JLabel  FTH = new JLabel("FTH: " + character.getFth());
        FTH.setForeground(Color.WHITE);
        FTH.setBounds(375,320,100,20);
        FTH.setFont(new Font("Garamond", Font.BOLD,20));

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(230,320,500,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 20));

        levelUpHP = new JButton("+");
        levelUpHP.setFocusPainted(false);
        levelUpHP.setBounds(280,170,20,20);
        levelUpHP.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpHP.setBorder(BorderFactory.createEtchedBorder());

        levelUpDEX = new JButton("+");
        levelUpDEX.setFocusPainted(false);
        levelUpDEX.setBounds(280,200,20,20);
        levelUpDEX.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpDEX.setBorder(BorderFactory.createEtchedBorder());

        levelUpINT = new JButton("+");
        levelUpINT.setFocusPainted(false);
        levelUpINT.setBounds(280,230,20,20);
        levelUpINT.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpINT.setBorder(BorderFactory.createEtchedBorder());

        levelUpEND = new JButton("+");
        levelUpEND.setFocusPainted(false);
        levelUpEND.setBounds(280,260,20,20);
        levelUpEND.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpEND.setBorder(BorderFactory.createEtchedBorder());

        levelUpSTR = new JButton("+");
        levelUpSTR.setFocusPainted(false);
        levelUpSTR.setBounds(280,290,20,20);
        levelUpSTR.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpSTR.setBorder(BorderFactory.createEtchedBorder());

        levelUpFTH = new JButton("+");
        levelUpFTH.setFocusPainted(false);
        levelUpFTH.setBounds(280,320,20,20);
        levelUpFTH.setFont(new Font("Garamond", Font.BOLD,20));
        levelUpFTH.setBorder(BorderFactory.createEtchedBorder());

        backToGameLobby = new JButton("Return to Game Lobby");
        backToGameLobby.setFocusPainted(false);
        backToGameLobby.setBounds(300,400,200,30);
        backToGameLobby.setFont(new Font("Garamond", Font.BOLD,15));
        backToGameLobby.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(levelUpTitle);
        mainFrame.add(currentLevel);
        mainFrame.add(currentRunes);
        mainFrame.add(requiredRunes);
        mainFrame.add(HP);
        mainFrame.add(DEX);
        mainFrame.add(INT);
        mainFrame.add(END);
        mainFrame.add(STR);
        mainFrame.add(FTH);
        mainFrame.add(feedbackLabel);
        mainFrame.add(levelUpHP);
        mainFrame.add(levelUpDEX);
        mainFrame.add(levelUpINT);
        mainFrame.add(levelUpEND);
        mainFrame.add(levelUpSTR);
        mainFrame.add(levelUpFTH);
        mainFrame.add(backToGameLobby);

        mainFrame.setVisible(true);
    }

    public void addLevelUpHPActionListener(ActionListener listener) {
        levelUpHP.addActionListener(listener);
    }

    public void addLevelUpDEXActionListener(ActionListener listener) {
        levelUpDEX.addActionListener(listener);
    }

    public void addLevelUpINTActionListener(ActionListener listener) {
        levelUpINT.addActionListener(listener);
    }

    public void addLevelUpENDActionListener(ActionListener listener) {
        levelUpEND.addActionListener(listener);
    }

    public void addLevelUpSTRActionListener(ActionListener listener) {
        levelUpSTR.addActionListener(listener);
    }

    public void addLevelUpFTHActionListener(ActionListener listener) {
        levelUpFTH.addActionListener(listener);
    }

    public void addBackToGameLobbyListener(ActionListener listener) {
        backToGameLobby.addActionListener(listener);
    }
    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }

    public void disposeFrame() {
        this.mainFrame.dispose();
    }

}
