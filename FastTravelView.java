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
    private final JButton area3TP2;
    private JButton goBack;
    public FastTravelView(Character character){
        JLabel fastTravel = new JLabel("Fast Travel");
        fastTravel.setForeground(Color.ORANGE);
        fastTravel.setBounds(250,250,400,100);
        fastTravel.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel stormveilCastle = new JLabel("Stormveil Castle");
        stormveilCastle.setForeground(Color.WHITE);
        stormveilCastle.setBounds(250,250,400,100);
        stormveilCastle.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel rayaLucariaAcademy = new JLabel("Raya Lucaria Academy");
        rayaLucariaAcademy.setForeground(Color.WHITE);
        rayaLucariaAcademy.setBounds(250,250,400,100);
        rayaLucariaAcademy.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel theEldenThrone = new JLabel("The Elden Throne");
        theEldenThrone.setForeground(Color.WHITE);
        theEldenThrone.setBounds(250,250,400,100);
        theEldenThrone.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area1TP1Text = new JLabel("Warp Tile 1");
        area1TP1Text.setForeground(Color.WHITE);
        area1TP1Text.setBounds(250,250,400,100);
        area1TP1Text.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area1TP2Text = new JLabel("Warp Tile 2");
        area1TP2Text.setForeground(Color.WHITE);
        area1TP2Text.setBounds(250,250,400,100);
        area1TP2Text.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area2TP1Text = new JLabel("Warp Tile 1");
        area2TP1Text.setForeground(Color.WHITE);
        area2TP1Text.setBounds(250,250,400,100);
        area2TP1Text.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area2TP2Text = new JLabel("Warp Tile 2");
        area2TP2Text.setForeground(Color.WHITE);
        area2TP2Text.setBounds(250,250,400,100);
        area2TP2Text.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area3TP1Text = new JLabel("Warp Tile 1");
        area3TP1Text.setForeground(Color.WHITE);
        area3TP1Text.setBounds(250,250,400,100);
        area3TP1Text.setFont(new Font("Garamond", Font.BOLD, 25));

        JLabel area3TP2Text = new JLabel("Warp Tile 2");
        area3TP2Text.setForeground(Color.WHITE);
        area2TP2Text.setBounds(250,250,400,100);
        area3TP2Text.setFont(new Font("Garamond", Font.BOLD, 25));

        area1TP1 = new JButton("-");
        area1TP1.setFocusPainted(false);
        area1TP1.setBounds(325,420,15,15);
        area1TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area1TP1.setBorder(BorderFactory.createEtchedBorder());

        area1TP2 = new JButton("-");
        area1TP2.setFocusPainted(false);
        area1TP2.setBounds(325,420,150,25);
        area1TP2.setFont(new Font("Garamond", Font.BOLD,15));
        area1TP2.setBorder(BorderFactory.createEtchedBorder());

        area2TP1 = new JButton("-");
        area2TP1.setFocusPainted(false);
        area2TP1.setBounds(325,420,150,25);
        area2TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area2TP1.setBorder(BorderFactory.createEtchedBorder());

        area2TP2 = new JButton("-");
        area2TP2.setFocusPainted(false);
        area2TP2.setBounds(325,420,150,25);
        area2TP2.setFont(new Font("Garamond", Font.BOLD,15));

        area3TP1 = new JButton("-");
        area3TP1.setFocusPainted(false);
        area3TP1.setBounds(325,420,150,25);
        area3TP1.setFont(new Font("Garamond", Font.BOLD,15));
        area3TP1.setBorder(BorderFactory.createEtchedBorder());
        area3TP1.setBorder(BorderFactory.createEtchedBorder());

        area3TP2 = new JButton("-");
        area3TP2.setFocusPainted(false);
        area3TP2.setBounds(325,420,150,25);
        area3TP2.setFont(new Font("Garamond", Font.BOLD,15));
        area3TP2.setBorder(BorderFactory.createEtchedBorder());

        goBack = new JButton("Return to Game Lobby");
        goBack.setFocusPainted(false);
        goBack.setBounds(325,420,150,25);
        goBack.setFont(new Font("Garamond", Font.BOLD,15));
        goBack.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(320,380,200,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 20));

        mainFrame.add(fastTravel);
        mainFrame.add(stormveilCastle);
        mainFrame.add(rayaLucariaAcademy);
        mainFrame.add(theEldenThrone);
        mainFrame.add(area1TP1Text);
        mainFrame.add(area1TP2Text);
        mainFrame.add(area2TP1Text);
        mainFrame.add(area2TP2Text);
        mainFrame.add(area3TP1Text);
        mainFrame.add(area3TP2Text);
        mainFrame.add(area1TP1);
        mainFrame.add(area1TP2);
        mainFrame.add(area2TP1);
        mainFrame.add(area2TP2);
        mainFrame.add(area3TP1);
        mainFrame.add(area3TP2);
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
    public void addArea3TP2ActionListener(ActionListener listener){
        area3TP2.addActionListener(listener);
    }
    public void addGoBackActionListener(ActionListener listener){
        goBack.addActionListener(listener);
    }
    public void disposeFrame(){
        this.mainFrame.dispose();
    }
}
