public class GameLobbyModel {
    public GameLobbyModel(Character character) {
        GameLobbyController gameLobbyController = new GameLobbyController(this, character);
    }

    public void goToChangeName(Character character) {
        ChangeNameModel changeNameModel = new ChangeNameModel(character);
    }

    public void goToLevelUp(Character character) {
        LevelUpModel levelUpModel = new LevelUpModel(character);
    }

    public void goToEquipWeapon(Character character) {
        EquipWeaponModel equipWeaponModel = new EquipWeaponModel(character);
    }

    public void goToShop(Character character) {
        //ShopModel1 shopeModel1 = new ShopModel1();
    }

    public void goToFastTravel(Character character) {
        //FasTravelModel fastTravelModel = new FastTravelModel();
    }

    public void goToTitle() {
        TitleScreenModel titleScreenModel = new TitleScreenModel();
    }
}
