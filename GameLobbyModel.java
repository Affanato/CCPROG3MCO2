public class GameLobbyModel {
    public GameLobbyModel(Character character) {
        GameLobbyController gameLobbyController = new GameLobbyController(this, character);
    }
}
