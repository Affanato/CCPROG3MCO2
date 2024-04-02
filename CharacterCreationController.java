import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationController {

    private String selectedName;
    private int selectedClassIndex;
    private CharacterCreationView characterCreationView;

    public CharacterCreationController(CharacterCreationModel characterCreationModel) {
        this.characterCreationView = new CharacterCreationView();
        characterCreationView.addCharacterNameFieldListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               selectedName = characterCreationView.getEnteredName();
            }
        });
        characterCreationView.addJob1Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 1;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob1Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 1;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob2Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 2;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob3Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 3;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob4Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 4;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob5Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 5;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addJob6Listener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedName != null) {
                    selectedClassIndex = 6;
                    characterCreationView.disposeFrame();
                    characterCreationModel.createCharacter(selectedName, selectedClassIndex);
                } else {
                    characterCreationView.setFeedbackLabel("Please enter a name");
                }
            }
        });

        characterCreationView.addBackToTitleListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                characterCreationView.disposeFrame();
                TitleScreenModel titleScreenModel = new TitleScreenModel();
            }
        });

    }

}
