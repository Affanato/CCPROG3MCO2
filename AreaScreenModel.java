public class AreaScreenModel {
    public AreaScreenModel (Character character){
        AreaScreenController areaScreenController = new AreaScreenController(this, character);
    }
    public void interactWithTile(Character character){

    }
    public void moveCharacter(Character character, char direction){
        character.moveTile(direction);
        AreaScreenModel areaScreenModel = new AreaScreenModel(character);
    }
}
