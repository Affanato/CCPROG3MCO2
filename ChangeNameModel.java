public class ChangeNameModel {

    public ChangeNameModel(Character character) {
            ChangeNameController changeNameController = new ChangeNameController(character, this);
    }

    public void changeName(String name, Character character) {
        character.changeName(name);
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }

    public void goBackGameLobby(Character character) {
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
}
