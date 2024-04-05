public class AreaScreenModel {
    private AreaScreenController areaScreenController;
    public AreaScreenModel (Character character){
        this.areaScreenController = new AreaScreenController(this, character);
    }
    public void moveCharacter(Character character, char direction){
        character.moveTile(direction);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
    public void getTreasure(Character character){
        character.getTreasure();
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
        areaScreenModel.getAreaScreenController().getAreaScreenView().setFeedbackLabel("You found treasure");
    }
    public void battleEnemy(Character character){
        character.battlingEnemy();
    }
    public void battleBoss(Character character){
        character.battlingBoss();
    }
    public void travelBack(Character character){
        GameLobbyModel gameLobbyModel = new GameLobbyModel(character);
    }
    public void goCredits(){
        CreditsModel creditsModel = new CreditsModel();
    }
    public void travelDoor(Character character) {

        switch(character.getCurrentAreaIndex()) {
            case 1:
                if((character.getCurrentFloorNumber()) == 0 && (character.getCurrentTileIndex()) == 1) {
                    character.setCharacterLocation(1,1,45);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if ((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 45){
                    character.setCharacterLocation(1,0,1);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if ((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 3){
                    character.setCharacterLocation(1,2,32);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if ((character.getCurrentFloorNumber()) == 2 && (character.getCurrentTileIndex()) == 32){
                    character.setCharacterLocation(1,1,3);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                }
                break;
            case 2:
                if((character.getCurrentFloorNumber()) == 0 && (character.getCurrentTileIndex()) == 22) {
                    character.setCharacterLocation(2,1,1);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 1) {
                    character.setCharacterLocation(2, 0, 22);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 11) {
                    character.setCharacterLocation(2, 2, 15);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 2 && (character.getCurrentTileIndex()) == 15) {
                    character.setCharacterLocation(2, 1, 11);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 2 && (character.getCurrentTileIndex()) == 19) {
                    character.setCharacterLocation(2, 3, 6);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 3 && (character.getCurrentTileIndex()) == 6) {
                    character.setCharacterLocation(2, 2, 19);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 2 && (character.getCurrentTileIndex()) == 2) {
                    character.setCharacterLocation(2, 4, 52);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 4 && (character.getCurrentTileIndex()) == 52) {
                    character.setCharacterLocation(2, 2, 2);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                }
                break;
            case 3:
                if((character.getCurrentFloorNumber()) == 0 && (character.getCurrentTileIndex()) == 1) {
                    character.setCharacterLocation(3, 1, 45);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 45) {
                    character.setCharacterLocation(2, 0, 1);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if((character.getCurrentFloorNumber()) == 1 && (character.getCurrentTileIndex()) == 3) {
                character.setCharacterLocation(2, 2, 25);
                AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                } else if ((character.getCurrentFloorNumber()) == 2 && (character.getCurrentTileIndex()) == 25) {
                    character.setCharacterLocation(2, 1, 3);
                    AreaScreenModel areaScreenModel = new AreaScreenModel(character);
                }
                break;
        }
    }

    public AreaScreenController getAreaScreenController(){
        return this.areaScreenController;
    }
}
