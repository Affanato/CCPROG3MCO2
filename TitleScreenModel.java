public class TitleScreenModel {

    private TitleScreenController titleScreenController;
    //private

    public TitleScreenModel() {
        this.titleScreenController = new TitleScreenController(this);
    }

    public void gameStarter(int toggle) {  // TitleScreen
        if (toggle == 1) {
            CharacterCreationController characterCreationController = new CharacterCreationController();
        } else if (toggle == 0) {
            System.exit(0);
        }
    }


}
