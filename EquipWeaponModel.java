public class EquipWeaponModel {
    public EquipWeaponModel(Character character) {
        EquipWeaponController equipWeaponController = new EquipWeaponController(this, character);
    }

    public void equipWeapon(Character character, int i) {
        character.equipWeapon(i);
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }

    public void backToLobby(Character character) {
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
}
