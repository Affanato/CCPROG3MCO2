import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EquipWeaponView {
    private JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private int weaponNum;
    private JLabel feedbackLabel;
    private ArrayList<JButton> inventoryButtons = new ArrayList<>();
    private JButton exitButton;
    public EquipWeaponView(Character character) {
        this.weaponNum = character.getInventory().size();
        int yAdder = 0;

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(true);
        mainFrame.setLocationRelativeTo(null);

        JLabel inventory = new JLabel("Inventory");
        inventory.setForeground(Color.ORANGE);
        inventory.setBounds(30,0,500,100);
        inventory.setFont(new Font("Garamond", Font.BOLD,30));

        for (int i = 0; i < weaponNum; i += 5) {
            JButton button1 = new JButton("+");
            button1.setFocusPainted(false);
            button1.setBounds(20,90 + yAdder,15,15);
            button1.setFont(new Font("Garamond", Font.BOLD,15));
            button1.setBorder(BorderFactory.createEtchedBorder());

            JLabel weaponName1 = new JLabel(character.getInventory().get(i).getName());
            weaponName1.setForeground(Color.WHITE);
            weaponName1.setBounds(20,105 + yAdder,200,10);
            weaponName1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponHP1 = new JLabel("HP: " + character.getInventory().get(i).getHp());
            weaponHP1.setForeground(Color.WHITE);
            weaponHP1.setBounds(20,115 + yAdder,200,10);
            weaponHP1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponDEX1 = new JLabel("DEX Req: " + character.getInventory().get(i).getDexReq());
            weaponDEX1.setForeground(Color.WHITE);
            weaponDEX1.setBounds(20,125 + yAdder,200,10);
            weaponDEX1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponINT1 = new JLabel("INT: " + character.getInventory().get(i).getInte());
            weaponINT1.setForeground(Color.WHITE);
            weaponINT1.setBounds(20,135 +yAdder,200,10);
            weaponINT1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponEND1 = new JLabel("END: " + character.getInventory().get(i).getEnd());
            weaponEND1.setForeground(Color.WHITE);
            weaponEND1.setBounds(20,145 + yAdder,200,10);
            weaponEND1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponSTR1 = new JLabel("STR: " + character.getInventory().get(i).getStr());
            weaponSTR1.setForeground(Color.WHITE);
            weaponSTR1.setBounds(20,155 + yAdder,200,10);
            weaponSTR1.setFont(new Font("Garamond", Font.BOLD, 10));

            JLabel weaponFTH1 = new JLabel("FTH: " + character.getInventory().get(i).getFth());
            weaponFTH1.setForeground(Color.WHITE);
            weaponFTH1.setBounds(20,165 + yAdder,200,10);
            weaponFTH1.setFont(new Font("Garamond", Font.BOLD, 10));

            inventoryButtons.add(button1);

            mainFrame.add(button1);
            mainFrame.add(weaponName1);
            mainFrame.add(weaponHP1);
            mainFrame.add(weaponDEX1);
            mainFrame.add(weaponINT1);
            mainFrame.add(weaponEND1);
            mainFrame.add(weaponSTR1);
            mainFrame.add(weaponFTH1);

            if(i + 1 < weaponNum) {
                JButton button2 = new JButton("+");
                button2.setFocusPainted(false);
                button2.setBounds(180,90 + yAdder,15,15);
                button2.setFont(new Font("Garamond", Font.BOLD,15));
                button2.setBorder(BorderFactory.createEtchedBorder());

                JLabel weaponName2 = new JLabel(character.getInventory().get(i+1).getName());
                weaponName2.setForeground(Color.WHITE);
                weaponName2.setBounds(180,105 + yAdder,300,10);
                weaponName2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponHP2 = new JLabel("HP: " + character.getInventory().get(i+1).getHp());
                weaponHP2.setForeground(Color.WHITE);
                weaponHP2.setBounds(180,115 + yAdder,200,10);
                weaponHP2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponDEX2 = new JLabel("DEX Req: " + character.getInventory().get(i+1).getDexReq());
                weaponDEX2.setForeground(Color.WHITE);
                weaponDEX2.setBounds(180,125 + yAdder,200,10);
                weaponDEX2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponINT2 = new JLabel("INT: " + character.getInventory().get(i+1).getInte());
                weaponINT2.setForeground(Color.WHITE);
                weaponINT2.setBounds(180,135 +yAdder,200,10);
                weaponINT2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponEND2 = new JLabel("END: " + character.getInventory().get(i+1).getEnd());
                weaponEND2.setForeground(Color.WHITE);
                weaponEND2.setBounds(180,145 + yAdder,200,10);
                weaponEND2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponSTR2 = new JLabel("STR: " + character.getInventory().get(i+1).getStr());
                weaponSTR2.setForeground(Color.WHITE);
                weaponSTR2.setBounds(180,155 + yAdder,200,10);
                weaponSTR2.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponFTH2 = new JLabel("FTH: " + character.getInventory().get(i+1).getFth());
                weaponFTH2.setForeground(Color.WHITE);
                weaponFTH2.setBounds(180,165 + yAdder,200,10);
                weaponFTH2.setFont(new Font("Garamond", Font.BOLD, 10));

                inventoryButtons.add(button2);

                mainFrame.add(button2);
                mainFrame.add(weaponName2);
                mainFrame.add(weaponHP2);
                mainFrame.add(weaponDEX2);
                mainFrame.add(weaponINT2);
                mainFrame.add(weaponEND2);
                mainFrame.add(weaponSTR2);
                mainFrame.add(weaponFTH2);
            }

            if(i + 2 < weaponNum) {
                JButton button3 = new JButton("+");
                button3.setFocusPainted(false);
                button3.setBounds(340,90 + yAdder,15,15);
                button3.setFont(new Font("Garamond", Font.BOLD,15));
                button3.setBorder(BorderFactory.createEtchedBorder());

                JLabel weaponName3 = new JLabel(character.getInventory().get(i+2).getName());
                weaponName3.setForeground(Color.WHITE);
                weaponName3.setBounds(340,105 + yAdder,200,10);
                weaponName3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponHP3 = new JLabel("HP: " + character.getInventory().get(i+2).getHp());
                weaponHP3.setForeground(Color.WHITE);
                weaponHP3.setBounds(340,115 + yAdder,200,10);
                weaponHP3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponDEX3 = new JLabel("DEX Req: " + character.getInventory().get(i+2).getDexReq());
                weaponDEX3.setForeground(Color.WHITE);
                weaponDEX3.setBounds(340,125 + yAdder,200,10);
                weaponDEX3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponINT3 = new JLabel("INT: " + character.getInventory().get(i+2).getInte());
                weaponINT3.setForeground(Color.WHITE);
                weaponINT3.setBounds(340,135 +yAdder,200,10);
                weaponINT3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponEND3 = new JLabel("END: " + character.getInventory().get(i+2).getEnd());
                weaponEND3.setForeground(Color.WHITE);
                weaponEND3.setBounds(340,145 + yAdder,200,10);
                weaponEND3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponSTR3 = new JLabel("STR: " + character.getInventory().get(i+2).getStr());
                weaponSTR3.setForeground(Color.WHITE);
                weaponSTR3.setBounds(340,155 + yAdder,200,10);
                weaponSTR3.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponFTH3 = new JLabel("FTH: " + character.getInventory().get(i+2).getFth());
                weaponFTH3.setForeground(Color.WHITE);
                weaponFTH3.setBounds(340,165 + yAdder,200,10);
                weaponFTH3.setFont(new Font("Garamond", Font.BOLD, 10));

                inventoryButtons.add(button3);

                mainFrame.add(button3);
                mainFrame.add(weaponName3);
                mainFrame.add(weaponHP3);
                mainFrame.add(weaponDEX3);
                mainFrame.add(weaponINT3);
                mainFrame.add(weaponEND3);
                mainFrame.add(weaponSTR3);
                mainFrame.add(weaponFTH3);
            }

            if(i + 3 < weaponNum) {
                JButton button4 = new JButton("+");
                button4.setFocusPainted(false);
                button4.setBounds(500,90 + yAdder,15,15);
                button4.setFont(new Font("Garamond", Font.BOLD,15));
                button4.setBorder(BorderFactory.createEtchedBorder());

                JLabel weaponName4 = new JLabel(character.getInventory().get(i+3).getName());
                weaponName4.setForeground(Color.WHITE);
                weaponName4.setBounds(500,105 + yAdder,200,10);
                weaponName4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponHP4 = new JLabel("HP: " + character.getInventory().get(i+3).getHp());
                weaponHP4.setForeground(Color.WHITE);
                weaponHP4.setBounds(500,115 + yAdder,200,10);
                weaponHP4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponDEX4 = new JLabel("DEX Req: " + character.getInventory().get(i+3).getDexReq());
                weaponDEX4.setForeground(Color.WHITE);
                weaponDEX4.setBounds(500,125 + yAdder,200,10);
                weaponDEX4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponINT4 = new JLabel("INT: " + character.getInventory().get(i+3).getInte());
                weaponINT4.setForeground(Color.WHITE);
                weaponINT4.setBounds(500,135 +yAdder,200,10);
                weaponINT4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponEND4 = new JLabel("END: " + character.getInventory().get(i+3).getEnd());
                weaponEND4.setForeground(Color.WHITE);
                weaponEND4.setBounds(500,145 + yAdder,200,10);
                weaponEND4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponSTR4 = new JLabel("STR: " + character.getInventory().get(i+3).getStr());
                weaponSTR4.setForeground(Color.WHITE);
                weaponSTR4.setBounds(500,155 + yAdder,200,10);
                weaponSTR4.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponFTH4 = new JLabel("FTH: " + character.getInventory().get(i+3).getFth());
                weaponFTH4.setForeground(Color.WHITE);
                weaponFTH4.setBounds(500,165 + yAdder,200,10);
                weaponFTH4.setFont(new Font("Garamond", Font.BOLD, 10));

                inventoryButtons.add(button4);

                mainFrame.add(button4);
                mainFrame.add(weaponName4);
                mainFrame.add(weaponHP4);
                mainFrame.add(weaponDEX4);
                mainFrame.add(weaponINT4);
                mainFrame.add(weaponEND4);
                mainFrame.add(weaponSTR4);
                mainFrame.add(weaponFTH4);
            }

            if(i + 4 < weaponNum) {
                JButton button5 = new JButton("+");
                button5.setFocusPainted(false);
                button5.setBounds(660,90 + yAdder,15,15);
                button5.setFont(new Font("Garamond", Font.BOLD,15));
                button5.setBorder(BorderFactory.createEtchedBorder());

                JLabel weaponName5 = new JLabel(character.getInventory().get(i+4).getName());
                weaponName5.setForeground(Color.WHITE);
                weaponName5.setBounds(660,105 + yAdder,200,10);
                weaponName5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponHP5 = new JLabel("HP: " + character.getInventory().get(i+4).getHp());
                weaponHP5.setForeground(Color.WHITE);
                weaponHP5.setBounds(660,115 + yAdder,200,10);
                weaponHP5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponDEX5 = new JLabel("DEX Req: " + character.getInventory().get(i+4).getDexReq());
                weaponDEX5.setForeground(Color.WHITE);
                weaponDEX5.setBounds(660,125 + yAdder,200,10);
                weaponDEX5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponINT5 = new JLabel("INT: " + character.getInventory().get(i+4).getInte());
                weaponINT5.setForeground(Color.WHITE);
                weaponINT5.setBounds(660,135 +yAdder,200,10);
                weaponINT5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponEND5 = new JLabel("END: " + character.getInventory().get(i+4).getEnd());
                weaponEND5.setForeground(Color.WHITE);
                weaponEND5.setBounds(660,145 + yAdder,200,10);
                weaponEND5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponSTR5 = new JLabel("STR: " + character.getInventory().get(i+4).getStr());
                weaponSTR5.setForeground(Color.WHITE);
                weaponSTR5.setBounds(660,155 + yAdder,200,10);
                weaponSTR5.setFont(new Font("Garamond", Font.BOLD, 10));

                JLabel weaponFTH5 = new JLabel("FTH: " + character.getInventory().get(i+4).getFth());
                weaponFTH5.setForeground(Color.WHITE);
                weaponFTH5.setBounds(660,165 + yAdder,200,10);
                weaponFTH5.setFont(new Font("Garamond", Font.BOLD, 10));

                inventoryButtons.add(button5);

                mainFrame.add(button5);
                mainFrame.add(weaponName5);
                mainFrame.add(weaponHP5);
                mainFrame.add(weaponDEX5);
                mainFrame.add(weaponINT5);
                mainFrame.add(weaponEND5);
                mainFrame.add(weaponSTR5);
                mainFrame.add(weaponFTH5);
            }
            yAdder = yAdder + 90;
        }

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(510,45,400,20);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 12));

        exitButton = new JButton("Return to Game Lobby");
        exitButton.setFocusPainted(false);
        exitButton.setBounds(300,35,200,30);
        exitButton.setFont(new Font("Garamond", Font.BOLD,15));
        exitButton.setBorder(BorderFactory.createEtchedBorder());

        mainFrame.add(inventory);
        mainFrame.add(feedbackLabel);
        mainFrame.add(exitButton);

        mainFrame.setVisible(true);
    }

    public void addButtonActionListener(int index, ActionListener listener){
        inventoryButtons.get(index).addActionListener(listener);
    }
    public boolean getMetDexReq(int index, Character character) {
        return character.getDex() >= character.getInventory().get(index).getDexReq();
    }

    public void addExitButtonActionListener(ActionListener listener) {
        exitButton.addActionListener(listener);
    }

    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }

    public void disposeFrame () {
        this.mainFrame.dispose();
    }

}
