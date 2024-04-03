import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class GameLobbyView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private final JButton changeNameButton;
    private final JButton levelUpButton;
    private final JButton changeWeaponButton;
    private final JButton buyShopButton;
    private final JButton fastTravelButton;
    private final JButton exitGameButton;

    public GameLobbyView(Character character) {
        JLabel gameLobby = new JLabel("Game Lobby");
        gameLobby.setForeground(Color.ORANGE);
        gameLobby.setBounds(10,0,300,100);
        gameLobby.setFont(new Font("Garamond", Font.BOLD, 40));

        JLabel name = new JLabel("Name: " + character.getName());
        name.setForeground(Color.WHITE);
        name.setBounds(20,40,500,100);
        name.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel level = new JLabel("Level: " + character.getLevel());
        level.setForeground(Color.WHITE);
        level.setBounds(20,60,200,100);
        level.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel totalHP = new JLabel("Current HP: " + character.getCurrentHp());
        totalHP.setForeground(Color.WHITE);
        totalHP.setBounds(20,80,200,100);
        totalHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel HP = new JLabel("HP: " + character.getHp());
        HP.setForeground(Color.WHITE);
        HP.setBounds(20,100,200,100);
        HP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel DEX = new JLabel("DEX: " + character.getDex());
        DEX.setForeground(Color.WHITE);
        DEX.setBounds(20,120,200,100);
        DEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel INT = new JLabel("INT: " + character.getInte());
        INT.setForeground(Color.WHITE);
        INT.setBounds(20,140,200,100);
        INT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel END = new JLabel("END: " + character.getEnd());
        END.setForeground(Color.WHITE);
        END.setBounds(20,160,200,100);
        END.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel STR = new JLabel("STR: " + character.getStr());
        STR.setForeground(Color.WHITE);
        STR.setBounds(20,180,200,100);
        STR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel FTH = new JLabel("FTH: " + character.getFth());
        FTH.setForeground(Color.WHITE);
        FTH.setBounds(20,200,200,100);
        FTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel runes = new JLabel("Runes: " + character.getRunes());
        runes.setForeground(Color.WHITE);
        runes.setBounds(20,220,200,100);
        runes.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel changeName = new JLabel("Change name");
        changeName.setForeground(Color.WHITE);
        changeName.setBounds(540,45,200,100);
        changeName.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel levelUp = new JLabel("Level up");
        levelUp.setForeground(Color.WHITE);
        levelUp.setBounds(540,105,200,100);
        levelUp.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel changeWeapon = new JLabel("Equip weapon");
        changeWeapon.setForeground(Color.WHITE);
        changeWeapon.setBounds(540,165,200,100);
        changeWeapon.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel buyFromShop = new JLabel("Buy from shop");
        buyFromShop.setForeground(Color.WHITE);
        buyFromShop.setBounds(540,225,200,100);
        buyFromShop.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel fastTravel = new JLabel("Fast travel");
        fastTravel.setForeground(Color.WHITE);
        fastTravel.setBounds(540,285,200,100);
        fastTravel.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel exitGame = new JLabel("Exit game");
        exitGame.setForeground(Color.WHITE);
        exitGame.setBounds(540,345,200,100);
        exitGame.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel weaponName = new JLabel("Weapon: " + character.getEquiped().getName());
        weaponName.setForeground(Color.WHITE);
        weaponName.setBounds(20,260,200,100);
        weaponName.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponHP = new JLabel("Weapon HP: " + character.getEquiped().getHp());
        weaponHP.setForeground(Color.WHITE);
        weaponHP.setBounds(20,280,200,100);
        weaponHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponINT = new JLabel("Weapon INT: " + character.getEquiped().getInte());
        weaponINT.setForeground(Color.WHITE);
        weaponINT.setBounds(20,300,200,100);
        weaponINT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponEND = new JLabel("Weapon END: " + character.getEquiped().getEnd());
        weaponEND.setForeground(Color.WHITE);
        weaponEND.setBounds(20,320,200,100);
        weaponEND.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponSTR = new JLabel("Weapon STR: " + character.getEquiped().getStr());
        weaponSTR.setForeground(Color.WHITE);
        weaponSTR.setBounds(20,340,200,100);
        weaponSTR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponFTH = new JLabel("Weapon END: " + character.getEquiped().getFth());
        weaponFTH.setForeground(Color.WHITE);
        weaponFTH.setBounds(20,360,200,100);
        weaponFTH.setFont(new Font("Garamond", Font.BOLD, 20));

        changeNameButton = new JButton("1");
        changeNameButton.setFocusPainted(false);
        changeNameButton.setBounds(500,80,30,30);
        changeNameButton.setFont(new Font("Garamond", Font.BOLD,30));
        changeNameButton.setBorder(BorderFactory.createEtchedBorder());

        levelUpButton = new JButton("2");
        levelUpButton.setFocusPainted(false);
        levelUpButton.setBounds(500,140,30,30);
        levelUpButton.setFont(new Font("Garamond", Font.BOLD,30));
        levelUpButton.setBorder(BorderFactory.createEtchedBorder());

        changeWeaponButton = new JButton("3");
        changeWeaponButton.setFocusPainted(false);
        changeWeaponButton.setBounds(500,200,30,30);
        changeWeaponButton.setFont(new Font("Garamond", Font.BOLD,30));
        changeWeaponButton.setBorder(BorderFactory.createEtchedBorder());

        buyShopButton = new JButton("4");
        buyShopButton.setFocusPainted(false);
        buyShopButton.setBounds(500,260,30,30);
        buyShopButton.setFont(new Font("Garamond", Font.BOLD,30));
        buyShopButton.setBorder(BorderFactory.createEtchedBorder());

        fastTravelButton = new JButton("5");
        fastTravelButton.setFocusPainted(false);
        fastTravelButton.setBounds(500,320,30,30);
        fastTravelButton.setFont(new Font("Garamond", Font.BOLD,30));
        fastTravelButton.setBorder(BorderFactory.createEtchedBorder());

        exitGameButton = new JButton("6");
        exitGameButton.setFocusPainted(false);
        exitGameButton.setBounds(500,380,30,30);
        exitGameButton.setFont(new Font("Garamond", Font.BOLD,30));
        exitGameButton.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(gameLobby);
        mainFrame.add(name);
        mainFrame.add(level);
        mainFrame.add(totalHP);
        mainFrame.add(HP);
        mainFrame.add(DEX);
        mainFrame.add(INT);
        mainFrame.add(END);
        mainFrame.add(STR);
        mainFrame.add(FTH);
        mainFrame.add(runes);
        mainFrame.add(changeName);
        mainFrame.add(levelUp);
        mainFrame.add(changeWeapon);
        mainFrame.add(buyFromShop);
        mainFrame.add(fastTravel);
        mainFrame.add(exitGame);
        mainFrame.add(weaponName);
        mainFrame.add(weaponHP);
        mainFrame.add(weaponINT);
        mainFrame.add(weaponEND);
        mainFrame.add(weaponSTR);
        mainFrame.add(weaponFTH);
        mainFrame.add(changeNameButton);
        mainFrame.add(levelUpButton);
        mainFrame.add(changeWeaponButton);
        mainFrame.add(buyShopButton);
        mainFrame.add(fastTravelButton);
        mainFrame.add(exitGameButton);

        mainFrame.setVisible(true);
    }

    public void addChangeNameButtonActionListener(ActionListener listener) {
        changeNameButton.addActionListener(listener);
    }

    public void addLevelUpButtonActionListener(ActionListener listener){
        levelUpButton.addActionListener(listener);
    }

    public void addChangeWeaponButtonActionListener(ActionListener listener){
        changeWeaponButton.addActionListener(listener);
    }
    public void addBuyShopButtonActionListener(ActionListener listener) {
        buyShopButton.addActionListener(listener);
    }
    public void addFastTravelButtonActionListener(ActionListener listener){
        fastTravelButton.addActionListener(listener);
    }

    public void addExitGameButtonActionListener(ActionListener listener){
        exitGameButton.addActionListener(listener);
    }

    public void disposeFrame() {
        this.mainFrame.dispose();
    }

}
