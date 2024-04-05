public class FastTravelModel {
    public FastTravelModel(Character character) {
        FastTravelController fastTravelController = new FastTravelController(this, character);
    }
    public void travelArea1TP1(Character character){
        character.fastTravelToArea(1,1);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void travelArea1TP2(Character character){
        character.fastTravelToArea(1,2);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void travelArea2TP1(Character character){
        character.fastTravelToArea(2,1);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void travelArea2TP2(Character character){
        character.fastTravelToArea(2,2);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void travelArea3TP1(Character character){
        character.fastTravelToArea(3,1);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void backToGameLobby(Character character){
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
}
