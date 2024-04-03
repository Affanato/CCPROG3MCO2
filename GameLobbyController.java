public class GameLobbyController {
    private GameLobbyView gameLobbyView;
    public GameLobbyController(GameLobbyModel gameLobbyModel, Character character) {
        this.gameLobbyView = new GameLobbyView(character);
    }
}
