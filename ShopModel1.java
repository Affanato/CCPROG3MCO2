public class ShopModel1 {

    public ShopModel1(Character character) {
        Shop shop = new Shop();
        ShopController1 shopController1 = new ShopController1(this, character, shop);
    }

    public void buyWeapon(Character character, int i, Shop shop) {
        character.buyFromShop(shop, i);
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
    public void goToPage2(Character character){
        ShopModel2 shopModel2 = new ShopModel2(character);
    }
    public void backToLobby(Character character) {
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
}