import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChangeNameView {
    private final JFrame mainFrame = new JFrame("Elden Rouge: CCPROG3 MCO Cosing & Tujan");
    private JLabel feedbackLabel;
    private final JTextField characterNameField;
    private JButton confirm;
    private JButton backToGameLobby;
    public ChangeNameView() {
        JLabel changeName = new JLabel("Enter your new name");
        changeName.setForeground(Color.ORANGE);
        changeName.setBounds(170,70,500,100);
        changeName.setFont(new Font("Garamond", Font.BOLD,50));

        characterNameField = new JTextField();
        characterNameField.setBounds(325,175, 150,30);
        characterNameField.setBorder(BorderFactory.createEtchedBorder());

        this.feedbackLabel = new JLabel();
        this.feedbackLabel.setForeground(Color.RED);
        this.feedbackLabel.setBounds(320,250,200,100);
        this.feedbackLabel.setFont(new Font("Garamond", Font.BOLD, 20));

        confirm = new JButton("Confirm name");
        confirm.setFocusPainted(false);
        confirm.setBounds(300,250,200,30);
        confirm.setFont(new Font("Garamond", Font.BOLD,25));
        confirm .setBorder(BorderFactory.createEtchedBorder());

        backToGameLobby = new JButton("Return to Game Lobby");
        backToGameLobby.setFocusPainted(false);
        backToGameLobby.setBounds(25,350,175,40);
        backToGameLobby.setFont(new Font("Garamond", Font.BOLD,15));
        backToGameLobby.setBorder(BorderFactory.createEtchedBorder());

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);

        mainFrame.setLayout(null);
        mainFrame.setSize(800,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.add(changeName);
        mainFrame.add(characterNameField);
        mainFrame.add(feedbackLabel);
        mainFrame.add(confirm);
        mainFrame.add(backToGameLobby);

        mainFrame.setVisible(true);
    }

    public void addCharacterNameFieldListener(ActionListener listener) {
        characterNameField.addActionListener(listener);
    }

    public void addConfirmButtonListener(ActionListener listener) {
        confirm.addActionListener(listener);
    }

    public void addReturnToGameLobbyListener(ActionListener listener) {
        backToGameLobby.addActionListener(listener);
    }

    public void setFeedbackLabel(String text) {
        feedbackLabel.setText(text);
    }

    public String getEnteredName() {
        return characterNameField.getText();
    }

    public void disposeFrame () {
        this.mainFrame.dispose();
    }


}
