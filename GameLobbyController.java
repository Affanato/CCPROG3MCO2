import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLobbyController {
    private GameLobbyView gameLobbyView;
    public GameLobbyController(GameLobbyModel gameLobbyModel, Character character) {
        this.gameLobbyView = new GameLobbyView(character);

        gameLobbyView.addChangeNameButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToChangeName(character);
            }
        });

        gameLobbyView.addLevelUpButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToLevelUp(character);
            }
        });

        gameLobbyView.addChangeWeaponButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToEquipWeapon(character);
            }
        });

        gameLobbyView.addBuyShopButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToShop(character);
            }
        });

        gameLobbyView.addFastTravelButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToFastTravel(character);
            }
        });

        gameLobbyView.addExitGameButtonActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameLobbyView.disposeFrame();
                gameLobbyModel.goToTitle();
            }
        });
    }
}
