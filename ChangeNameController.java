import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChangeNameController {

    private String selectedName;
    private final ChangeNameView changeNameView;
    ChangeNameController(Character character, ChangeNameModel changeNameModel) {
        this.changeNameView = new ChangeNameView();
        changeNameView.addCharacterNameFieldListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedName = changeNameView.getEnteredName();
            }
        });

        changeNameView.addConfirmButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    changeNameView.disposeFrame();
                    changeNameModel.changeName(selectedName, character);
                } else {
                    changeNameView.setFeedbackLabel("Kindly enter a name");
                }
            }
        });

        changeNameView.addReturnToGameLobbyListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeNameView.disposeFrame();
                changeNameModel.goBackGameLobby(character);
            }
        });

    }
}
