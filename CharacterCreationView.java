import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class CharacterCreationView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private final JTextField characterNameField;
    private JLabel feedbackLabel;
    private final JButton job1;
    private final JButton job2;
    private final JButton job3;
    private final JButton job4;
    private final JButton job5;
    private final JButton job6;
    private final JButton backToTitle;
    public CharacterCreationView() {
        JLabel characterCreation = new JLabel("Character Creation");
        characterCreation.setForeground(Color.ORANGE);
        characterCreation.setBounds(200,0,400,100);
        characterCreation.setFont(new Font("Garamond", Font.BOLD,50));

        JLabel enterName = new JLabel("Enter Character Name");
        enterName.setForeground(Color.WHITE);
        enterName.setBounds(300,50,400,100);
        enterName.setFont(new Font("Garamond", Font.BOLD, 20));

        characterNameField = new JTextField();
        characterNameField.setBounds(325,120, 150,30);
        characterNameField.setBorder(BorderFactory.createEtchedBorder());

        JLabel selectAJob = new JLabel("Select a job");
        selectAJob.setForeground(Color.WHITE);
        selectAJob.setBounds(350,130,200,100);
        selectAJob.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vagabond = new JLabel("Vagabond");
        vagabond.setForeground(Color.WHITE);
        vagabond.setBounds(20,200,200,100);
        vagabond.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel vLevel = new JLabel("Level: 9");
        vLevel.setForeground(Color.WHITE);
        vLevel.setBounds(20,230,200,100);
        vLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vHP = new JLabel("HP : 15");
        vHP.setForeground(Color.WHITE);
        vHP.setBounds(20,250,200,100);
        vHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vDEX = new JLabel("DEX: 13");
        vDEX.setForeground(Color.WHITE);
        vDEX.setBounds(20,270,200,100);
        vDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vINT = new JLabel("INT:  9");
        vINT.setForeground(Color.WHITE);
        vINT.setBounds(20,290,200,100);
        vINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vEND = new JLabel("END: 11");
        vEND.setForeground(Color.WHITE);
        vEND.setBounds(20,310,200,100);
        vEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vSTR = new JLabel("STR: 14");
        vSTR.setForeground(Color.WHITE);
        vSTR.setBounds(20,330,200,100);
        vSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel vFTH = new JLabel("FTH:  9");
        vFTH.setForeground(Color.WHITE);
        vFTH.setBounds(20,350,200,100);
        vFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel samurai = new JLabel("Samurai");
        samurai.setForeground(Color.WHITE);
        samurai.setBounds(145,200,200,100);
        samurai.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel sLevel = new JLabel("Level: 9");
        sLevel.setForeground(Color.WHITE);
        sLevel.setBounds(145,230,200,100);
        sLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sHP = new JLabel("HP : 12");
        sHP.setForeground(Color.WHITE);
        sHP.setBounds(145,250,200,100);
        sHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sDEX = new JLabel("DEX: 15");
        sDEX.setForeground(Color.WHITE);
        sDEX.setBounds(145,270,200,100);
        sDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sINT = new JLabel("INT:  9");
        sINT.setForeground(Color.WHITE);
        sINT.setBounds(145,290,200,100);
        sINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sEND = new JLabel("END: 13");
        sEND.setForeground(Color.WHITE);
        sEND.setBounds(145,310,200,100);
        sEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sSTR = new JLabel("STR: 12");
        sSTR.setForeground(Color.WHITE);
        sSTR.setBounds(145,330,200,100);
        sSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel sFTH = new JLabel("FTH:  8");
        sFTH.setForeground(Color.WHITE);
        sFTH.setBounds(145,350,200,100);
        sFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel warrior = new JLabel("Warrior");
        warrior.setForeground(Color.WHITE);
        warrior.setBounds(270,200,200,100);
        warrior.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel wLevel = new JLabel("Level: 8");
        wLevel.setForeground(Color.WHITE);
        wLevel.setBounds(270,230,200,100);
        wLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wHP = new JLabel("HP : 11");
        wHP.setForeground(Color.WHITE);
        wHP.setBounds(270,250,200,100);
        wHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wDEX = new JLabel("DEX: 16");
        wDEX.setForeground(Color.WHITE);
        wDEX.setBounds(270,270,200,100);
        wDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wINT = new JLabel("INT: 10");
        wINT.setForeground(Color.WHITE);
        wINT.setBounds(270,290,200,100);
        wINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wEND = new JLabel("END: 11");
        wEND.setForeground(Color.WHITE);
        wEND.setBounds(270,310,200,100);
        wEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wSTR = new JLabel("STR: 10");
        wSTR.setForeground(Color.WHITE);
        wSTR.setBounds(270,330,200,100);
        wSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel wFTH = new JLabel("FTH:  8");
        wFTH.setForeground(Color.WHITE);
        wFTH.setBounds(270,350,200,100);
        wFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hero = new JLabel("Hero");
        hero.setForeground(Color.WHITE);
        hero.setBounds(395,200,200,100);
        hero.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel hLevel = new JLabel("Level: 7");
        hLevel.setForeground(Color.WHITE);
        hLevel.setBounds(395,230,200,100);
        hLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hHP = new JLabel("HP : 14");
        hHP.setForeground(Color.WHITE);
        hHP.setBounds(395,250,200,100);
        hHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hDEX = new JLabel("DEX:  9");
        hDEX.setForeground(Color.WHITE);
        hDEX.setBounds(395,270,200,100);
        hDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hINT = new JLabel("INT:  7");
        hINT.setForeground(Color.WHITE);
        hINT.setBounds(395,290,200,100);
        hINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hEND = new JLabel("END: 12");
        hEND.setForeground(Color.WHITE);
        hEND.setBounds(395,310,200,100);
        hEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hSTR = new JLabel("STR: 16");
        hSTR.setForeground(Color.WHITE);
        hSTR.setBounds(395,330,200,100);
        hSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel hFTH = new JLabel("FTH:  8");
        hFTH.setForeground(Color.WHITE);
        hFTH.setBounds(395,350,200,100);
        hFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel astrologer = new JLabel("Astrologer");
        astrologer.setForeground(Color.WHITE);
        astrologer.setBounds(520,200,200,100);
        astrologer.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel aLevel = new JLabel("Level: 6");
        aLevel.setForeground(Color.WHITE);
        aLevel.setBounds(520,230,200,100);
        aLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aHP = new JLabel("HP :  9");
        aHP.setForeground(Color.WHITE);
        aHP.setBounds(520,250,200,100);
        aHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aDEX = new JLabel("DEX: 12");
        aDEX.setForeground(Color.WHITE);
        aDEX.setBounds(520,270,200,100);
        aDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aINT = new JLabel("INT: 16");
        aINT.setForeground(Color.WHITE);
        aINT.setBounds(520,290,200,100);
        aINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aEND = new JLabel("END:  9");
        aEND.setForeground(Color.WHITE);
        aEND.setBounds(520,310,200,100);
        aEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aSTR = new JLabel("STR:  8");
        aSTR.setForeground(Color.WHITE);
        aSTR.setBounds(520,330,200,100);
        aSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel aFTH = new JLabel("FTH:  7");
        aFTH.setForeground(Color.WHITE);
        aFTH.setBounds(520,350,200,100);
        aFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel prophet = new JLabel("Prophet");
        prophet.setForeground(Color.WHITE);
        prophet.setBounds(645,200,200,100);
        prophet.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel pLevel = new JLabel("Level: 7");
        pLevel.setForeground(Color.WHITE);
        pLevel.setBounds(645,230,200,100);
        pLevel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pHP = new JLabel("HP : 10");
        pHP.setForeground(Color.WHITE);
        pHP.setBounds(645,250,200,100);
        pHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pDEX = new JLabel("DEX: 10");
        pDEX.setForeground(Color.WHITE);
        pDEX.setBounds(645,270,200,100);
        pDEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pINT = new JLabel("INT:  7");
        pINT.setForeground(Color.WHITE);
        pINT.setBounds(645,290,200,100);
        pINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pEND = new JLabel("END:  8");
        pEND.setForeground(Color.WHITE);
        pEND.setBounds(645,310,200,100);
        pEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pSTR = new JLabel("STR: 11");
        pSTR.setForeground(Color.WHITE);
        pSTR.setBounds(645,330,200,100);
        pSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel pFTH = new JLabel("FTH: 16");
        pFTH.setForeground(Color.WHITE);
        pFTH.setBounds(645,350,200,100);
        pFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        job1 = new JButton("1");
        job1.setFocusPainted(false);
        job1.setBounds(20,200,30,30);
        job1.setFont(new Font("Garamond", Font.BOLD,30));
        job1.setBorder(BorderFactory.createEtchedBorder());

        job2 = new JButton("2");
        job2.setFocusPainted(false);
        job2.setBounds(145,200,30,30);
        job2.setFont(new Font("Garamond", Font.BOLD,30));
        job2.setBorder(BorderFactory.createEtchedBorder());

        job3 = new JButton("3");
        job3.setFocusPainted(false);
        job3.setBounds(270,200,30,30);
        job3.setFont(new Font("Garamond", Font.BOLD,30));
        job3.setBorder(BorderFactory.createEtchedBorder());

        job4 = new JButton("4");
        job4.setFocusPainted(false);
        job4.setBounds(395,200,30,30);
        job4.setFont(new Font("Garamond", Font.BOLD,30));
        job4.setBorder(BorderFactory.createEtchedBorder());

        job5 = new JButton("5");
        job5.setFocusPainted(false);
        job5.setBounds(520,200,30,30);
        job5.setFont(new Font("Garamond", Font.BOLD,30));
        job5.setBorder(BorderFactory.createEtchedBorder());

        job6 = new JButton("6");
        job6.setFocusPainted(false);
        job6.setBounds(645,200,30,30);
        job6.setFont(new Font("Garamond", Font.BOLD,30));
        job6.setBorder(BorderFactory.createEtchedBorder());

        backToTitle = new JButton("Return to Title");
        backToTitle.setFocusPainted(false);
        backToTitle.setBounds(20,420,125,25);
        backToTitle.setFont(new Font("Garamond", Font.BOLD,15));
        backToTitle.setBorder(BorderFactory.createEtchedBorder());

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(320,380,200,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 20));

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(characterCreation);
        mainFrame.add(enterName);
        mainFrame.add(characterNameField);
        mainFrame.add(selectAJob);
        mainFrame.add(vagabond);
        mainFrame.add(vLevel);
        mainFrame.add(vHP);
        mainFrame.add(vDEX);
        mainFrame.add(vINT);
        mainFrame.add(vEND);
        mainFrame.add(vSTR);
        mainFrame.add(vFTH);
        mainFrame.add(samurai);
        mainFrame.add(sLevel);
        mainFrame.add(sHP);
        mainFrame.add(sDEX);
        mainFrame.add(sINT);
        mainFrame.add(sEND);
        mainFrame.add(sSTR);
        mainFrame.add(sFTH);
        mainFrame.add(warrior);
        mainFrame.add(wLevel);
        mainFrame.add(wHP);
        mainFrame.add(wDEX);
        mainFrame.add(wINT);
        mainFrame.add(wEND);
        mainFrame.add(wSTR);
        mainFrame.add(wFTH);
        mainFrame.add(hero);
        mainFrame.add(hLevel);
        mainFrame.add(hHP);
        mainFrame.add(hDEX);
        mainFrame.add(hINT);
        mainFrame.add(hEND);
        mainFrame.add(hSTR);
        mainFrame.add(hFTH);
        mainFrame.add(astrologer);
        mainFrame.add(aLevel);
        mainFrame.add(aHP);
        mainFrame.add(aDEX);
        mainFrame.add(aINT);
        mainFrame.add(aEND);
        mainFrame.add(aSTR);
        mainFrame.add(aFTH);
        mainFrame.add(prophet);
        mainFrame.add(pLevel);
        mainFrame.add(pHP);
        mainFrame.add(pDEX);
        mainFrame.add(pINT);
        mainFrame.add(pEND);
        mainFrame.add(pSTR);
        mainFrame.add(pFTH);
        mainFrame.add(job1);
        mainFrame.add(job2);
        mainFrame.add(job3);
        mainFrame.add(job4);
        mainFrame.add(job5);
        mainFrame.add(job6);
        mainFrame.add(backToTitle);
        mainFrame.add(this.feedbackLabel);

        mainFrame.setVisible(true);
    }

    public void addCharacterNameFieldListener(ActionListener listener) {
        characterNameField.addActionListener(listener);
    }
    public void addJob1Listener(ActionListener listener) {
        job1.addActionListener(listener);
    }

    public void addJob2Listener(ActionListener listener) {
        job2.addActionListener(listener);
    }

    public void addJob3Listener(ActionListener listener) {
        job3.addActionListener(listener);
    }

    public void addJob4Listener(ActionListener listener) {
        job4.addActionListener(listener);
    }

    public void addJob5Listener(ActionListener listener) {
        job5.addActionListener(listener);
    }

    public void addJob6Listener(ActionListener listener) {
        job6.addActionListener(listener);
    }

    public void addBackToTitleListener(ActionListener listener) {
        backToTitle.addActionListener(listener);
    }

    public String getEnteredName() {
        return characterNameField.getText();
    }

    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }

    public void disposeFrame () {
        this.mainFrame.dispose();
    }

}