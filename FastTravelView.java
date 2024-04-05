import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FastTravelView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JLabel feedbackLabel;
    private final JButton area1TP1;
    private final JButton area1TP2;
    private final JButton area2TP1;
    private final JButton area2TP2;
    private final JButton area3TP1;
    private JButton goBack;
    public FastTravelView(Character character){
        JLabel fastTravel = new JLabel("Fast Travel");
        fastTravel.setForeground(Color.ORANGE);
        fastTravel.setBounds(40,20,400,100);
        fastTravel.setFont(new Font("Garamond", Font.BOLD, 40));

        JLabel stormveilCastle = new JLabel("Stormveil Castle");
        stormveilCastle.setForeground(Color.WHITE);
        stormveilCastle.setBounds(45,60,400,100);
        stormveilCastle.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel rayaLucariaAcademy = new JLabel("Raya Lucaria Academy");
        rayaLucariaAcademy.setForeground(Color.WHITE);
        rayaLucariaAcademy.setBounds(45,150,400,100);
        rayaLucariaAcademy.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel theEldenThrone = new JLabel("The Elden Throne");
        theEldenThrone.setForeground(Color.WHITE);
        theEldenThrone.setBounds(45,240,400,100);
        theEldenThrone.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area1TP1Text = new JLabel("Warp Tile 1");
        area1TP1Text.setForeground(Color.WHITE);
        area1TP1Text.setBounds(80,130,400,20);
        area1TP1Text.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel area1TP2Text = new JLabel("Warp Tile 2");
        area1TP2Text.setForeground(Color.WHITE);
        area1TP2Text.setBounds(80,160,400,20);
        area1TP2Text.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel area2TP1Text = new JLabel("Warp Tile 1");
        area2TP1Text.setForeground(Color.WHITE);
        area2TP1Text.setBounds(80,220,400,20);
        area2TP1Text.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel area2TP2Text = new JLabel("Warp Tile 2");
        area2TP2Text.setForeground(Color.WHITE);
        area2TP2Text.setBounds(80,250,400,20);
        area2TP2Text.setFont(new Font("Garamond", Font.BOLD, 20));

        JLabel area3TP1Text = new JLabel("Warp Tile 1");
        area3TP1Text.setForeground(Color.WHITE);
        area3TP1Text.setBounds(80,310,400,20);
        area3TP1Text.setFont(new Font("Garamond", Font.BOLD, 20));

        area1TP1 = new JButton();
        area1TP1.setFocusPainted(false);
        area1TP1.setBounds(50,130,20,20);
        area1TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area1TP1.setBorder(BorderFactory.createEtchedBorder());

        area1TP2 = new JButton();
        area1TP2.setFocusPainted(false);
        area1TP2.setBounds(50,160,20,20);
        area1TP2.setFont(new Font("Garamond", Font.BOLD,15));
        area1TP2.setBorder(BorderFactory.createEtchedBorder());

        area2TP1 = new JButton();
        area2TP1.setFocusPainted(false);
        area2TP1.setBounds(50,220,20,20);
        area2TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area2TP1.setBorder(BorderFactory.createEtchedBorder());

        area2TP2 = new JButton();
        area2TP2.setFocusPainted(false);
        area2TP2.setBounds(50,250,20,20);
        area2TP2.setFont(new Font("Garamond", Font.BOLD,15));
        area2TP2.setBorder(BorderFactory.createEtchedBorder());

        area3TP1 = new JButton();
        area3TP1.setFocusPainted(false);
        area3TP1.setBounds(50,310,20,20);
        area3TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area3TP1.setBorder(BorderFactory.createEtchedBorder());
        area3TP1.setBorder(BorderFactory.createEtchedBorder());

        goBack = new JButton("Return to Game Lobby");
        goBack.setFocusPainted(false);
        goBack.setBounds(300,420,200,25);
        goBack.setFont(new Font("Garamond", Font.BOLD,15));
        goBack.setBorder(BorderFactory.createEtchedBorder());

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(260,380,400,20);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 15));

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(fastTravel);
        mainFrame.add(stormveilCastle);
        mainFrame.add(rayaLucariaAcademy);
        mainFrame.add(theEldenThrone);
        mainFrame.add(area1TP1Text);
        mainFrame.add(area1TP2Text);
        mainFrame.add(area2TP1Text);
        mainFrame.add(area2TP2Text);
        mainFrame.add(area3TP1Text);
        mainFrame.add(area1TP1);
        mainFrame.add(area1TP2);
        mainFrame.add(area2TP1);
        mainFrame.add(area2TP2);
        mainFrame.add(area3TP1);
        mainFrame.add(goBack);

        mainFrame.add(feedbackLabel);

        mainFrame.setVisible(true);
    }
    public void addArea1TP1ActionListener(ActionListener listener){
        area1TP1.addActionListener(listener);
    }
    public void addArea1TP2ActionListener(ActionListener listener){
        area1TP2.addActionListener(listener);
    }
    public void addArea2TP1ActionListener(ActionListener listener){
        area2TP1.addActionListener(listener);
    }
    public void addArea2TP2ActionListener(ActionListener listener){
        area2TP2.addActionListener(listener);
    }
    public void addArea3TP1ActionListner(ActionListener listener){
        area3TP1.addActionListener(listener);
    }
    public void addGoBackActionListener(ActionListener listener){
        goBack.addActionListener(listener);
    }
    public boolean isA1TP2Active(Character character){
        return character.getAreas().get(1).getFloors().get(2).getTiles().get(2).getIsActive();
    }
    public boolean isA2TP2Active(Character character){
        return character.getAreas().get(2).getFloors().get(4).getTiles().get(3).getIsActive();
    }
    public boolean isA3TP1Active(Character character){
        return character.getBoss1Down() && character.getBoss2Down();
    }
    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }
    public void disposeFrame(){
        this.mainFrame.dispose();
    }
}
