public class CharacterCreationModel {
    public CharacterCreationModel(){
        CharacterCreationController characterCreationController = new CharacterCreationController(this);
    }

    public void createCharacter (String name, int jobIndex){
        GameLobbyModel gameLobbyModel = new GameLobbyModel(new Character(name, jobIndex));
    }

}
