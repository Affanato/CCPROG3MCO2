import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class CharacterCreationView {
    private JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JLabel characterCreation;
    private JLabel enterName;
    private JTextField characterNameField;
    private JLabel selectAClass;
    private JLabel vagabond;
    private JLabel vLevel;
    private JLabel vHP;
    private JLabel vDEX;
    private JLabel vINT;
    private JLabel vEND;
    private JLabel vSTR;
    private JLabel vFTH;
    private JLabel samurai;
    private JLabel sLevel;
    private JLabel sHP;
    private JLabel sDEX;
    private JLabel sINT;
    private JLabel sEND;
    private JLabel sSTR;
    private JLabel sFTH;
    private JLabel warrior;
    private JLabel wLevel;
    private JLabel wHP;
    private JLabel wDEX;
    private JLabel wINT;
    private JLabel wEND;
    private JLabel wSTR;
    private JLabel wFTH;
    private JLabel hero;
    private JLabel hLevel;
    private JLabel hHP;
    private JLabel hDEX;
    private JLabel hINT;
    private JLabel hEND;
    private JLabel hSTR;
    private JLabel hFTH;
    private JLabel astrologer;
    private JLabel aLevel;
    private JLabel aHP;
    private JLabel aDEX;
    private JLabel aINT;
    private JLabel aEND;
    private JLabel aSTR;
    private JLabel aFTH;
    private JLabel prophet;
    private JLabel pLevel;
    private JLabel pHP;
    private JLabel pDEX;
    private JLabel pINT;
    private JLabel pEND;
    private JLabel pSTR;
    private JLabel pFTH;
    private JButton class1;
    private JButton class2;
    private JButton class3;
    private JButton class4;
    private JButton class5;
    private JButton class6;
    private JButton confirmAndGo;
    private JButton backToTitle;

    public CharacterCreationView() {
        characterCreation = new JLabel("Character Creation");
        characterCreation.setForeground(Color.ORANGE);
        characterCreation.setBounds(50,20,400,100);
        characterCreation.setFont(new Font("Garamond", Font.BOLD,70));

        enterName = new JLabel("Enter Character Name");
        enterName.setForeground(Color.WHITE);
        enterName.setBounds(50,50,200,100);
        enterName.setFont(new Font("Garamond", Font.BOLD, 30));

        characterNameField = new JTextField();
        characterNameField.setBounds(50,80, 300,100);
        characterNameField.setBorder(BorderFactory.createEtchedBorder());

        selectAClass = new JLabel("Select a Class");
        selectAClass.setForeground(Color.WHITE);
        selectAClass.setBounds(50,50,200,100);
        selectAClass.setFont(new Font("Garamond", Font.BOLD, 30));

        vagabond = new JLabel("Vagabond");
        vagabond.setForeground(Color.WHITE);
        vagabond.setBounds(50,50,200,100);
        vagabond.setFont(new Font("Garamond", Font.BOLD, 30));

        vLevel = new JLabel("Level: 9");
        vLevel.setForeground(Color.WHITE);
        vLevel.setBounds(50,50,200,100);
        vLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        vHP = new JLabel("HP : 15");
        vHP.setForeground(Color.WHITE);
        vHP.setBounds(50,50,200,100);
        vHP.setFont(new Font("Garamond", Font.BOLD, 30));

        vDEX = new JLabel("DEX: 13");
        vDEX.setForeground(Color.WHITE);
        vDEX.setBounds(50,50,200,100);
        vDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        vINT = new JLabel("INT:  9");
        vINT.setForeground(Color.WHITE);
        vINT.setBounds(50,50,200,100);
        vINT.setFont(new Font("Garamond", Font.BOLD, 30));

        vEND = new JLabel("END: 11");
        vEND.setForeground(Color.WHITE);
        vEND.setBounds(50,50,200,100);
        vEND.setFont(new Font("Garamond", Font.BOLD, 30));

        vSTR = new JLabel("STR: 14");
        vSTR.setForeground(Color.WHITE);
        vSTR.setBounds(50,50,200,100);
        vSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        vFTH = new JLabel("FTH:  9");
        vFTH.setForeground(Color.WHITE);
        vFTH.setBounds(50,50,200,100);
        vFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        samurai = new JLabel("Samurai");
        samurai.setForeground(Color.WHITE);
        samurai.setBounds(50,50,200,100);
        samurai.setFont(new Font("Garamond", Font.BOLD, 30));

        sLevel = new JLabel("Level: 9");
        sLevel.setForeground(Color.WHITE);
        sLevel.setBounds(50,50,200,100);
        sLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        sHP = new JLabel("HP : 12");
        sHP.setForeground(Color.WHITE);
        sHP.setBounds(50,50,200,100);
        sHP.setFont(new Font("Garamond", Font.BOLD, 30));

        sDEX = new JLabel("DEX: 15");
        sDEX.setForeground(Color.WHITE);
        sDEX.setBounds(50,50,200,100);
        sDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        sINT = new JLabel("INT:  9");
        sINT.setForeground(Color.WHITE);
        sINT.setBounds(50,50,200,100);
        sINT.setFont(new Font("Garamond", Font.BOLD, 30));

        sEND = new JLabel("END: 13");
        sEND.setForeground(Color.WHITE);
        sEND.setBounds(50,50,200,100);
        sEND.setFont(new Font("Garamond", Font.BOLD, 30));

        sSTR = new JLabel("STR: 12");
        sSTR.setForeground(Color.WHITE);
        sSTR.setBounds(50,50,200,100);
        sSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        sFTH = new JLabel("FTH:  8");
        sFTH.setForeground(Color.WHITE);
        sFTH.setBounds(50,50,200,100);
        sFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        warrior = new JLabel("Warrior");
        warrior.setForeground(Color.WHITE);
        warrior.setBounds(50,50,200,100);
        warrior.setFont(new Font("Garamond", Font.BOLD, 30));

        wLevel = new JLabel("Level: 8");
        wLevel.setForeground(Color.WHITE);
        wLevel.setBounds(50,50,200,100);
        wLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        wHP = new JLabel("HP : 11");
        wHP.setForeground(Color.WHITE);
        wHP.setBounds(50,50,200,100);
        wHP.setFont(new Font("Garamond", Font.BOLD, 30));

        wDEX = new JLabel("DEX: 16");
        wDEX.setForeground(Color.WHITE);
        wDEX.setBounds(50,50,200,100);
        wDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        wINT = new JLabel("INT: 10");
        wINT.setForeground(Color.WHITE);
        wINT.setBounds(50,50,200,100);
        wINT.setFont(new Font("Garamond", Font.BOLD, 30));

        wEND = new JLabel("END: 11");
        wEND.setForeground(Color.WHITE);
        wEND.setBounds(50,50,200,100);
        wEND.setFont(new Font("Garamond", Font.BOLD, 30));

        wSTR = new JLabel("STR: 10");
        wSTR.setForeground(Color.WHITE);
        wSTR.setBounds(50,50,200,100);
        wSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        wFTH = new JLabel("FTH:  8");
        wFTH.setForeground(Color.WHITE);
        wFTH.setBounds(50,50,200,100);
        wFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        hero = new JLabel("Hero");
        hero.setForeground(Color.WHITE);
        hero.setBounds(50,50,200,100);
        hero.setFont(new Font("Garamond", Font.BOLD, 30));

        hLevel = new JLabel("Level: 7");
        hLevel.setForeground(Color.WHITE);
        hLevel.setBounds(50,50,200,100);
        hLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        hHP = new JLabel("HP : 14");
        hHP.setForeground(Color.WHITE);
        hHP.setBounds(50,50,200,100);
        hHP.setFont(new Font("Garamond", Font.BOLD, 30));

        hDEX = new JLabel("DEX:  9");
        hDEX.setForeground(Color.WHITE);
        hDEX.setBounds(50,50,200,100);
        hDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        hINT = new JLabel("INT:  7");
        hINT.setForeground(Color.WHITE);
        hINT.setBounds(50,50,200,100);
        hINT.setFont(new Font("Garamond", Font.BOLD, 30));

        hEND = new JLabel("END: 12");
        hEND.setForeground(Color.WHITE);
        hEND.setBounds(50,50,200,100);
        hEND.setFont(new Font("Garamond", Font.BOLD, 30));

        hSTR = new JLabel("STR: 16");
        hSTR.setForeground(Color.WHITE);
        hSTR.setBounds(50,50,200,100);
        hSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        hFTH = new JLabel("FTH:  8");
        hFTH.setForeground(Color.WHITE);
        hFTH.setBounds(50,50,200,100);
        hFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        astrologer = new JLabel("Astrologer");
        astrologer.setForeground(Color.WHITE);
        astrologer.setBounds(50,50,200,100);
        astrologer.setFont(new Font("Garamond", Font.BOLD, 30));

        aLevel = new JLabel("Level: 6");
        aLevel.setForeground(Color.WHITE);
        aLevel.setBounds(50,50,200,100);
        aLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        aHP = new JLabel("HP :  9");
        aHP.setForeground(Color.WHITE);
        aHP.setBounds(50,50,200,100);
        aHP.setFont(new Font("Garamond", Font.BOLD, 30));

        aDEX = new JLabel("DEX: 12");
        aDEX.setForeground(Color.WHITE);
        aDEX.setBounds(50,50,200,100);
        aDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        aINT = new JLabel("INT: 16");
        aINT.setForeground(Color.WHITE);
        aINT.setBounds(50,50,200,100);
        aINT.setFont(new Font("Garamond", Font.BOLD, 30));

        aEND = new JLabel("END:  9");
        aEND.setForeground(Color.WHITE);
        aEND.setBounds(50,50,200,100);
        aEND.setFont(new Font("Garamond", Font.BOLD, 30));

        aSTR = new JLabel("STR:  8");
        aSTR.setForeground(Color.WHITE);
        aSTR.setBounds(50,50,200,100);
        aSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        aFTH = new JLabel("FTH:  7");
        aFTH.setForeground(Color.WHITE);
        aFTH.setBounds(50,50,200,100);
        aFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        prophet = new JLabel("Prophet");
        prophet.setForeground(Color.WHITE);
        prophet.setBounds(50,50,200,100);
        prophet.setFont(new Font("Garamond", Font.BOLD, 30));

        pLevel = new JLabel("Level: 7");
        pLevel.setForeground(Color.WHITE);
        pLevel.setBounds(50,50,200,100);
        pLevel.setFont(new Font("Garamond", Font.BOLD, 30));

        pHP = new JLabel("HP : 10");
        pHP.setForeground(Color.WHITE);
        pHP.setBounds(50,50,200,100);
        pHP.setFont(new Font("Garamond", Font.BOLD, 30));

        pDEX = new JLabel("DEX: 10");
        pDEX.setForeground(Color.WHITE);
        pDEX.setBounds(50,50,200,100);
        pDEX.setFont(new Font("Garamond", Font.BOLD, 30));

        pINT = new JLabel("INT:  7");
        pINT.setForeground(Color.WHITE);
        pINT.setBounds(50,50,200,100);
        pINT.setFont(new Font("Garamond", Font.BOLD, 30));

        pEND = new JLabel("END:  8");
        pEND.setForeground(Color.WHITE);
        pEND.setBounds(50,50,200,100);
        pEND.setFont(new Font("Garamond", Font.BOLD, 30));

        pSTR = new JLabel("STR: 11");
        pSTR.setForeground(Color.WHITE);
        pSTR.setBounds(50,50,200,100);
        pSTR.setFont(new Font("Garamond", Font.BOLD, 30));

        pFTH = new JLabel("FTH: 16");
        pFTH.setForeground(Color.WHITE);
        aFTH.setBounds(50,50,200,100);
        aFTH.setFont(new Font("Garamond", Font.BOLD, 30));

        class1 = new JButton("1");
        class1.setFocusPainted(false);
        class1.setBounds(200,300,50,50);
        class1.setFont(new Font("Garamond", Font.BOLD,50));
        class1.setBorder(BorderFactory.createEtchedBorder());

        class2 = new JButton("2");
        class2.setFocusPainted(false);
        class2.setBounds(200,300,50,50);
        class2.setFont(new Font("Garamond", Font.BOLD,50));
        class2.setBorder(BorderFactory.createEtchedBorder());

        class3 = new JButton("3");
        class3.setFocusPainted(false);
        class3.setBounds(200,300,50,50);
        class3.setFont(new Font("Garamond", Font.BOLD,50));
        class3.setBorder(BorderFactory.createEtchedBorder());

        class4 = new JButton("4");
        class4.setFocusPainted(false);
        class4.setBounds(200,300,50,50);
        class4.setFont(new Font("Garamond", Font.BOLD,50));
        class4.setBorder(BorderFactory.createEtchedBorder());

        class5 = new JButton("5");
        class5.setFocusPainted(false);
        class5.setBounds(200,300,50,50);
        class5.setFont(new Font("Garamond", Font.BOLD,50));
        class5.setBorder(BorderFactory.createEtchedBorder());

        class6 = new JButton("6");
        class6.setFocusPainted(false);
        class6.setBounds(200,300,50,50);
        class6.setFont(new Font("Garamond", Font.BOLD,50));
        class6.setBorder(BorderFactory.createEtchedBorder());

        confirmAndGo = new JButton("Confirm");
        confirmAndGo.setFocusPainted(false);
        confirmAndGo.setBounds(200,300,50,50);
        confirmAndGo.setFont(new Font("Garamond", Font.BOLD,50));
        confirmAndGo.setBorder(BorderFactory.createEtchedBorder());

        backToTitle = new JButton("Return to Title");
        backToTitle.setFocusPainted(false);
        backToTitle.setBounds(200,300,50,50);
        backToTitle.setFont(new Font("Garamond", Font.BOLD,50));
        backToTitle.setBorder(BorderFactory.createEtchedBorder());

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
        mainFrame.add(selectAClass);
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
        mainFrame.add(class1);
        mainFrame.add(class2);
        mainFrame.add(class3);
        mainFrame.add(class4);
        mainFrame.add(class5);
        mainFrame.add(class6);
        mainFrame.add(confirmAndGo);
        mainFrame.add(backToTitle);

        mainFrame.setVisible(true);
    }

    public void addCharacterNameFieldListener(ActionListener listener) {
        characterNameField.addActionListener(listener);
    }
    public void addClass1Listener(ActionListener listener) {
        class1.addActionListener(listener);
    }

    public void addClass2Listener(ActionListener listener) {
        class2.addActionListener(listener);
    }

    public void addClass3Listener(ActionListener listener) {
        class3.addActionListener(listener);
    }

    public void addClass4Listener(ActionListener listener) {
        class4.addActionListener(listener);
    }

    public void addClass5Listener(ActionListener listener) {
        class5.addActionListener(listener);
    }

    public void addClass6Listener(ActionListener listener) {
        class6.addActionListener(listener);
    }

    public void addConfirmAndGoListener(ActionListener listener) {
        confirmAndGo.addActionListener(listener);
    }

    public void addBackToTitleListener(ActionListener listener) {
        backToTitle.addActionListener(listener);
    }

    public void disposeFrame () {
        this.mainFrame.dispose();
    }
}
