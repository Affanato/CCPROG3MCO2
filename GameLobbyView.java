import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class GameLobbyView {
    private final JFrame mainframe = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private final JButton changeNameButton;
    private final JButton levelUpButton;
    private final JButton changeWeaponButton;
    private final JButton buyShopButton;
    private final JButton fastTravelButton;
    private final JButton exitGameButton;

    public GameLobbyView(Character character) {
        JLabel gameLobby = new JLabel("Game Lobby");
        gameLobby.setForeground(Color.YELLOW);
        gameLobby.setBounds(20,0,200,100);
        gameLobby.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel name = new JLabel("Name: " + character.getName());
        name.setForeground(Color.WHITE);
        name.setBounds(20,10,200,100);
        name.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel level = new JLabel("Level: " + character.getLevel());
        level.setForeground(Color.WHITE);
        level.setBounds(20,20,200,100);
        level.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel totalHP = new JLabel("Current HP:" + character.getCurrentHp());
        totalHP.setForeground(Color.WHITE);
        totalHP.setBounds(20,0,200,100);
        totalHP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel HP = new JLabel("HP: " + character.getHp());
        HP.setForeground(Color.WHITE);
        HP.setBounds(20,0,200,100);
        HP.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel DEX = new JLabel("DEX: " + character.getDex());
        DEX.setForeground(Color.WHITE);
        DEX.setBounds(20,0,200,100);
        DEX.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel INT = new JLabel("INT: " + character.getInte());
        INT.setForeground(Color.WHITE);
        INT.setBounds(20,0,200,100);
        INT.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel END = new JLabel("END: " + character.getEnd());
        END.setForeground(Color.WHITE);
        END.setBounds(20,0,200,100);
        END.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel STR = new JLabel("STR: " + character.getStr());
        STR.setForeground(Color.WHITE);
        STR.setBounds(20,0,200,100);
        STR.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel FTH = new JLabel("FTH: " + character.getFth());
        FTH.setForeground(Color.WHITE);
        FTH.setBounds(20,0,200,100);
        FTH.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel runes = new JLabel("Runes: " + character.getRunes());
        runes.setForeground(Color.WHITE);
        runes.setBounds(20,0,200,100);
        runes.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel changeName = new JLabel("Change name");
        changeName.setForeground(Color.WHITE);
        changeName.setBounds(20,0,200,100);
        changeName.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel levelUp = new JLabel("Level up");
        levelUp.setForeground(Color.WHITE);
        levelUp.setBounds(20,0,200,100);
        levelUp.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel changeWeapon = new JLabel("Equip weapon");
        changeWeapon.setForeground(Color.WHITE);
        changeWeapon.setBounds(20,0,200,100);
        changeWeapon.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel buyFromShop = new JLabel("Buy from shop");
        buyFromShop.setForeground(Color.WHITE);
        buyFromShop.setBounds(20,0,200,100);
        buyFromShop.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel fastTravel = new JLabel("Fast travel");
        fastTravel.setForeground(Color.WHITE);
        fastTravel.setBounds(20,0,200,100);
        fastTravel.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel exitGame = new JLabel("Exit game");
        exitGame.setForeground(Color.WHITE);
        exitGame.setBounds(20,0,200,100);
        exitGame.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weaponName = new JLabel("Weapon: " + character.getEquiped().getName());
        buyFromShop.setForeground(Color.WHITE);
        buyFromShop.setBounds(20,0,200,100);
        buyFromShop.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel weapon = new JLabel("Buy from shop");
        buyFromShop.setForeground(Color.WHITE);
        buyFromShop.setBounds(20,0,200,100);
        buyFromShop.setFont(new Font("Garamond", Font.BOLD, 20));



        changeNameButton = new JButton("1");
        levelUpButton = new JButton("2");
        changeWeaponButton = new JButton("3");
        buyShopButton = new JButton("4");
        fastTravelButton = new JButton("5");
        exitGameButton = new JButton("6");

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
    public void addBuyShopButtonActionListener(Action listener) {
        buyShopButton.addActionListener(listener);
    }
    public void addFastTravelButtonActionListener(ActionListener listener){
        fastTravelButton.addActionListener(listener);
    }

    public void addExitGameButtonActionListener(ActionListener listener){
        exitGameButton.addActionListener(listener);
    }

    public void disposeFrame() {
        this.mainframe.dispose();
    }

}
