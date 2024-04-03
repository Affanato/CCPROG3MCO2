public class ShopModel2 {

    public ShopModel2(Character character) {
        Shop shop = new Shop();
        ShopController2 shopController2 = new ShopController2(this, character, shop);
    }

    public void buyWeapon(Character character, int i, Shop shop) {
        character.buyFromShop(shop, i + 15);
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
    public void goToPage1(Character character){
        ShopModel1 shopModel1 = new ShopModel1(character);
    }
    public void backToLobby(Character character) {
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
}