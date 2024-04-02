public class TitleScreenModel {

    private TitleScreenController titleScreenController;


    public TitleScreenModel() {
        this.titleScreenController = new TitleScreenController(this);
    }

    public void gameStarter(int toggle) {  // TitleScreen
        if (toggle == 1) {
            CharacterCreationModel characterCreationController = new CharacterCreationModel();
        } else if (toggle == 0) {
            System.exit(0);
        }
    }


}
