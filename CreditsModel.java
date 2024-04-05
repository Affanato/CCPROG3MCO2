public class CreditsModel {
    public CreditsModel(){
        CreditsController creditsController = new CreditsController(this);
    }
    public void returnToTitle(){
        TitleScreenModel titleScreenModel = new TitleScreenModel();
    }
}
