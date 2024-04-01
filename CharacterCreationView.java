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
        characterNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = characterNameField.getText();
            }
        });





    }


}
