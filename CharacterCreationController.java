import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationController {
    private CharacterCreationView characterCreationView;

    public CharacterCreationController() {
        this.characterCreationView = new CharacterCreationView();
        characterCreationView.addCharacterNameFieldListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = characterCreationView.getEnteredName();
            }
        });

    }







}
